/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class Reproduccion {
    private String reproduccion, tipoGestacion, tiempoGestacion, tempEncubacion;
    private boolean gestacion;
    //Constructor anfibios, peces
    public Reproduccion(String reproduccion){
        this.reproduccion = reproduccion;
    }
    //Constructor Aves, Mamiferos
    public Reproduccion(boolean gestacion, String tipoGestacion, String tiempoGestacion){
        this.gestacion = gestacion;
        this.tipoGestacion = tipoGestacion;
        this.tiempoGestacion = tiempoGestacion;
    }
    //Contructor Reptiles
    public Reproduccion(boolean gestacion, String tipoGestacion, String tiempoGestacion, String tempEncubacion){
        this.gestacion = gestacion;
        this.tipoGestacion = tipoGestacion;
        this.tiempoGestacion = tiempoGestacion;
        this.tempEncubacion = tempEncubacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(String tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    public String getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(String tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

    public String getTempEncubacion() {
        return tempEncubacion;
    }

    public void setTempEncubacion(String tempEncubacion) {
        this.tempEncubacion = tempEncubacion;
    }

    public boolean isGestacion() {
        return gestacion;
    }

    public void setGestacion(boolean gestacion) {
        this.gestacion = gestacion;
    }
    
}
