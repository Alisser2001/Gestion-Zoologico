/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory;

/**
 *
 * @author Alisser
 */
public class DVD extends Product{
    private float duracion;
    private String clasificacion, estudio;
    public DVD(String nameProduct, int id, int stock, float price, float duracion, String clasificacion, String estudio){
        super(nameProduct, id, stock, price);
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.estudio = estudio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    public int getInventoryValue(){
        return this.getQty()*Float.valueOf(this.getPrice()).intValue() + Double.valueOf((this.getQty()*Float.valueOf(this.getPrice()).intValue())*0.05).intValue();
    }
    
    public String toString(){
        String status = this.getStatus() ? "Activo" : "Descatalogado";
        return "Item Number: " + this.getIdNumber() + 
               "\nName: " + this.getName() + 
               "\nMovie Length: " + this.getDuracion() +
               "\nAge Rating: " + this.getClasificacion() +
               "\nFilm Studio: " + this.getEstudio() +
               "\nQuantity in stock: " + this.getQty() + 
               "\nPrice: " + this.getPrice() + 
               "\nStock value: " + this.getInventoryValue() + 
               "\nProduct Status: " + status + "\n";
    };
}
