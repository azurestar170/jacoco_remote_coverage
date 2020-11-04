package name.az170.sandbox.jr.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("name.az170.sandbox.jr.storage")
public class StorageApp {
    public static void main(String[] args) {
        SpringApplication.run(StorageApp.class, args);
    }
}
