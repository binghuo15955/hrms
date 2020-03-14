package com.hrms.entity;

import java.io.Serializable;

public class Question implements Serializable {
    private Integer id;

    private String recruitment_id;

    private String question;

    private String description;

    private String resolve;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecruitment_id() {
        return recruitment_id;
    }

    public void setRecruitment_id(String recruitment_id) {
        this.recruitment_id = recruitment_id == null ? null : recruitment_id.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve == null ? null : resolve.trim();
    }
}