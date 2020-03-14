package com.hrms.entity;

import java.io.Serializable;

public class Transfer implements Serializable {
    private Integer id;

    private String employeeNum;

    private String name;

    private String sex;

    private String idnumber;

    private String education_background;

    private String origin_department;

    private String origin_position;

    private String new_department;

    private String new_position;

    private String recommendation;

    private String interview;

    private String reinterview;

    private String department_check;

    private String personnel_check;

    private String manager_check;

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

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getEducation_background() {
        return education_background;
    }

    public void setEducation_background(String education_background) {
        this.education_background = education_background == null ? null : education_background.trim();
    }

    public String getOrigin_department() {
        return origin_department;
    }

    public void setOrigin_department(String origin_department) {
        this.origin_department = origin_department == null ? null : origin_department.trim();
    }

    public String getOrigin_position() {
        return origin_position;
    }

    public void setOrigin_position(String origin_position) {
        this.origin_position = origin_position == null ? null : origin_position.trim();
    }

    public String getNew_department() {
        return new_department;
    }

    public void setNew_department(String new_department) {
        this.new_department = new_department == null ? null : new_department.trim();
    }

    public String getNew_position() {
        return new_position;
    }

    public void setNew_position(String new_position) {
        this.new_position = new_position == null ? null : new_position.trim();
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation == null ? null : recommendation.trim();
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview == null ? null : interview.trim();
    }

    public String getReinterview() {
        return reinterview;
    }

    public void setReinterview(String reinterview) {
        this.reinterview = reinterview == null ? null : reinterview.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}