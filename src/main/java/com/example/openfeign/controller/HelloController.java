package com.example.openfeign.controller;

import com.example.openfeign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloFeignService service;

    @RequestMapping("/search/github")
    public String searchGithubRepoByStr(@RequestParam("queryStr")String queryStr){
        return service.searchRepository(queryStr);
    }




}
