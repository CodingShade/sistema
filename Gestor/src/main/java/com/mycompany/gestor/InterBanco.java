/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author 04396
 */
public interface InterBanco {
    public boolean insert(); //Métodods abstratos
    public boolean update();
    public boolean delete();
    public boolean findAll();
    public boolean findById(int id);
    
}
