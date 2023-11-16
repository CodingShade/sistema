/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.gestor.models;

/**
 *
 * @author 04396
 */
public class Category {
    private int id;
    private String name;
    private String description;
    
    //Construtor 
    public Category(){
        System.out.println("Categoria criada!");
    }
    //construtor com parâmetros
    public Category(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
        
    }
    //construtor para carregamento do Combobox
    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    //Construtor que sera usado no Form de Cadastro
    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public static void main(String[] args) {
        Category cat1 = new Category();
        System.out.println("cat1");
        
        Category cat2 = new Category("Bebidas", "Bebidas não alcolicas");
        System.out.println(cat2.name+"\n"+cat2.description);
    }
    
    //GETTERS AND SETTERS

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
}
    

