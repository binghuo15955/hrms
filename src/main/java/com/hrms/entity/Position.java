package com.hrms.entity;

import java.io.Serializable;

public class Position implements Serializable {
    private Integer id;

    private String position;

    private String vacancy_num;

    private String requirement;

    private String postnum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getVacancy_num() {
        return vacancy_num;
    }

    public void setVacancy_num(String vacancy_num) {
        this.vacancy_num = vacancy_num == null ? null : vacancy_num.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getPostnum() {
        return postnum;
    }

    public void setPostnum(String postnum) {
        this.postnum = postnum == null ? null : postnum.trim();
    }
}