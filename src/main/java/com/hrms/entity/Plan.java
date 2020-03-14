package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable {
    private Integer id;

    private String project;

    private String content;

    private String target_object;

    private String purpose;

    private String methods;

    private String plus;

    private String detail;

    private Date start_time;

    private Date end_time;

    private String class_hour;

    private String trainerid;

    private String trainer;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTarget_object() {
        return target_object;
    }

    public void setTarget_object(String target_object) {
        this.target_object = target_object == null ? null : target_object.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods == null ? null : methods.trim();
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus == null ? null : plus.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getClass_hour() {
        return class_hour;
    }

    public void setClass_hour(String class_hour) {
        this.class_hour = class_hour == null ? null : class_hour.trim();
    }

    public String getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(String trainerid) {
        this.trainerid = trainerid == null ? null : trainerid.trim();
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer == null ? null : trainer.trim();
    }
}