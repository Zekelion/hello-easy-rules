package com.github.eriksen.hello_easy_rules.model;

import java.io.Serializable;
import java.util.Date;

public class DecisionModel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.decision
     *
     * @mbg.generated
     */
    private Integer decision;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.version
     *
     * @mbg.generated
     */
    private String version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.enable
     *
     * @mbg.generated
     */
    private Integer enable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_decision_model.updateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_decision_model
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_decision_model
     *
     * @mbg.generated
     */
    public DecisionModel(Integer id, Integer type, Integer decision, String desc, String version, Integer enable, Date createTime, Date updateTime) {
        this.id = id;
        this.type = type;
        this.decision = decision;
        this.desc = desc;
        this.version = version;
        this.enable = enable;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_decision_model
     *
     * @mbg.generated
     */
    public DecisionModel() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.id
     *
     * @return the value of sys_decision_model.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.id
     *
     * @param id the value for sys_decision_model.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.type
     *
     * @return the value of sys_decision_model.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.type
     *
     * @param type the value for sys_decision_model.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.decision
     *
     * @return the value of sys_decision_model.decision
     *
     * @mbg.generated
     */
    public Integer getDecision() {
        return decision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.decision
     *
     * @param decision the value for sys_decision_model.decision
     *
     * @mbg.generated
     */
    public void setDecision(Integer decision) {
        this.decision = decision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.desc
     *
     * @return the value of sys_decision_model.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.desc
     *
     * @param desc the value for sys_decision_model.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.version
     *
     * @return the value of sys_decision_model.version
     *
     * @mbg.generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.version
     *
     * @param version the value for sys_decision_model.version
     *
     * @mbg.generated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.enable
     *
     * @return the value of sys_decision_model.enable
     *
     * @mbg.generated
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.enable
     *
     * @param enable the value for sys_decision_model.enable
     *
     * @mbg.generated
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.createTime
     *
     * @return the value of sys_decision_model.createTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.createTime
     *
     * @param createTime the value for sys_decision_model.createTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_decision_model.updateTime
     *
     * @return the value of sys_decision_model.updateTime
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_decision_model.updateTime
     *
     * @param updateTime the value for sys_decision_model.updateTime
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}