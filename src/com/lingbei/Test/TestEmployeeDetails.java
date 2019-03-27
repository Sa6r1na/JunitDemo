package com.lingbei.Test;

import com.lingbei.service.EmpBusinessLogic;
import com.lingbei.util.EmployeeDetail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmployeeDetail employeeDetail = new EmployeeDetail();
    EmpBusinessLogic  empBusinessLogic = new EmpBusinessLogic();

    @Test
    public void testCalculateAppriasal(){
        employeeDetail.setName("lingbei");
        employeeDetail.setAge(25);
        employeeDetail.setMonthSalary(8000);

        double appriasal = empBusinessLogic.calculateAppraisal(employeeDetail);
        assertEquals(500,appriasal,0.0);
    }

    @Test
    public void testCalculateYearlySalary(){
        employeeDetail.setName("llll");
        employeeDetail.setMonthSalary(8000);
        employeeDetail.setAge(34);

        double yearlysalary = empBusinessLogic.calculateYearlySalary(employeeDetail);
        assertEquals(96000,yearlysalary,0.0);
    }
}
