package com.hrms.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("emp_message")
public class Message implements Serializable {
    private String employeeNum;

    private String name;

    private String department;

    private String position;

    private String sex;

    private String nation;

    private Date birthday;

    private String marital;

    private String haveChildren;

    private String birthplace;

    private Date enrollday;

    private String enrollplace;

    private Date joinJobDay;

    private String nativePlace;

    private String height;

    private String blood;

    private String postcode;

    private String idnumber;

    private String householdtype;

    private String current_address;

    private String current_postcode;

    private String telephone;

    private String email;

    private String education_background;

    private static final long serialVersionUID = 1L;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }
    
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    @DateTimeFormat(pattern="yyyy-mm-dd")
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

    @DateTimeFormat(pattern="yyyy-mm-dd")
    public Date getEnrollday() {
        return enrollday;
    }

    public void setEnrollday(Date enrollday) {
        this.enrollday = enrollday;
    }

    public String getEnrollplace() {
        return enrollplace;
    }

    public void setEnrollplace(String enrollplace) {
        this.enrollplace = enrollplace == null ? null : enrollplace.trim();
    }

    @DateTimeFormat(pattern="yyyy-mm-dd")
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
}