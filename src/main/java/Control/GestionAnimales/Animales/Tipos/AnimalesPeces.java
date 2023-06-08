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
public class AnimalesPeces extends Animales{
    public static int cantAnimalesPeces = 0;
    public static ArrayList<AnimalesPeces> animalesPeces = new ArrayList<>();
    private String 
            tipoAgua, 
            temperaturaAcuario, 
            nivelPeligrosidad, 
            coloracion, 
            reproduccion, 
            especiesCompatibles[],
            tipoVeneno,
            precauciones[];
    
    public AnimalesPeces(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        String tipoAgua,
        String temperaturaAcuario,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad    
    ){
        super(
                codigo, 
                morfologia.getNombre(), 
                morfologia.getEspecie(), 
                morfologia.getRiesgoExtincion(),
                morfologia.getGenero(), 
                ubicacion.getHabitad(), 
                ubicacion.getZona(),
                dieta.getDietaPrincipal(), 
                dieta.getDieta(),
                peligrosidad.isPeligroso(), 
                peligrosidad.isVenenoso(), 
                ubicacion.getProcedencia()
        );
        if (peligrosidad.isPeligroso()){
            this.nivelPeligrosidad = peligrosidad.getNivelPeligrosidad();
            this.precauciones = peligrosidad.getPrecauciones();
        }
        this.tipoAgua = tipoAgua;
        this.coloracion = morfologia.getColoracion();
        this.especiesCompatibles = peligrosidad.getEspeciesCompatibles();
        this.reproduccion = reproduccion.getReproduccion();
        this.temperaturaAcuario = temperaturaAcuario;
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getTemperaturaAcuario() {
        return temperaturaAcuario;
    }

    public void setTemperaturaAcuario(String temperaturaAcuario) {
        this.temperaturaAcuario = temperaturaAcuario;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
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

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String[] getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String[] precauciones) {
        this.precauciones = precauciones;
    }
    public static int getCantAnimalesPeces() {
        return cantAnimalesPeces;
    }

    public static ArrayList<AnimalesPeces> getAnimalesPeces() {
        return animalesPeces;
    }

    public static void setAnimalesPeces(AnimalesPeces animal, int cantidad) {
        AnimalesPeces.animalesPeces.add(animal);
        AnimalesPeces.cantAnimalesPeces+=cantidad;
    }
}

