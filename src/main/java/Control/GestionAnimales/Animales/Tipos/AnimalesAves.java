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
public abstract class AnimalesAves extends Animales{
    public static int cantAnimalesAves = 0;
    public static ArrayList<AnimalesAves> animalesAves = new ArrayList<>();
    private String 
            nivelPeligrosidad, 
            envergadura, 
            tipoPico, 
            colorPlumaje, 
            tipoVeneno, 
            tipoGestacion, 
            tiempoGestacion,
            precauciones[],
            comportamientoSocial,
            caracter;
    private boolean vuela;
    
    public AnimalesAves(
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
        if(reproduccion.isGestacion()){
            this.tipoGestacion = reproduccion.getTipoGestacion();
            this.tiempoGestacion = reproduccion.getTiempoGestacion();
        }
        this.envergadura = morfologia.getEnvergadura();
        this.tipoPico = morfologia.getTipoPico();
        this.colorPlumaje = morfologia.getColorPlumaje();
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
        if(peligrosidad.isMaltratado()){
            this.comportamientoSocial = peligrosidad.getComportamientoSocial();
            this.caracter = peligrosidad.getCaracter();
        }
        this.vuela = morfologia.isVuela();
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
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

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    public static int getCantAnimalesAves() {
        return cantAnimalesAves;
    }

    public static ArrayList<AnimalesAves> getAnimalesAves() {
        return animalesAves;
    }

    public static void setAnimalesAves(AnimalesAves animal) {
        AnimalesAves.animalesAves.add(animal);
        AnimalesAves.cantAnimalesAves+=1;
    }
}
