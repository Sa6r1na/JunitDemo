package com.lingbei.service;

import com.lingbei.util.EmployeeDetail;

public class EmpBusinessLogic {

    public double calculateYearlySalary(EmployeeDetail employeeDetail){
        double yearlySalary = 0;
        yearlySalary = employeeDetail.getMonthSalary() * 12;
        return  yearlySalary;
    }


    public double calculateAppraisal(EmployeeDetail employeeDetail){
        double appraisal = 0;
        if(employeeDetail.getMonthSalary()<10000){
            appraisal = 500;
        }else {
            appraisal = 1000;
        }

        return appraisal;
    }
}
