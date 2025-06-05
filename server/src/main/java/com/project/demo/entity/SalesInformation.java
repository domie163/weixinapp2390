package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 销售信息：(SalesInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SalesInformation")
public class SalesInformation implements Serializable {

    // SalesInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_information_id")
    private Integer sales_information_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 销售人员
    @Basic
    private String salesman;
    // 商品价格
    @Basic
    private String commodity_price;
    // 销售日期
    @Basic
    private Timestamp sales_date;
    // 销售数量
    @Basic
    private Integer sales_volumes;
    // 销售金额
    @Basic
    private String sales_amount;
    // 客户姓名
    @Basic
    private String customer_name;
    // 联系方式
    @Basic
    private String contact_information;
    // 销售备注
    @Basic
    private String sales_remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
