package com.org.cts.controller;

import com.org.cts.model.Department;
import com.org.cts.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class DeptController {
    @Autowired
    DeptService deptService;
    @PostMapping("/create")
    public void addDept(@RequestBody Department department){
        deptService.addDept(department);
    }
    @PutMapping("/update")
    public void updateDept(@RequestBody Department department){
        deptService.updateDept(department);
    }
    @GetMapping("/read")
    public List<Department>getAllDepartment(){
        List<Department> dept = deptService.getAllDepartment();
        return dept;
    }
    @GetMapping("/ById/{id}")
    public Department findDeptById(@PathVariable Integer id){
        Department d1 = deptService.findDeptById(id);
        return d1;
    }


    @DeleteMapping("/deleteByAddress/{deptLocation}")
    public String deleteByAddress(@PathVariable String deptLocation){
        String ss = deptService.deleteByAddress(deptLocation);
        return ss;
    }
}
