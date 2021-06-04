package io.lcalmsky.demospringbootautoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class DemoSpringBootAutoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootAutoConfigApplication.class, args);
    }

}
