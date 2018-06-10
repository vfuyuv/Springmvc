package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @RequestMapping(value = "/testString",method = RequestMethod.GET)
    public String TestString(){
        return "hello spring mvc";
    }

}
