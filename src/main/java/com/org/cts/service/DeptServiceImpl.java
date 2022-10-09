package com.org.cts.service;

import com.org.cts.model.Department;
import com.org.cts.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    DeptRepo deptRepo;

    @Override
    public void addDept(Department department) {
        deptRepo.save(department);
    }

    @Override
    public void updateDept(Department department) {
        deptRepo.save(department);
    }


    @Override
    public List<Department> getAllDepartment() {
        List<Department> d = deptRepo.findAll();
        return d;
    }

    @Override
    public Department findDeptById(Integer id) {
        Department d3 = deptRepo.getById(id);

        return d3;
    }

    @Override
    public String deleteByAddress(String deptLocation) {
         deptRepo.deleteByDeptLocation(deptLocation);
        return "success fully deleted";
    }
}
