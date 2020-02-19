package cn.quaeast.simplerestful.apis;

import cn.quaeast.simplerestful.domain.People;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
//@CrossOrigin(origins="*")
public class HelloController {
    @GetMapping
    public String say(){
        return "hello";
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public People echo(@RequestBody People people){
        return people;
    }
}
