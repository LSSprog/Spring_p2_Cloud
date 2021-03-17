package ss.spring.cloud.prodocts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainAppRestProd {
    public static void main(String[] args) {
        SpringApplication.run(MainAppRestProd.class, args);
    }
}
