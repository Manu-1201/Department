package com.org.cts.service;

import com.org.cts.model.Department;
import com.org.cts.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    DeptRepo deptRepo;

    @Override
    public void addDept(Department department) {
        deptRepo.save(department);
    }
}
