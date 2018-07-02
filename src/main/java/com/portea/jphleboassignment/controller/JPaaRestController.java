package com.portea.jphleboassignment.controller;

import com.portea.jphleboassignment.service.JPaaRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JPaaRestController  {

    private static final Logger LOG = LoggerFactory.getLogger(JPaaRestController.class);

    @Autowired
    private JPaaRestService jPaaRestService;


    private static final String PATH = "/error";

    @RequestMapping("/test")
    @ResponseBody
    public void test(){

        LOG.info("Test is testing");
        System.out.println("Tested");
        return;
    }

    @Bean
    @RequestMapping("/phlebo/assign")
    @ResponseBody
    public void assignPhlebo(){

        LOG.info("Request to assign phlebo");

        jPaaRestService.assignPhlebo();
        return;
    }


    public String getErrorPath() {
        return PATH;
    }
}