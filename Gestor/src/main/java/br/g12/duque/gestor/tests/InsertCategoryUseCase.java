/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.gestor.tests;

import br.g12.duque.gestor.dao.CategoryDao;
import br.g12.duque.gestor.models.Category;
import javax.swing.JOptionPane;

/**
 *
 * @author 04396
 */
public class InsertCategoryUseCase {
    public static void main(String[] args) {
        Category cat = new Category();
        String name = JOptionPane.showInputDialog("Nome:");
        String description = JOptionPane.showInputDialog("Descrição:");
        cat.setName(name);
        cat.setDescription(description);
        
        CategoryDao cd = new CategoryDao(cat);
        boolean success = cd.insert();
        
        if(success) {
            JOptionPane.showMessageDialog(null, "Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        
    }
}
