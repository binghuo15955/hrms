package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

public class Resign implements Serializable {
    private Integer id;

    private String employeeNum;

    private String name;

    private String sex;

    private String department;

    private String position;

    private String reason;

    private Date enrollday;

    private Date resignday;

    private String contractday;

    private String department_check;

    private String personnel_check;

    private String manager_check;

    private String department_connection;

    private String finance_connection;

    private String administration_connection;

    private String department_manager_connection;

    private String manager_connection;

    private String status;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getEnrollday() {
        return enrollday;
    }

    public void setEnrollday(Date enrollday) {
        this.enrollday = enrollday;
    }

    public Date getResignday() {
        return resignday;
    }

    public void setResignday(Date resignday) {
        this.resignday = resignday;
    }

    public String getContractday() {
        return contractday;
    }

    public void setContractday(String contractday) {
        this.contractday = contractday == null ? null : contractday.trim();
    }

    public String getDepartment_check() {
        return department_check;
    }

    public void setDepartment_check(String department_check) {
        this.department_check = department_check == null ? null : department_check.trim();
    }

    public String getPersonnel_check() {
        return personnel_check;
    }

    public void setPersonnel_check(String personnel_check) {
        this.personnel_check = personnel_check == null ? null : personnel_check.trim();
    }

    public String getManager_check() {
        return manager_check;
    }

    public void setManager_check(String manager_check) {
        this.manager_check = manager_check == null ? null : manager_check.trim();
    }

    public String getDepartment_connection() {
        return department_connection;
    }

    public void setDepartment_connection(String department_connection) {
        this.department_connection = department_connection == null ? null : department_connection.trim();
    }

    public String getFinance_connection() {
        return finance_connection;
    }

    public void setFinance_connection(String finance_connection) {
        this.finance_connection = finance_connection == null ? null : finance_connection.trim();
    }

    public String getAdministration_connection() {
        return administration_connection;
    }

    public void setAdministration_connection(String administration_connection) {
        this.administration_connection = administration_connection == null ? null : administration_connection.trim();
    }

    public String getDepartment_manager_connection() {
        return department_manager_connection;
    }

    public void setDepartment_manager_connection(String department_manager_connection) {
        this.department_manager_connection = department_manager_connection == null ? null : department_manager_connection.trim();
    }

    public String getManager_connection() {
        return manager_connection;
    }

    public void setManager_connection(String manager_connection) {
        this.manager_connection = manager_connection == null ? null : manager_connection.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}