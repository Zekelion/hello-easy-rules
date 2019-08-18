package com.github.eriksen.hello_easy_rules.mapper;

import com.github.eriksen.hello_easy_rules.model.RuleSetConnect;
import java.util.List;

public interface RuleSetConnectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_rule_set_snapshot
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_rule_set_snapshot
     *
     * @mbg.generated
     */
    int insert(RuleSetConnect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_rule_set_snapshot
     *
     * @mbg.generated
     */
    RuleSetConnect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_rule_set_snapshot
     *
     * @mbg.generated
     */
    List<RuleSetConnect> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_rule_set_snapshot
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RuleSetConnect record);
}