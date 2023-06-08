/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Caracteristicas;

/**
 *
 * @author Alisser
 */
public class CaracteristicasEspecie {
    private String nombre, especie, genero, envergadura, tipoPico, colorPlumaje, coloracion, tipoPiel, riesgoExtincion, temperaturaHabitad;
    private float peso;
    private int paresPatas, paresAlas, edad, cantidad;
    boolean metamorfosis, vuela;
    
    //Constructor Anfibios
    public CaracteristicasEspecie(
            String nombre,
            String especie, 
            String genero, 
            String riesgoExtincion,
            String temperaturaHabitad
    )
    {
        this.nombre = nombre;
        this.riesgoExtincion = riesgoExtincion;
        this.especie = especie;
        this.genero = genero;
        this.temperaturaHabitad = temperaturaHabitad;
    }
    //Constructor para Aves
    public CaracteristicasEspecie(
            String nombre,
            String especie, 
            String genero, 
            float peso, 
            String envergadura, 
            int edad,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String riesgoExtincion
    ){
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.peso = peso;
        this.envergadura = envergadura;
        this.vuela = vuela;
        this.edad = edad;
        this.tipoPico = tipoPico;
        this.colorPlumaje = colorPlumaje;
        this.riesgoExtincion = riesgoExtincion;
    }
    //Constructor para Insectos
    public CaracteristicasEspecie(
            String nombre,
            String especie,
            boolean metamorfosis,
            int paresPatas,
            int paresAlas,
            String riesgoExtincion
    ){
        this.nombre = nombre;
        this.especie = especie;
        this.metamorfosis = metamorfosis;
        this.paresPatas = paresPatas;
        this.paresAlas = paresAlas;
        this.riesgoExtincion = riesgoExtincion;
    }
    //Constructor Mamiferos
    public CaracteristicasEspecie(
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String riesgoExtincion
    ){
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.riesgoExtincion = riesgoExtincion;
    }
    //Constructor Peces
    public CaracteristicasEspecie(
            String nombre,
            String especie,
            String genero,
            String coloracion,
            String riesgoExtincion,
            int cantidad
    ){
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.coloracion = coloracion;
        this.riesgoExtincion = riesgoExtincion;
        this.cantidad = cantidad;
    }
    //Constructor Reptiles
    public CaracteristicasEspecie(
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String tipoPiel,
            String coloracion,
            String riesgoExtincion
    ){
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.peso = peso;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.coloracion = coloracion;
        this.riesgoExtincion = riesgoExtincion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getRiesgoExtincion() {
        return riesgoExtincion;
    }

    public void setRiesgoExtincion(String riesgoExtincion) {
        this.riesgoExtincion = riesgoExtincion;
    }

    public String getTemperaturaHabitad() {
        return temperaturaHabitad;
    }

    public void setTemperaturaHabitad(String temperaturaHabitad) {
        this.temperaturaHabitad = temperaturaHabitad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isMetamorfosis() {
        return metamorfosis;
    }

    public void setMetamorfosis(boolean metamorfosis) {
        this.metamorfosis = metamorfosis;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
