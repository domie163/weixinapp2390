package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 出库信息：(OutboundInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OutboundInformation")
public class OutboundInformation implements Serializable {

    // OutboundInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outbound_information_id")
    private Integer outbound_information_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 出库人员
    @Basic
    private String outbound_personnel;
    // 出库时间
    @Basic
    private Timestamp delivery_time;
    // 出库数量
    @Basic
    private Integer outbound_quantity;
    // 出库备注
    @Basic
    private String outbound_remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
