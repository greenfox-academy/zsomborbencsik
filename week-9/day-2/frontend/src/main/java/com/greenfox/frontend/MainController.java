package com.greenfox.frontend;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MainController {

    @RequestMapping("")
    public String indexPage() {
        return "index";
    }
}
