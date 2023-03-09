/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

/**
 *
 * @author Alisser
 */
public class Product {
    //Instance field declarations
    private String nameProduct;
    private int id, stock;
    private float price;
    
    //Empty constructor
    public Product(){};
    
    //Overloaded constructor
    public Product(String nameProduct, int id, int stock, float price){
        this.nameProduct = nameProduct;
        this.id = id;
        this.stock = stock;
        this.price = price;
    };
    
    //Set nameProduct
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    };
    //Set id
    public void setIdNumber(int id){
        this.id = id;
    };
    //Set stock
    public void setStock(int stock){
        this.stock = stock;
    };
    //Set price
    public void setPrice(int price){
        this.price = price;
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
    
    
    //Product Values
    public String toString(){
        return "Product: " + nameProduct + "\nPrice: " + price + "\nId: " + id + "\nStock unities: " + stock;
    };
}
