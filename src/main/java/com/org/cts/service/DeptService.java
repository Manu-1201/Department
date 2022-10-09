package com.org.cts.service;

import com.org.cts.model.Department;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DeptService {
    public void addDept(Department department);
    public void updateDept(Department department);
    public List<Department> getAllDepartment();
    public Department findDeptById(Integer id);

//    public void delById(Integer id);
    public String deleteByAddress(String deptLocation);
}
