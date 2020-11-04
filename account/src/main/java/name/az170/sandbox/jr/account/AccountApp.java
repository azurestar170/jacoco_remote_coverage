package name.az170.sandbox.jr.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("name.az170.sandbox.jr.account")
public class AccountApp {
    public static void main(String[] args) {
        SpringApplication.run(AccountApp.class, args);
    }
}
