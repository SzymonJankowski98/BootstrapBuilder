package pl.put.poznan.bootstrap_builder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.bootstrap_builder.rest"})
public class BootstrapBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapBuilderApplication.class, args);
    }
}
