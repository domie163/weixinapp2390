package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 供应商管理：(SupplierManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SupplierManagement")
public class SupplierManagement implements Serializable {

    // SupplierManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_management_id")
    private Integer supplier_management_id;

    // 公司名称
    @Basic
    private String corporate_name;
    // 公司地点
    @Basic
    private String company_location;
    // 负责人
    @Basic
    private String person_in_charge;
    // 联系方式
    @Basic
    private String contact_information;
    // 主要产品
    @Basic
    private String main_products;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
