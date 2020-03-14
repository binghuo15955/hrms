package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

public class Performance implements Serializable {
    private Integer id;

    private String employeeNum;

    private String name;

    private String position;

    private Date date;

    private String self_assessment;

    private String leader_assessment;

    private String total;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSelf_assessment() {
        return self_assessment;
    }

    public void setSelf_assessment(String self_assessment) {
        this.self_assessment = self_assessment == null ? null : self_assessment.trim();
    }

    public String getLeader_assessment() {
        return leader_assessment;
    }

    public void setLeader_assessment(String leader_assessment) {
        this.leader_assessment = leader_assessment == null ? null : leader_assessment.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}