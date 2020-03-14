package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

public class Recruitment implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    private String position;

    private String trial_pay;

    private Date apply_day;

    private String nation;

    private Date birthday;

    private String marital;

    private String haveChildren;

    private String birthplace;

    private String enrollday;

    private String enrollplace;

    private Date joinJobDay;

    private String nativePlace;

    private String height;

    private String blood;

    private String profession;

    private String school;

    private String graduation_time;

    private String postcode;

    private String idnumber;

    private String householdtype;

    private String current_address;

    private String current_postcode;

    private String telephone;

    private String email;

    private String education_background;

    private String agree_assign;

    private String agree_learnoutside;

    private Date when_work;

    private String written_scores;

    private String information_integrity;

    private String meet_requirement;

    private String first_result;

    private String second_result;

    private String background_check;

    private String official_salary;

    private Date join_day;

    private String personnel_supervisor_opinion;

    private String personnel_manager_opinion;

    private String deputy_personnel_manager_opinion;

    private String deputy_business_manager_opinion;

    private String manager_opinion;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getTrial_pay() {
        return trial_pay;
    }

    public void setTrial_pay(String trial_pay) {
        this.trial_pay = trial_pay == null ? null : trial_pay.trim();
    }

    public Date getApply_day() {
        return apply_day;
    }

    public void setApply_day(Date apply_day) {
        this.apply_day = apply_day;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(String haveChildren) {
        this.haveChildren = haveChildren == null ? null : haveChildren.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getEnrollday() {
        return enrollday;
    }

    public void setEnrollday(String enrollday) {
        this.enrollday = enrollday == null ? null : enrollday.trim();
    }

    public String getEnrollplace() {
        return enrollplace;
    }

    public void setEnrollplace(String enrollplace) {
        this.enrollplace = enrollplace == null ? null : enrollplace.trim();
    }

    public Date getJoinJobDay() {
        return joinJobDay;
    }

    public void setJoinJobDay(Date joinJobDay) {
        this.joinJobDay = joinJobDay;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getGraduation_time() {
        return graduation_time;
    }

    public void setGraduation_time(String graduation_time) {
        this.graduation_time = graduation_time == null ? null : graduation_time.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getHouseholdtype() {
        return householdtype;
    }

    public void setHouseholdtype(String householdtype) {
        this.householdtype = householdtype == null ? null : householdtype.trim();
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address == null ? null : current_address.trim();
    }

    public String getCurrent_postcode() {
        return current_postcode;
    }

    public void setCurrent_postcode(String current_postcode) {
        this.current_postcode = current_postcode == null ? null : current_postcode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEducation_background() {
        return education_background;
    }

    public void setEducation_background(String education_background) {
        this.education_background = education_background == null ? null : education_background.trim();
    }

    public String getAgree_assign() {
        return agree_assign;
    }

    public void setAgree_assign(String agree_assign) {
        this.agree_assign = agree_assign == null ? null : agree_assign.trim();
    }

    public String getAgree_learnoutside() {
        return agree_learnoutside;
    }

    public void setAgree_learnoutside(String agree_learnoutside) {
        this.agree_learnoutside = agree_learnoutside == null ? null : agree_learnoutside.trim();
    }

    public Date getWhen_work() {
        return when_work;
    }

    public void setWhen_work(Date when_work) {
        this.when_work = when_work;
    }

    public String getWritten_scores() {
        return written_scores;
    }

    public void setWritten_scores(String written_scores) {
        this.written_scores = written_scores == null ? null : written_scores.trim();
    }

    public String getInformation_integrity() {
        return information_integrity;
    }

    public void setInformation_integrity(String information_integrity) {
        this.information_integrity = information_integrity == null ? null : information_integrity.trim();
    }

    public String getMeet_requirement() {
        return meet_requirement;
    }

    public void setMeet_requirement(String meet_requirement) {
        this.meet_requirement = meet_requirement == null ? null : meet_requirement.trim();
    }

    public String getFirst_result() {
        return first_result;
    }

    public void setFirst_result(String first_result) {
        this.first_result = first_result == null ? null : first_result.trim();
    }

    public String getSecond_result() {
        return second_result;
    }

    public void setSecond_result(String second_result) {
        this.second_result = second_result == null ? null : second_result.trim();
    }

    public String getBackground_check() {
        return background_check;
    }

    public void setBackground_check(String background_check) {
        this.background_check = background_check == null ? null : background_check.trim();
    }

    public String getOfficial_salary() {
        return official_salary;
    }

    public void setOfficial_salary(String official_salary) {
        this.official_salary = official_salary == null ? null : official_salary.trim();
    }

    public Date getJoin_day() {
        return join_day;
    }

    public void setJoin_day(Date join_day) {
        this.join_day = join_day;
    }

    public String getPersonnel_supervisor_opinion() {
        return personnel_supervisor_opinion;
    }

    public void setPersonnel_supervisor_opinion(String personnel_supervisor_opinion) {
        this.personnel_supervisor_opinion = personnel_supervisor_opinion == null ? null : personnel_supervisor_opinion.trim();
    }

    public String getPersonnel_manager_opinion() {
        return personnel_manager_opinion;
    }

    public void setPersonnel_manager_opinion(String personnel_manager_opinion) {
        this.personnel_manager_opinion = personnel_manager_opinion == null ? null : personnel_manager_opinion.trim();
    }

    public String getDeputy_personnel_manager_opinion() {
        return deputy_personnel_manager_opinion;
    }

    public void setDeputy_personnel_manager_opinion(String deputy_personnel_manager_opinion) {
        this.deputy_personnel_manager_opinion = deputy_personnel_manager_opinion == null ? null : deputy_personnel_manager_opinion.trim();
    }

    public String getDeputy_business_manager_opinion() {
        return deputy_business_manager_opinion;
    }

    public void setDeputy_business_manager_opinion(String deputy_business_manager_opinion) {
        this.deputy_business_manager_opinion = deputy_business_manager_opinion == null ? null : deputy_business_manager_opinion.trim();
    }

    public String getManager_opinion() {
        return manager_opinion;
    }

    public void setManager_opinion(String manager_opinion) {
        this.manager_opinion = manager_opinion == null ? null : manager_opinion.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}