package com.project.demo.controller;

import com.project.demo.entity.ProcurementDepartment;
import com.project.demo.service.ProcurementDepartmentService;
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
 * 采购部：(ProcurementDepartment)表控制层
 *
 */
@RestController
@RequestMapping("/procurement_department")
public class ProcurementDepartmentController extends BaseController<ProcurementDepartment, ProcurementDepartmentService> {

    /**
     * 采购部对象
     */
    @Autowired
    public ProcurementDepartmentController(ProcurementDepartmentService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapemployee_id = new HashMap<>();
        mapemployee_id.put("employee_id",String.valueOf(paramMap.get("employee_id")));
        List listemployee_id = service.select(mapemployee_id, new HashMap<>()).getResultList();
        if (listemployee_id.size()>0){
            return error(30000, "字段员工工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
