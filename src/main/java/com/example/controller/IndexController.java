package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }
    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public String getHelloPage() {
        return "hello";
    }
}
