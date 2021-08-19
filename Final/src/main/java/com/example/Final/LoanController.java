package com.example.Final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes({"clientnumber","clientname","loanamount","years","loantype"})
@RequestMapping
@Controller
public class LoanController {
    DatabaseService service1;
    LoanTableService service;


    @RequestMapping(value = "/loantable",method = RequestMethod.GET)
    public  String showLoantablepage(){
        return "loantable";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String showLoantablepage2(){
        return "loantable";
    }

    @RequestMapping(value = "/add-todo",method = RequestMethod.POST)
    public  String addTodo(ModelMap model, @RequestParam String clientnumber, String clientname, double loanamount, int years, String loantype){
        service.addTodo(clientname,clientnumber,loanamount,years,loantype);
        
        model.clear();
        return "redirect:/category";
    }


}

