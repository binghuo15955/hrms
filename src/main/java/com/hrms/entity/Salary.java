package com.hrms.entity;

import java.io.Serializable;

public class Salary implements Serializable {
    private Integer id;

    private String employeeNum;

    private String base_pay;

    private String allowances;

    private String welfare;

    private String incentives_deductions;

    private String absence;

    private String overtime_pay;

    private String individual_income_tax;

    private String annual_awards;

    private String final_salary;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum == null ? null : employeeNum.trim();
    }

    public String getBase_pay() {
        return base_pay;
    }

    public void setBase_pay(String base_pay) {
        this.base_pay = base_pay == null ? null : base_pay.trim();
    }

    public String getAllowances() {
        return allowances;
    }

    public void setAllowances(String allowances) {
        this.allowances = allowances == null ? null : allowances.trim();
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getIncentives_deductions() {
        return incentives_deductions;
    }

    public void setIncentives_deductions(String incentives_deductions) {
        this.incentives_deductions = incentives_deductions == null ? null : incentives_deductions.trim();
    }

    public String getAbsence() {
        return absence;
    }

    public void setAbsence(String absence) {
        this.absence = absence == null ? null : absence.trim();
    }

    public String getOvertime_pay() {
        return overtime_pay;
    }

    public void setOvertime_pay(String overtime_pay) {
        this.overtime_pay = overtime_pay == null ? null : overtime_pay.trim();
    }

    public String getIndividual_income_tax() {
        return individual_income_tax;
    }

    public void setIndividual_income_tax(String individual_income_tax) {
        this.individual_income_tax = individual_income_tax == null ? null : individual_income_tax.trim();
    }

    public String getAnnual_awards() {
        return annual_awards;
    }

    public void setAnnual_awards(String annual_awards) {
        this.annual_awards = annual_awards == null ? null : annual_awards.trim();
    }

    public String getFinal_salary() {
        return final_salary;
    }

    public void setFinal_salary(String final_salary) {
        this.final_salary = final_salary == null ? null : final_salary.trim();
    }
}