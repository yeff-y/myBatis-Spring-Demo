package com.glodon.demo.mybatis.models;

import java.util.Date;

public class SimsLesson {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.INTRO
     *
     * @mbggenerated
     */
    private String intro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.CREATED_BY
     *
     * @mbggenerated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.CREATED_TIME
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.UPDATED_BY
     *
     * @mbggenerated
     */
    private String updatedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sims_lesson.UPDATED_TIME
     *
     * @mbggenerated
     */
    private Date updatedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.ID
     *
     * @return the value of sims_lesson.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.ID
     *
     * @param id the value for sims_lesson.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.NAME
     *
     * @return the value of sims_lesson.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.NAME
     *
     * @param name the value for sims_lesson.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.INTRO
     *
     * @return the value of sims_lesson.INTRO
     *
     * @mbggenerated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.INTRO
     *
     * @param intro the value for sims_lesson.INTRO
     *
     * @mbggenerated
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.CREATED_BY
     *
     * @return the value of sims_lesson.CREATED_BY
     *
     * @mbggenerated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.CREATED_BY
     *
     * @param createdBy the value for sims_lesson.CREATED_BY
     *
     * @mbggenerated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.CREATED_TIME
     *
     * @return the value of sims_lesson.CREATED_TIME
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.CREATED_TIME
     *
     * @param createdTime the value for sims_lesson.CREATED_TIME
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.UPDATED_BY
     *
     * @return the value of sims_lesson.UPDATED_BY
     *
     * @mbggenerated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.UPDATED_BY
     *
     * @param updatedBy the value for sims_lesson.UPDATED_BY
     *
     * @mbggenerated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sims_lesson.UPDATED_TIME
     *
     * @return the value of sims_lesson.UPDATED_TIME
     *
     * @mbggenerated
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sims_lesson.UPDATED_TIME
     *
     * @param updatedTime the value for sims_lesson.UPDATED_TIME
     *
     * @mbggenerated
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}