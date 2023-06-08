/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Tipos;

import Control.GestionAnimales.Animales.Caracteristicas.Dieta;
import Control.GestionAnimales.Animales.Caracteristicas.CaracteristicasEspecie;
import Control.GestionAnimales.Animales.Caracteristicas.Peligrosidad;
import Control.GestionAnimales.Animales.Caracteristicas.Reproduccion;
import Control.GestionAnimales.Animales.Caracteristicas.Ubicacion;
import java.util.ArrayList;

/**
 *
 * @author Alisser
 */
public abstract class AnimalesReptiles extends Animales{
    public static int cantAnimalesReptiles = 0;
    public static ArrayList<AnimalesReptiles> animalesReptiles = new ArrayList<>();
    private String 
            nivelPeligrosidad,
            tempEncubacion,
            tipoVeneno,
            tipoPiel,
            coloracion,
            reproduccion,
            tipoGestacion,
            tiempoGestacion,
            precauciones[],
            comportamientoSocial,
            caracter;
    
    public AnimalesReptiles(
        int codigo,  
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                morfologia.getEdad(), 
                morfologia.getGenero(), 
                morfologia.getPeso(), 
                ubicacion.getHabitad(), 
                ubicacion.getZona(),
                reproduccion.isGestacion(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(),
                peligrosidad.isMaltratado(),
                ubicacion.getProcedencia()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        this.coloracion = morfologia.getColoracion();
        this.reproduccion = reproduccion.getReproduccion();
        this.tempEncubacion = reproduccion.getTempEncubacion();
        if(reproduccion.isGestacion()){
            this.tipoGestacion = reproduccion.getTipoGestacion();
            this.tiempoGestacion = reproduccion.getTiempoGestacion();
        }
        if(peligrosidad.isMaltratado()){
            this.comportamientoSocial = peligrosidad.getComportamientoSocial();
            this.caracter = peligrosidad.getCaracter();
        }
        this.tipoPiel = tipoPiel;
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getTempEncubacion() {
        return tempEncubacion;
    }

    public void setTempEncubacion(String tempEncubacion) {
        this.tempEncubacion = tempEncubacion;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
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

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }

    public String getComportamientoSocial() {
        return comportamientoSocial;
    }

    public void setComportamientoSocial(String comportamientoSocial) {
        this.comportamientoSocial = comportamientoSocial;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    public static int getCantAnimalesReptiles() {
        return cantAnimalesReptiles;
    }

    public static ArrayList<AnimalesReptiles> getAnimalesReptiles() {
        return animalesReptiles;
    }

    public static void setAnimalesReptiles(AnimalesReptiles animal) {
        AnimalesReptiles.animalesReptiles.add(animal);
        AnimalesReptiles.cantAnimalesReptiles++;
    }
}
