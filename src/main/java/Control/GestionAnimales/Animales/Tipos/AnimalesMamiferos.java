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
public abstract class AnimalesMamiferos extends Animales{
    public static int cantAnimalesMamiferos = 0;
    public static ArrayList<AnimalesMamiferos> animalesMamiferos = new ArrayList<>();
    private String 
            tipoGestacion, 
            nivelPeligrosidad, 
            tipoVeneno, 
            tiempoGestacion,
            precauciones[],
            comportamientoSocial,
            caracter;
    
    public AnimalesMamiferos(
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
        if(peligrosidad.isMaltratado()){
            this.comportamientoSocial = peligrosidad.getComportamientoSocial();
            this.caracter = peligrosidad.getCaracter();
        }
        if(reproduccion.isGestacion()){
            this.tipoGestacion = reproduccion.getTipoGestacion();
            this.tiempoGestacion = reproduccion.getTiempoGestacion();
        }
        if(peligrosidad.isVenenoso()){
            this.tipoVeneno = peligrosidad.getTipoVeneno();
        }
    }

    public String getTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(String tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
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
    public static int getCantAnimalesMamiferos() {
        return cantAnimalesMamiferos;
    }

    public static ArrayList<AnimalesMamiferos> getAnimalesMamiferos() {
        return animalesMamiferos;
    }

    public static void setAnimalesMamiferos(AnimalesMamiferos animal) {
        AnimalesMamiferos.animalesMamiferos.add(animal);
        AnimalesMamiferos.cantAnimalesMamiferos++;
    }
    
}
