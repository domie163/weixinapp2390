package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 采购信息：(ProcurementInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProcurementInformation")
public class ProcurementInformation implements Serializable {

    // ProcurementInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "procurement_information_id")
    private Integer procurement_information_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 采购日期
    @Basic
    private Timestamp purchase_date;
    // 供应商
    @Basic
    private String supplier;
    // 采购人员
    @Basic
    private String procurement_personnel;
    // 采购数量
    @Basic
    private String purchase_quantity;
    // 采购价格
    @Basic
    private String purchase_price;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
