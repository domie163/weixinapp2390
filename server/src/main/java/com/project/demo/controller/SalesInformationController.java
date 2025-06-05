package com.project.demo.controller;

import com.project.demo.entity.SalesInformation;
import com.project.demo.service.SalesInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 销售信息：(SalesInformation)表控制层
 *
 */
@RestController
@RequestMapping("/sales_information")
public class SalesInformationController extends BaseController<SalesInformation, SalesInformationService> {

    /**
     * 销售信息对象
     */
    @Autowired
    public SalesInformationController(SalesInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(sales_information_id) AS max FROM "+"`sales_information`";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = ("SELECT count(*) count FROM `product_information` INNER JOIN `sales_information` ON product_information.product_number=sales_information.product_number WHERE product_information.inventory_quantity < sales_information.sales_volumes AND sales_information.sales_information_id="+max).replaceAll("&#60;","<");
        select = service.runCountSql(sql);
        Integer count = Integer.valueOf(String.valueOf(select.getSingleResult()));
        if(count>0){
            sql = "delete from "+"sales_information"+" WHERE "+"sales_information_id"+" ="+max;
            select = service.runCountSql(sql);
            select.executeUpdate();
            return error(30000,"库存不足!");
        }
        return success(1);
    }

}
