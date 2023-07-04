package com.example.asm2.controller;


import com.example.asm2.model.Recruitment;
import com.example.asm2.service.CompanyService;
import com.example.asm2.service.RecruitmentService;
import com.example.asm2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private CompanyService cService;

    @Autowired
    private RecruitmentService rService;

    @Autowired
    private UserService uService;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("companyList", cService.getAllCompany());
        model.addAttribute("userCount", uService.getUserCount());
        model.addAttribute("companyCount", cService.getAllCompany().size());
        model.addAttribute("jobCount", rService.getAll().size());
        return "index";
    }

    @RequestMapping("/job")
    public String getCompanyList(Model model) {
        model.addAttribute("jobList", rService.getAll());

        return "job";
    }


}
