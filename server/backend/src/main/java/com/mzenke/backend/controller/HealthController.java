package com.mzenke.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {
    @RequestMapping("/health")
    @ResponseBody
    public String hello() {
        return "service running";
    }
}
