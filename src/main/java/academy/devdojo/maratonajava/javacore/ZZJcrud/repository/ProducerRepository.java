package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
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
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name '{}'", name);
        String sql = "SELECT id, name FROM anime_store.producer WHERE NAME LIKE ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, sql, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to select producers", e);
        }
        return producers;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producer by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) Optional.empty();
            return Optional.of(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to select producers", e);
        }
        return Optional.empty();
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers..;");
        String sql = "SELECT id, name FROM anime_store.producer;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindAll(conn, sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to select producers", e);
        }
        return producers;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}'", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}'...", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'...", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, producer)) {
            ps.execute();
            log.info("Updated producer '{}'", producer.getId());
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }


    private static PreparedStatement createPrepareStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE `id` = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }


    private static PreparedStatement createPrepareStatementSave(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO  `anime_store`.`producer` (`name`) VALUES (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    private static PreparedStatement preparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?)";
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
        String sql = "SELECT id, name FROM anime_store.producer WHERE (id = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPrepareStatementFindAll(Connection connection, String sql) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        return ps;
    }
}
