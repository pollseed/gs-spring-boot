package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    // routesのようなもの→肥大しないように、各コントローラとViewsを合わせる
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "hogehogehello!!!";
    }
    
}
