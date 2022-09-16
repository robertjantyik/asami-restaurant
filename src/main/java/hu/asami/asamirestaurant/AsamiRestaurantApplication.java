package hu.asami.asamirestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.asami" })
public class AsamiRestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsamiRestaurantApplication.class, args);
    }

}
