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
public class AnimalesAnfibios extends Animales{
    public static int cantAnimalesAnfibios = 0;
    public static ArrayList<AnimalesAnfibios> animalesAnfibios = new ArrayList<>();
    private String 
            tipoVeneno, 
            reproduccion, 
            temperaturaHabitad, 
            nivelPeligrosidad, 
            precauciones[];
    
    public AnimalesAnfibios(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion, 
        Dieta dieta,
        Peligrosidad peligrosidad
    )
    {
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
        this.reproduccion = reproduccion.getReproduccion();
        this.temperaturaHabitad = morfologia.getTemperaturaHabitad();
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getTemperaturaHabitad() {
        return temperaturaHabitad;
    }

    public void setTemperaturaHabitad(String temperaturaHabitad) {
        this.temperaturaHabitad = temperaturaHabitad;
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
    public static int getCantAnimalesAnfibios() {
        return cantAnimalesAnfibios;
    }

    public static ArrayList<AnimalesAnfibios> getAnimalesAnfibios() {
        return animalesAnfibios;
    }

    public static void setAnimalesAnfibios(AnimalesAnfibios animal) {
        AnimalesAnfibios.animalesAnfibios.add(animal);
        AnimalesAnfibios.cantAnimalesAnfibios+=1;
    }
}
