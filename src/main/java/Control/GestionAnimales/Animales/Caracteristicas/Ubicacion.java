/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class Ubicacion {
    private String habitad, zona, procedencia;
    public Ubicacion(String procedencia, String habitad, String zona){
        this.procedencia = procedencia;
        this.habitad = habitad;
        this.zona = zona;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
}
