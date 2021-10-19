package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

/*    @Autowired
    private AdminServiceImpl adminService;*/

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap) throws Exception {
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);
        System.out.println("ModelAndView" + modelMap.toString());
//        int i = 100 / 0;
        return "target";
    }

}
