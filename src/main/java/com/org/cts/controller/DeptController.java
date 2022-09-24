package com.org.cts.controller;

import com.org.cts.model.Department;
import com.org.cts.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class DeptController {
    @Autowired
    DeptService deptService;
    @PostMapping("/create")
    public void addDept(@RequestBody Department department){
        deptService.addDept(department);

    }
}
