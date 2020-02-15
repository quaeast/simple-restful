package cn.quaeast.simplerestful.apis;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
//@CrossOrigin(origins="*")
public class SayHello {
    @GetMapping
    public String say(){
        return "hello";
    }
}
