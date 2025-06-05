package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 订单运输：(OrderTransportation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderTransportation")
public class OrderTransportation implements Serializable {

    // OrderTransportation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_transportation_id")
    private Integer order_transportation_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 销售人员
    @Basic
    private String salesman;
    // 客户姓名
    @Basic
    private String customer_name;
    // 联系电话
    @Basic
    private String contact_number;
    // 配送工具
    @Basic
    private String delivery_tools;
    // 司机姓名
    @Basic
    private String drivers_name;
    // 联系方式
    @Basic
    private String contact_information;
    // 路线配送
    @Basic
    private String route_delivery;
    // 运输备注
    @Basic
    private String transportation_remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
