package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 部门信息：(DepartmentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DepartmentInformation")
public class DepartmentInformation implements Serializable {

    // DepartmentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_information_id")
    private Integer department_information_id;

    // 部门名称
    @Basic
    private String department_name;
    // 部门主管
    @Basic
    private String department_head;
    // 部门位置
    @Basic
    private String department_location;
    // 员工人数
    @Basic
    private Integer number_of_employees;
    // 备注信息
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
