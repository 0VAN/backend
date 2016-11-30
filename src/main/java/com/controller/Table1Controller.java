package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.service.Table1Service;

/**
 * Created by alex on 12/11/16.
 */

@RestController
@RequestMapping("/")
public class Table1Controller {
    @Autowired
    Table1Service table1Service;

    @CrossOrigin(origins = "http://localhost:4000")
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getAll(){
        return table1Service.getAll();
    }
}
