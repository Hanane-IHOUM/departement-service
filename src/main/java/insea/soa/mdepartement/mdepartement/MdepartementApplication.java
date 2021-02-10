package insea.soa.mdepartement.mdepartement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class MdepartementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdepartementApplication.class, args);
    }

}
