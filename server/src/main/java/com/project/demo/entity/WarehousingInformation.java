package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 入库信息：(WarehousingInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "WarehousingInformation")
public class WarehousingInformation implements Serializable {

    // WarehousingInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehousing_information_id")
    private Integer warehousing_information_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 入库员工
    @Basic
    private String warehousing_employees;
    // 入库时间
    @Basic
    private Timestamp warehousing_time;
    // 入库数量
    @Basic
    private Integer receipt_quantity;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
