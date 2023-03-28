/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inventory;

/**
 *
 * @author Alisser
 */
public class Product {
    //Instance field declarations
    private String nameProduct;
    private int id, stock;
    private float price;
    private boolean status = true;
    
    //Empty constructor
    public Product(){};
    
    //Overloaded constructor
    public Product(String nameProduct, int id, int stock, float price){
        this.nameProduct = nameProduct;
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.status = status;
    };
    
    
    public void addToInventory(int stock){
        if(this.getStatus() == true){
            this.stock += stock;
        }else{
            System.out.println("El producto está descontinuado");
        }
    };
    public void deductFromInventory(int stock){
        this.stock -= stock;
    }
    
    
    //Set nameProduct
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    };
    //Set id
    public void setIdNumber(int id){
        this.id = id;
    };
    //Set price
    public void setPrice(float price){
        this.price = price;
    };
    //Set status
    public void setStatus(boolean status){
        this.status = status;
    };
    
    
    //Get nameProduct
    public String getName(){
        return this.nameProduct;
    };
    //Get id
    public int getIdNumber(){
        return this.id;
    };
    //Get stock
    public int getQty(){
        return this.stock;
    };
    //Get price
    public float getPrice(){
        return this.price;
    };
    //Get status
    public boolean getStatus(){
        return this.status;
    };
    
    //Inventory Value
    public int getInventoryValue(){
        return this.stock*Float.valueOf(this.price).intValue();
    }
    
    
    //Product Values
    public String toString(){
        String status = this.status ? "Activo" : "Descatalogado";
        return "Product: " + this.nameProduct + 
               "\nPrice: " + this.price + 
               "\nId: " + this.id + 
               "\nStock unities: " + this.stock + 
               "\nStock value: " + this.getInventoryValue() + 
               "\nProduct Status: " + status + "\n";
    };
}
