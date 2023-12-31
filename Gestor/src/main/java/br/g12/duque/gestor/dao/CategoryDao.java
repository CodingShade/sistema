/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.gestor.dao;

import br.g12.duque.gestor.models.Category;
import com.mycompany.gestor.Conexao;
import com.mycompany.gestor.InterBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 04396
 */
public class CategoryDao implements InterBanco{
    
    private Category category;
    
    public CategoryDao(Category cat){
        this.category = cat;
    }
    
    // Annotation ou Decorator que indica:
    // Que vou sobrescrever um metodo
    @Override 
    public boolean insert() {
        String sql = "INSERT INTO categories "
                +"(name, description) VALUES "
                +"(?,?)";
        boolean success = false;
        Connection conn = Conexao.getConnection();
        try{
            PreparedStatement pst = 
                    conn.prepareStatement(sql);
            pst.setString(1, category.getName());
            pst.setString(2, category.getName());
            pst.executeUpdate();
            success = true;
        }catch(SQLException ex){
            System.out.println("Erro"+ex.getMessage());
            success = false;
        }
        return success;
        
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
