package com.greenfox.frontend;

import com.greenfox.frontend.exceptions.MissingNameException;
import com.greenfox.frontend.exceptions.MissingTitleException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Rest {



    @RequestMapping(value = "/doubling", method = GET)
    public Json doubling(@RequestParam("input") Long number) {
        Json faka = new Json(number);
        return faka;
    }

    @ExceptionHandler(MissingTitleException.class)
    public Errormessage missingTitle() {
        return new Errormessage("Please provide a title!");
    }

    @RequestMapping("/greeter")
    public Student greeter(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) throws MissingNameException,MissingTitleException {
        Student student1 = new Student(name,title);
        if (name.equals("")) {
            throw new MissingNameException();
        } else if (title.equals("")) {
            throw new MissingTitleException();
        } return student1;
    }


}
