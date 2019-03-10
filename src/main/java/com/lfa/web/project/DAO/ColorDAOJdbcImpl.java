/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.web.project.DAO;

import com.lfa.web.project.entity.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ssubik
 */
@Repository(value = "colorDAO")
public class ColorDAOJdbcImpl implements ColorDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Color> getAll() {
      
       List<Color> colors = jdbcTemplate.query("select * from color", new RowMapper<Color>() {
           @Override
           public Color mapRow(ResultSet rs, int i) throws SQLException {
               Color color = new Color();
               color.setId(rs.getInt("id"));
               color.setCode(rs.getString("code"));
               color.setName(rs.getString("name"));
               color.setStatus(rs.getString("status"));
               return color;
           }
       });
       
       return colors;
    }

    @Override
    public int insert(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
