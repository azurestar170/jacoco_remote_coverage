package name.az170.sandbox.jr.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping("/")
    public String call(String route) {
        if ("A".equals(route)) {
            return "Account route A.";
        } else if ("B".equals(route)) {
            return "Account route B.";
        }
        return "Account no route.";
    }
}
