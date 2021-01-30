package com.udemy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller with HttpServletRequest and Model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest httpServletRequest, Model model) {

        // read the req paramter from the HTML form
        String theName = httpServletRequest.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
