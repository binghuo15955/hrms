package com.hrms.entity;

import java.io.Serializable;

public class Interview implements Serializable {
    private Integer id;

    private String recruitment_id;

    private String name;

    private String motivation;

    private String appearance;

    private String communication;

    private String mentation;

    private String stability;

    private String maturity;

    private String interpersonal_relation;

    private String cooperative;

    private String others;

    private String pass_first_interview;

    private String interviewer;

    private String first_interview_time;

    private String computer_operation;

    private String last_company;

    private String last_position;

    private String last_jobcontent;

    private String last_jobreason;

    private String expected_salary;

    private String comprehensive_quality_assessment;

    private String reexamination_proposal;

    private String reexaminationer;

    private String reexamination_time;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation == null ? null : motivation.trim();
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication == null ? null : communication.trim();
    }

    public String getMentation() {
        return mentation;
    }

    public void setMentation(String mentation) {
        this.mentation = mentation == null ? null : mentation.trim();
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability == null ? null : stability.trim();
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity == null ? null : maturity.trim();
    }

    public String getInterpersonal_relation() {
        return interpersonal_relation;
    }

    public void setInterpersonal_relation(String interpersonal_relation) {
        this.interpersonal_relation = interpersonal_relation == null ? null : interpersonal_relation.trim();
    }

    public String getCooperative() {
        return cooperative;
    }

    public void setCooperative(String cooperative) {
        this.cooperative = cooperative == null ? null : cooperative.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public String getPass_first_interview() {
        return pass_first_interview;
    }

    public void setPass_first_interview(String pass_first_interview) {
        this.pass_first_interview = pass_first_interview == null ? null : pass_first_interview.trim();
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer == null ? null : interviewer.trim();
    }

    public String getFirst_interview_time() {
        return first_interview_time;
    }

    public void setFirst_interview_time(String first_interview_time) {
        this.first_interview_time = first_interview_time == null ? null : first_interview_time.trim();
    }

    public String getComputer_operation() {
        return computer_operation;
    }

    public void setComputer_operation(String computer_operation) {
        this.computer_operation = computer_operation == null ? null : computer_operation.trim();
    }

    public String getLast_company() {
        return last_company;
    }

    public void setLast_company(String last_company) {
        this.last_company = last_company == null ? null : last_company.trim();
    }

    public String getLast_position() {
        return last_position;
    }

    public void setLast_position(String last_position) {
        this.last_position = last_position == null ? null : last_position.trim();
    }

    public String getLast_jobcontent() {
        return last_jobcontent;
    }

    public void setLast_jobcontent(String last_jobcontent) {
        this.last_jobcontent = last_jobcontent == null ? null : last_jobcontent.trim();
    }

    public String getLast_jobreason() {
        return last_jobreason;
    }

    public void setLast_jobreason(String last_jobreason) {
        this.last_jobreason = last_jobreason == null ? null : last_jobreason.trim();
    }

    public String getExpected_salary() {
        return expected_salary;
    }

    public void setExpected_salary(String expected_salary) {
        this.expected_salary = expected_salary == null ? null : expected_salary.trim();
    }

    public String getComprehensive_quality_assessment() {
        return comprehensive_quality_assessment;
    }

    public void setComprehensive_quality_assessment(String comprehensive_quality_assessment) {
        this.comprehensive_quality_assessment = comprehensive_quality_assessment == null ? null : comprehensive_quality_assessment.trim();
    }

    public String getReexamination_proposal() {
        return reexamination_proposal;
    }

    public void setReexamination_proposal(String reexamination_proposal) {
        this.reexamination_proposal = reexamination_proposal == null ? null : reexamination_proposal.trim();
    }

    public String getReexaminationer() {
        return reexaminationer;
    }

    public void setReexaminationer(String reexaminationer) {
        this.reexaminationer = reexaminationer == null ? null : reexaminationer.trim();
    }

    public String getReexamination_time() {
        return reexamination_time;
    }

    public void setReexamination_time(String reexamination_time) {
        this.reexamination_time = reexamination_time == null ? null : reexamination_time.trim();
    }
}