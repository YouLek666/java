package it.morfoza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by widzew on 2016-08-09.
 */
@Controller
public class CalculatorController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
