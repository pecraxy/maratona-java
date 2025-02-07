package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Dj Blakes Studio").build();
        Producer producerToUpdate = Producer.builder().id(1).name("Mario e Joanna estudios").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Zaza");
//        log.info(producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Dj Blakes Studio");
//        log.info(producers);
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Dj Leoo da 17");
//        log.info(producers);
//        ProducerService.findByNameAndDelete("Dj Leoo da 17");
//        ProducerRepository.updatePreparedStatement(producerToUpdate);

//        List<Producer> producers = ProducerService.findByNamePreparedStatement("");
//        log.info("Producers found '{}'", producers)

        List<Producer> producers = ProducerService.findByNameCallableStatement("Madhouse");
        log.info("Producers found '{}'", producers);

    }
}
