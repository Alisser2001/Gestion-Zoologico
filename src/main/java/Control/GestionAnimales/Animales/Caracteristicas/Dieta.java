/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class Dieta {
    private String dietaPrincipal, dieta[];
    
    public Dieta(String dietaPrincipal, String[] dieta){
        this.dietaPrincipal = dietaPrincipal;
        this.dieta = dieta;
    }

    public String getDietaPrincipal() {
        return dietaPrincipal;
    }

    public void setDietaPrincipal(String dietaPrincipal) {
        this.dietaPrincipal = dietaPrincipal;
    }

    public String[] getDieta() {
        return dieta;
    }

    public void setDieta(String[] dieta) {
        this.dieta = dieta;
    }
    
}
