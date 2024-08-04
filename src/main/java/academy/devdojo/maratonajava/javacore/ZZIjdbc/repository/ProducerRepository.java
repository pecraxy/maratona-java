package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Rows affected: " + rowsAffected);
            log.info("Inserted producer in database, rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
