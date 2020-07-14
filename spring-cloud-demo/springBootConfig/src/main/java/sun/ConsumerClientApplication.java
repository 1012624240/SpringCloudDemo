package sun;

/**
 * @author ljw
 * @date 2020-07-13 14:12
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConsumerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
