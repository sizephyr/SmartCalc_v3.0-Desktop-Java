package org.school21.calc.controller;

import org.school21.calc.model.CalcData;
import org.school21.calc.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/")
    public String mainPage(Model model) {
        CalcData calcData = new CalcData();
        model.addAttribute("calcData", calcData);
        return "index";
    }

    @PostMapping("api/calc")
    public void calc(@ModelAttribute("calcData") CalcData calcData) {
        System.out.println("I AM HERE");
        calcService.printArgs(calcData);
    }
}
