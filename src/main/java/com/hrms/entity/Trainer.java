package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

public class Trainer implements Serializable {
    private Integer id;

    private String trainerid;

    private String name;

    private String department;

    private Date join_time;

    private String duration;

    private String content;

    private String methods;

    private String course_scores;

    private String scores;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(String trainerid) {
        this.trainerid = trainerid == null ? null : trainerid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Date getJoin_time() {
        return join_time;
    }

    public void setJoin_time(Date join_time) {
        this.join_time = join_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods == null ? null : methods.trim();
    }

    public String getCourse_scores() {
        return course_scores;
    }

    public void setCourse_scores(String course_scores) {
        this.course_scores = course_scores == null ? null : course_scores.trim();
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores == null ? null : scores.trim();
    }
}