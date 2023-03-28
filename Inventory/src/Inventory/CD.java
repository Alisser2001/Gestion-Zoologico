/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory;

/**
 *
 * @author Alisser
 */
public class CD extends Product{
    String artista, discografica;
    int numCanciones;
    public CD(String nameProduct, int id, int stock, float price, String artista, String discografica, int numCanciones){
        super(nameProduct, id, stock, price);
        this.artista = artista;
        this.discografica = discografica;
        this.numCanciones = numCanciones;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
    
    public String toString(){
        String status = this.getStatus() ? "Activo" : "Descatalogado";
        return "Item Number: " + this.getIdNumber() + 
               "\nName: " + this.getName() + 
               "\nArtist: " + this.getArtista() +
               "Songs on Album: " + this.getNumCanciones() +
               "\nRecord label: " + this.getDiscografica() +
               "\nQuantity in stock: " + this.getQty() + 
               "\nPrice: " + this.getPrice() + 
               "\nStock value: " + this.getInventoryValue() + 
               "\nProduct Status: " + status + "\n";
    };
}
