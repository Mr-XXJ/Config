package com.xuxiaoji.client.clientdemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Value("${hello.text}")
    private String text;

    @GetMapping("/show")
    public String show(){
        return text;
    }
}
