package Control.GestionAnimales.CopiaAnimales;

import Control.GestionAnimales.Animales.Tipos.AnimalesAvesTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosAcuaticos;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesAcuaticos;
import Control.GestionAnimales.Animales.Tipos.Animales;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferos;
import Control.GestionAnimales.Animales.Tipos.AnimalesPeces;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesExoticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesInsectos;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesAcuaticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesAves;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptiles;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesCarroñaRapiña;
import Control.GestionAnimales.Animales.Tipos.AnimalesAnfibios;
import Control.GestionAnimales.Animales.Caracteristicas.CaracteristicasEspecie;
import Control.GestionAnimales.Animales.Caracteristicas.Dieta;
import Control.GestionAnimales.Animales.Caracteristicas.Peligrosidad;
import Control.GestionAnimales.Animales.Caracteristicas.Reproduccion;
import Control.GestionAnimales.Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class CrearAnimal {

    public AnimalesAnfibios crearAnfibio(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String habitad,
            String zona,
            String procedencia,
            String dietaPrincipal,
            String dietaCompleta[],
            String temperaturaHabitad,
            String riesgoExtincion,
            String tipoReproduccion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String precauciones[]
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, riesgoExtincion, temperaturaHabitad);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(tipoReproduccion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
        AnimalesAnfibios anfibio = new AnimalesAnfibios(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad);
        AnimalesAnfibios.setAnimalesAnfibios(anfibio);
        Animales.setAnimales(anfibio);
        return anfibio;
    }

    public AnimalesAvesAcuaticas crearAveAcuatica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String tempHabitad,
            String tiempoBuceo,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesAcuaticas aveAcuatica = new AnimalesAvesAcuaticas(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, tempHabitad, tiempoBuceo);
        AnimalesAves.setAnimalesAves(aveAcuatica);
        Animales.setAnimales(aveAcuatica);
        return aveAcuatica;
    }

    public AnimalesAvesCarroñaRapiña crearAveCarroñaRapiña(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesCarroñaRapiña aveCarroñaRapiña = new AnimalesAvesCarroñaRapiña(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, especiesCompatibles);
        AnimalesAves.setAnimalesAves(aveCarroñaRapiña);
        Animales.setAnimales(aveCarroñaRapiña);
        return aveCarroñaRapiña;
    }

    public AnimalesAvesExoticas crearAveExotica(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesExoticas aveExotica = new AnimalesAvesExoticas(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, especiesCompatibles);
        AnimalesAves.setAnimalesAves(aveExotica);
        Animales.setAnimales(aveExotica);
        return aveExotica;
    }

    public AnimalesAvesTerrestres crearAveTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            int edad,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            String envergadura,
            boolean vuela,
            String tipoPico,
            String colorPlumaje,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            boolean aveDeCorral
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, envergadura, edad, vuela, tipoPico, colorPlumaje, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesAvesTerrestres aveTerrestre = new AnimalesAvesTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, aveDeCorral);
        AnimalesAves.setAnimalesAves(aveTerrestre);
        Animales.setAnimales(aveTerrestre);
        return aveTerrestre;
    }

    public AnimalesInsectos crearInsectos(
            int codigo,
            String nombre,
            String especie,
            boolean metamorfosis,
            String habitad,
            String zona,
            String procedencia,
            int cantidad,
            int paresPatas,
            int paresAlas,
            String riesgoExtincion,
            String dietaPrincipal,
            String dietaCompleta[],
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, metamorfosis, paresPatas, paresAlas, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
        AnimalesInsectos insecto = new AnimalesInsectos(codigo, caracteristicas, ubicacion, dieta, peligrosidad);
        AnimalesInsectos.setAnimalesInsectos(insecto, cantidad);
        Animales.setAnimales(insecto);
        return insecto;
    }

    public AnimalesMamiferosAcuaticos crearMamiferoAcuatico(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            int edad,
            String tiempoBuceo,
            String mecanismoRespiracion,
            int numAletas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, edad, peso, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesMamiferosAcuaticos mamiferoAcuatico = new AnimalesMamiferosAcuaticos(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numAletas, tiempoBuceo, especiesCompatibles, mecanismoRespiracion);
        AnimalesMamiferos.setAnimalesMamiferos(mamiferoAcuatico);
        Animales.setAnimales(mamiferoAcuatico);
        return mamiferoAcuatico;
    }

    public AnimalesMamiferosTerrestres crearMamiferoTerrestre(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            String dietaPrincipal,
            String dietaCompleta[],
            int edad,
            int numPatas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String comportamiento,
            String[] precauciones
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, edad, peso, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesMamiferosTerrestres mamiferoTerrestre = new AnimalesMamiferosTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numPatas, comportamiento);
        AnimalesMamiferos.setAnimalesMamiferos(mamiferoTerrestre);
        Animales.setAnimales(mamiferoTerrestre);
        return mamiferoTerrestre;
    }

    public AnimalesPeces crearPeces(
            int codigo,
            String nombre,
            String especie,
            String genero,
            String coloracion,
            String tipoAgua,
            String tempAcuario,
            String dietaPrincipal,
            String dietaCompleta[],
            String habitad,
            String zona,
            String procedencia,
            int cantidad,
            String riesgoExtincion,
            String reproduccion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            String[] precauciones,
            String[] especiesCompatibles
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, coloracion, riesgoExtincion, cantidad);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reprod = new Reproduccion(reproduccion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, especiesCompatibles, precauciones);
        AnimalesPeces pez = new AnimalesPeces(codigo, caracteristicas, ubicacion, tipoAgua, tempAcuario, reprod, dieta, peligrosidad);
        AnimalesPeces.setAnimalesPeces(pez, cantidad);
        Animales.setAnimales(pez);
        return pez;
    }

    public AnimalesReptilesAcuaticos crearReptilesAcuaticos(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String dietaPrincipal,
            String dietaCompleta[],
            String tipoPiel,
            String coloracion,
            String metodoRespiracion,
            int numAletas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String tempEncubacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, edad, tipoPiel, coloracion, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion, tempEncubacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesReptilesAcuaticos reptilAcuatico = new AnimalesReptilesAcuaticos(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, metodoRespiracion, numAletas);
        AnimalesReptiles.setAnimalesReptiles(reptilAcuatico);
        Animales.setAnimales(reptilAcuatico);
        return reptilAcuatico;
    }

    public AnimalesReptilesTerrestres crearReptilesTerrestres(
            int codigo,
            String nombre,
            String especie,
            String genero,
            float peso,
            int edad,
            String dietaPrincipal,
            String dietaCompleta[],
            String tipoPiel,
            String coloracion,
            int numPatas,
            String habitad,
            String zona,
            String procedencia,
            String riesgoExtincion,
            boolean gestacion,
            String tipoGestacion,
            String tiempoGestacion,
            String tempEncubacion,
            boolean peligroso,
            String nivelPeligrosidad,
            boolean venenoso,
            String tipoVeneno,
            boolean maltratado,
            String comportamientoSocial,
            String caracter,
            String[] precauciones
    ) {
        CaracteristicasEspecie caracteristicas = new CaracteristicasEspecie(nombre, especie, genero, peso, edad, tipoPiel, coloracion, riesgoExtincion);
        Ubicacion ubicacion = new Ubicacion(procedencia, habitad, zona);
        Reproduccion reproduccion = new Reproduccion(gestacion, tipoGestacion, tiempoGestacion, tempEncubacion);
        Dieta dieta = new Dieta(dietaPrincipal, dietaCompleta);
        Peligrosidad peligrosidad = new Peligrosidad(peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        AnimalesReptilesTerrestres reptilTerrestre = new AnimalesReptilesTerrestres(codigo, caracteristicas, ubicacion, reproduccion, dieta, peligrosidad, numPatas);
        AnimalesReptiles.setAnimalesReptiles(reptilTerrestre);
        Animales.setAnimales(reptilTerrestre);
        return reptilTerrestre;
    }
}
