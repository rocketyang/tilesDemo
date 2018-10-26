package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(path="/test", method = RequestMethod.GET)
    public ModelAndView getTestPage() {
    	String[] floors = new String[] {"floor1", "floor2"};
        return new ModelAndView("test", "floors", floors);
    }
}
