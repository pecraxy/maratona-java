package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding anime by name '{}'", name);
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON a.producer_id = p.id
                WHERE a.name LIKE ?;""";
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, sql, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Anime anime = buildAnimeByResultSet(rs);
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to select animes", e);
        }
        return animes;
    }

    private static Anime buildAnimeByResultSet(ResultSet rs) throws SQLException {
        Producer animeProducer = Producer.builder()
                .id(rs.getInt("producer_id"))
                .name(rs.getString("producer_name"))
                .build();
        return Anime.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .episodes(rs.getInt("episodes"))
                .producer(animeProducer)
                .build();
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding anime by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            return Optional.of(buildAnimeByResultSet(rs));
        } catch (SQLException e) {
            log.error("Error while trying to select animes", e);
        }
        return Optional.empty();
    }

    public static List<Anime> findAll() {
        log.info("Finding all animes...");
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON a.producer_id = p.id;""";
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindAll(conn, sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Anime anime = buildAnimeByResultSet(rs);
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to select animes", e);
        }
        return animes;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted anime '{}'", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);
        }
    }

    public static void save(Anime anime) {
        log.info("Saving anime '{}'...", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    public static void update(Anime anime) {
        log.info("Updating anime '{}'...", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, anime)) {
            ps.execute();
            log.info("Updated anime '{}'", anime.getId());
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }


    private static PreparedStatement createPrepareStatementUpdate(Connection connection, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes`= ? WHERE `id` = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }


    private static PreparedStatement createPrepareStatementSave(Connection connection, Anime anime) throws SQLException {
        String sql = "INSERT INTO  `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    private static PreparedStatement preparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    private static PreparedStatement createPrepareStatementFindByName(Connection connection, String sql, String name) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    private static PreparedStatement createPrepareStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON a.producer_id = p.id
                WHERE (a.id = ?);""";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPrepareStatementFindAll(Connection connection, String sql) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        return ps;
    }
}
