/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.web.project.entity;

/**
 *
 * @author ssubik
 */
public class Color {
    private int id;
    private String name;
    private String code;
    private String status;

    public Color(int id, String name, String code, String status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public Color() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String
         isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
