package net.jojun.practice.model;

import java.util.*;

/**
 * Created by JOJUN on 2020-09-25
 */
public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
