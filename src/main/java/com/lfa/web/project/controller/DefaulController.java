/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.web.project.controller;

import com.lfa.web.project.DAO.ColorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ssubik
 */
@Controller
@RequestMapping(value = "/")
public class DefaulController {
    @Autowired
    private ColorDAO colorDAO;
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("colors",colorDAO.getAll());
        return "index";
    }
}
