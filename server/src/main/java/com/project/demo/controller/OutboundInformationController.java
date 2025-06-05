package com.project.demo.controller;

import com.project.demo.entity.OutboundInformation;
import com.project.demo.service.OutboundInformationService;
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
 * 出库信息：(OutboundInformation)表控制层
 *
 */
@RestController
@RequestMapping("/outbound_information")
public class OutboundInformationController extends BaseController<OutboundInformation, OutboundInformationService> {

    /**
     * 出库信息对象
     */
    @Autowired
    public OutboundInformationController(OutboundInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(outbound_information_id) AS max FROM "+"`outbound_information`";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = ("SELECT count(*) count FROM `product_information` INNER JOIN `outbound_information` ON product_information.product_number=outbound_information.product_number WHERE product_information.inventory_quantity < outbound_information.outbound_quantity AND outbound_information.outbound_information_id="+max).replaceAll("&#60;","<");
        select = service.runCountSql(sql);
        Integer count = Integer.valueOf(String.valueOf(select.getSingleResult()));
        if(count>0){
            sql = "delete from "+"outbound_information"+" WHERE "+"outbound_information_id"+" ="+max;
            select = service.runCountSql(sql);
            select.executeUpdate();
            return error(30000,"库存不足!");
        }
        sql = "UPDATE `product_information` INNER JOIN `outbound_information` ON product_information.product_number=outbound_information.product_number SET product_information.inventory_quantity= product_information.inventory_quantity - outbound_information.outbound_quantity WHERE outbound_information.outbound_information_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
