package com.Bridgelabz.employeePayrollApp.service;

import com.Bridgelabz.employeePayrollApp.dto.EmployeePayrollDTO;
import com.Bridgelabz.employeePayrollApp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/* Employee Payroll Service Layer */

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Anand", 300000)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Rajesh", 400000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
    }
}
