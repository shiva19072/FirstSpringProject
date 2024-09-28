package com.demo.studentmodule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class ViewController {

    // Serves index.html when visiting /index or the root URL /
    @GetMapping({"/", "/index"})
    public String index() {
        return "index"; // Returns index.html from the templates folder
    }

    @GetMapping("/indexgetall")
    public String indexGetAll() {
        return "indexgetall"; // Returns indexgetall.html
    }

    @GetMapping("/indexgetbyid")
    public String indexGetById() {
        return "indexgetbyid"; // Returns indexgetbyid.html
    }

    @GetMapping("/indexdelete")
    public String indexDelete() {
        return "indexdelete"; // Returns indexdelete.html
    }

    @GetMapping("/indexupdate")
    public String indexUpdate() {
        return "indexupdate"; // Returns indexupdate.html
    }

    @GetMapping("/indexpost")
    public String indexPost() {
        return "indexpost"; // Returns indexpost.html
    }
}
