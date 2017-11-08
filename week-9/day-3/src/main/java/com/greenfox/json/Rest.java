package com.greenfox.json;

import com.greenfox.json.responses.AppendAResponse;
import com.greenfox.json.responses.DoublingResponse;
import com.greenfox.json.responses.GreeterResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
