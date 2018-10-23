package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.datasource.BlogDataSource;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	@Autowired
	private BlogDataSource blogDataSource;

    @RequestMapping(method = RequestMethod.GET)
    public String showPage(Model model){
        model.addAttribute("blog", blogDataSource.blogDescription);
        return "blog";
    }

}
