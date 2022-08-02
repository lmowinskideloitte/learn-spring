package com.deloitte.learnspring.sample.enterprise.flow.web;

import com.deloitte.learnspring.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    //  "/sum/" => 100
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }
}

