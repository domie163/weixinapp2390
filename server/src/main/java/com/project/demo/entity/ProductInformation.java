package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商品信息：(ProductInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProductInformation")
public class ProductInformation implements Serializable {

    // ProductInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_information_id")
    private Integer product_information_id;

    // 商品编号
    @Basic
    private String product_number;
    // 商品名称
    @Basic
    private String product_name;
    // 商品类型
    @Basic
    private String product_type;
    // 存放位置
    @Basic
    private String storage_location;
    // 商品价格
    @Basic
    private String commodity_price;
    // 库存数量
    @Basic
    private Integer inventory_quantity;
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
