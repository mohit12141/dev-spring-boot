package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // create a request mapping for displaying html form
    @GetMapping("/showForm")
    public String showform(){
        return "helloworld-form";
    }

    // create a request mapping for processing form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }


    // controller to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String lestShoutLoud(HttpServletRequest request, Model model){

        // request data from the form
        String theName = request.getParameter("studentName");

        // convert to uppercase
        theName = theName.toUpperCase();

        // create the result data
        String result = "Yo !" + theName;

        // add result to model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                            Model model){


        // convert to uppercase
        theName = theName.toUpperCase();

        // create the result data
        String result = "Hey there my friend " + theName;

        // add result to model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
