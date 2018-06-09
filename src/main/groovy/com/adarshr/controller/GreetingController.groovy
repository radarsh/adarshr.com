package com.adarshr.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GreetingController {

    @GetMapping("/greeting")
    String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, ModelMap model) {
        model.name = name

        'greeting'
    }
}
