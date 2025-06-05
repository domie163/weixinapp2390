package com.project.demo.controller;

import com.project.demo.entity.ProcurementInformation;
import com.project.demo.service.ProcurementInformationService;
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
 * 采购信息：(ProcurementInformation)表控制层
 *
 */
@RestController
@RequestMapping("/procurement_information")
public class ProcurementInformationController extends BaseController<ProcurementInformation, ProcurementInformationService> {

    /**
     * 采购信息对象
     */
    @Autowired
    public ProcurementInformationController(ProcurementInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
