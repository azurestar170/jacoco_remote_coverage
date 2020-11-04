package name.az170.sandbox.jr.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("/")
    public String call(String route) {
        if ("A".equals(route)) {
            return "Order route A.";
        } else if ("B".equals(route)) {
            return "Order route B.";
        }
        return "Order no route.";
    }
}
