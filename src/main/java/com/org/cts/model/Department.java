package com.org.cts.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Department {
    @Id
    private int deptId;
    private String deptName;
    private String deptLocation;
    private double deptFund;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptLocation() {
        return deptLocation;
    }

    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    public double getDeptFund() {
        return deptFund;
    }

    public void setDeptFund(double deptFund) {
        this.deptFund = deptFund;
    }
}
