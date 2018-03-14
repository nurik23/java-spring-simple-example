package kg.aiu.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greeting {
    @RequestMapping("/")
    public String greeting(){
        return "Hello world from Tansuluu Myrzaeva!";
    }
}
