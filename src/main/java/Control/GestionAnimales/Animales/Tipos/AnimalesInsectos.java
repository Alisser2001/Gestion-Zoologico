/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Tipos;

import Control.GestionAnimales.Animales.Caracteristicas.Dieta;
import Control.GestionAnimales.Animales.Caracteristicas.CaracteristicasEspecie;
import Control.GestionAnimales.Animales.Caracteristicas.Peligrosidad;
import Control.GestionAnimales.Animales.Caracteristicas.Ubicacion;
import java.util.ArrayList;

/**
 *
 * @author Alisser
 */
public class AnimalesInsectos extends Animales {
    public static int cantAnimalesInsectos = 0;
    public static ArrayList<AnimalesInsectos> animalesInsectos = new ArrayList<>();
    private String nivelPeligrosidad, precauciones[], tipoVeneno;
    private boolean metaforfosis;
    private int paresPatas, paresAlas;
    
    public AnimalesInsectos(
        int codigo,
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Dieta dieta,
        Peligrosidad peligrosidad
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                ubicacion.getHabitad(), 
                ubicacion.getZona(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(), 
                ubicacion.getProcedencia()
        );
        if(peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
        this.metaforfosis = morfologia.isMetamorfosis();
        this.paresAlas = morfologia.getParesAlas();
        this.paresPatas = morfologia.getParesPatas();
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public boolean isMetaforfosis() {
        return metaforfosis;
    }

    public void setMetaforfosis(boolean metaforfosis) {
        this.metaforfosis = metaforfosis;
    }

    public int getParesPatas() {
        return paresPatas;
    }

    public void setParesPatas(int paresPatas) {
        this.paresPatas = paresPatas;
    }

    public int getParesAlas() {
        return paresAlas;
    }

    public void setParesAlas(int paresAlas) {
        this.paresAlas = paresAlas;
    }
    public static int getCantAnimalesInsectos() {
        return cantAnimalesInsectos;
    }
    public static ArrayList<AnimalesInsectos> getAnimalesInsectos() {
        return animalesInsectos;
    }

    public static void setAnimalesInsectos(AnimalesInsectos animal, int cantidad) {
        AnimalesInsectos.animalesInsectos.add(animal);
        AnimalesInsectos.cantAnimalesInsectos+=cantidad;
    }
    
}
