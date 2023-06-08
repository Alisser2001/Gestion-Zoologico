/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class Peligrosidad {
    private String nivelPeligrosidad, tipoVeneno, precauciones[], comportamientoSocial, caracter, especiesCompatibles[];
    boolean peligroso, venenoso, maltratado;
    
    //Constructor Anfibios, Insectos
    public Peligrosidad(
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones
    ){
        this.peligroso = peligroso;
        this.nivelPeligrosidad = nivelPeligrosidad;
        this.venenoso = venenoso;
        this.tipoVeneno = tipoVeneno;
        this.precauciones = precauciones;
    }
    
    //Constructor Aves, Mamiferos, Reptiles
    public Peligrosidad(
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ){
        this.peligroso = peligroso;
        this.nivelPeligrosidad = nivelPeligrosidad;
        this.venenoso = venenoso;
        this.tipoVeneno = tipoVeneno;
        this.maltratado = maltratado;
        this.comportamientoSocial = comportamientoSocial;
        this.caracter = caracter;
        this.precauciones = precauciones;
    }
    //Constructor peces
    public Peligrosidad(
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] especiesCompatibles,
            String[] precauciones
    ){
        this.peligroso = peligroso;
        this.nivelPeligrosidad = nivelPeligrosidad;
        this.venenoso = venenoso;
        this.tipoVeneno = tipoVeneno;
        this.precauciones = precauciones;
        this.especiesCompatibles = especiesCompatibles;
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

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isMaltratado() {
        return maltratado;
    }

    public void setMaltratado(boolean maltratado) {
        this.maltratado = maltratado;
    }
    
}
