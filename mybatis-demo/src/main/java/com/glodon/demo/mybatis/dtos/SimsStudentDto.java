package com.glodon.demo.mybatis.dtos;

import com.glodon.demo.mybatis.models.SimsClass;

import java.math.BigDecimal;
import java.util.Date;

public class SimsStudentDto {

    private String collegeId;
    private String classId;
    private String name;
    private String idCardNo;
    private String engName;
    private String mobilePhone;
    private String gender;
    private Date birth;
    private String avatar;
    private BigDecimal height;
    private BigDecimal weight;
    private String nation;
    private String political;
    private String marital;
    private String domicilePlaceProvince;
    private String domicilePlaceCity;
    private String domicilePlaceAddress;
    private String hobby;
    private String intro;
    private String presentAddress;
    private String email;
    private Date entryDate;
    private String status;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;
    private SimsClass simsClass ;

    public SimsClass getSimsClass() {
        return simsClass;
    }

    public void setSimsClass(SimsClass simsClass) {
        this.simsClass = simsClass;
    }



    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getDomicilePlaceProvince() {
        return domicilePlaceProvince;
    }

    public void setDomicilePlaceProvince(String domicilePlaceProvince) {
        this.domicilePlaceProvince = domicilePlaceProvince;
    }

    public String getDomicilePlaceCity() {
        return domicilePlaceCity;
    }

    public void setDomicilePlaceCity(String domicilePlaceCity) {
        this.domicilePlaceCity = domicilePlaceCity;
    }

    public String getDomicilePlaceAddress() {
        return domicilePlaceAddress;
    }

    public void setDomicilePlaceAddress(String domicilePlaceAddress) {
        this.domicilePlaceAddress = domicilePlaceAddress;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
