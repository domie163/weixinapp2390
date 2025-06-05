package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 采购部：(ProcurementDepartment)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProcurementDepartment")
public class ProcurementDepartment implements Serializable {

    // ProcurementDepartment编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "procurement_department_id")
    private Integer procurement_department_id;

    // 员工工号
    @Basic
    private String employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 员工性别
    @Basic
    private String employee_gender;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
