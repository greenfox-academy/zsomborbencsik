package com.greenfox.json;

import com.greenfox.json.responses.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest {

    @RequestMapping("/doubling")
    public Object doubler(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new ErrorMessage("Please provide an input!");
        }
        return new DoublingResponse(input,input*2);
    }
    @RequestMapping("/greeter")
    public Object greeter(@RequestParam(required = false) String name, String title) {
        if (name == null) {
            return new ErrorMessage("Please provide a name!");
        } else if (title == null) {
            return new ErrorMessage("Please provide a title!");
        } return new GreeterResponse(name,title);
    }
    @RequestMapping("/appenda/{appendable}")
    public Object appendA(@PathVariable String appendable) {
        return new AppendAResponse(appendable);
    }
    @PostMapping(value = "/dountil/{what}", produces = "application/json")
    public  Object doUntil(@PathVariable String what, @RequestBody DoUntil until) {
        return new DoUntilResponse(until.getUntil(),what);
    }
    @PostMapping("/arrays")
    public Object arrays(@RequestBody(required = false) ArrayCalculator array) {
        if (array.getWhat() != null && array.getWhat().equals("double")) {
            return new ArrayResponse().doubleArrayElements(array.getNumbers());
        } else if (array.getWhat() == null || array.getNumbers().length == 0) {
            return new ErrorMessage("Please provide what to do with the numbers!");
        }
        return new ArrayResponse(array.getWhat(),array.getNumbers());
    }
}
