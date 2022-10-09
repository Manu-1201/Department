package com.org.cts.repository;

import com.org.cts.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DeptRepo extends JpaRepository<Department, Integer> {
@Transactional
   String deleteByDeptLocation(String deptLocation);



}
