/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.web.project.DAO;

import com.lfa.web.project.entity.Color;
import java.util.List;

/**
 *
 * @author ssubik
 */
public interface ColorDAO {
    List<Color> getAll();
    int insert(Color color);
}
