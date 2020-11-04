package name.az170.sandbox.jr.storage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @RequestMapping("/")
    public String call(String route) {
        if ("A".equals(route)) {
            return "Storage route A.";
        } else if ("B".equals(route)) {
            return "Storage route B.";
        }
        return "Storage no route.";
    }
}
