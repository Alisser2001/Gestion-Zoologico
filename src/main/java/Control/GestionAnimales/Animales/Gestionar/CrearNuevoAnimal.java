/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Gestionar;

import Control.GestionAnimales.CopiaAnimales.CrearAnimal;
import Control.GestionAnimales.Animales.Tipos.AnimalesAnfibios;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesAcuaticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesCarroñaRapiña;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesExoticas;
import Control.GestionAnimales.Animales.Tipos.AnimalesAvesTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesInsectos;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosAcuaticos;
import Control.GestionAnimales.Animales.Tipos.AnimalesMamiferosTerrestres;
import Control.GestionAnimales.Animales.Tipos.AnimalesPeces;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesAcuaticos;
import Control.GestionAnimales.Animales.Tipos.AnimalesReptilesTerrestres;
import Control.GestionAnimales.CopiaAnimales.InfoJSON.ReadJSON;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class CrearNuevoAnimal {

    ReadJSON readJson = new ReadJSON();

    public AnimalesAnfibios crearNuevoAnfibio(
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
    ) throws IOException {
        System.out.println(nombre);
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray anfibios = readJson.AnimalesAnfibiosJSON();
        JSONObject nuevoAnfibio = new JSONObject();
        nuevoAnfibio.put("codigo", codigo);
        nuevoAnfibio.put("nombre", nombre);
        nuevoAnfibio.put("especie", especie);
        nuevoAnfibio.put("genero", genero);
        nuevoAnfibio.put("habitad", habitad);
        nuevoAnfibio.put("zona", zona);
        nuevoAnfibio.put("procedencia", procedencia);
        nuevoAnfibio.put("dietaPrincipal", dietaPrincipal);
        nuevoAnfibio.put("dietaCompleta", dietaCompleta);
        nuevoAnfibio.put("temperaturaHabitad", temperaturaHabitad);
        nuevoAnfibio.put("riesgoExtincion", riesgoExtincion);
        nuevoAnfibio.put("tipoReproduccion", tipoReproduccion);
        nuevoAnfibio.put("peligroso", peligroso);
        nuevoAnfibio.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoAnfibio.put("venenoso", venenoso);
        nuevoAnfibio.put("tipoVeneno", tipoVeneno);
        nuevoAnfibio.put("precauciones", precauciones);
        anfibios.put(nuevoAnfibio);
        infoJson.getJSONArray("animales_anfibios").put(nuevoAnfibio);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAnfibio(codigo, nombre, especie, genero, habitad, zona, procedencia, dietaPrincipal, dietaCompleta, temperaturaHabitad, riesgoExtincion, tipoReproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
    }

    public AnimalesAvesAcuaticas crearNuevaAveAcuatica(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesAcuaticas = readJson.AnimalesAvesAcuaticasJSON();
        JSONObject nuevaAveAcuatica = new JSONObject();
        nuevaAveAcuatica.put("codigo", codigo);
        nuevaAveAcuatica.put("nombre", nombre);
        nuevaAveAcuatica.put("especie", especie);
        nuevaAveAcuatica.put("genero", genero);
        nuevaAveAcuatica.put("edad", edad);
        nuevaAveAcuatica.put("peso", peso);
        nuevaAveAcuatica.put("dietaPrincipal", dietaPrincipal);
        nuevaAveAcuatica.put("dietaCompleta", dietaCompleta);
        nuevaAveAcuatica.put("envergadura", envergadura);
        nuevaAveAcuatica.put("vuela", vuela);
        nuevaAveAcuatica.put("tipoPico", tipoPico);
        nuevaAveAcuatica.put("colorPlumaje", colorPlumaje);
        nuevaAveAcuatica.put("habitad", habitad);
        nuevaAveAcuatica.put("zona", zona);
        nuevaAveAcuatica.put("procedencia", procedencia);
        nuevaAveAcuatica.put("tempHabitad", tempHabitad);
        nuevaAveAcuatica.put("riesgoExtincion", riesgoExtincion);
        nuevaAveAcuatica.put("gestacion", gestacion);
        nuevaAveAcuatica.put("tipoGestacion", tipoGestacion);
        nuevaAveAcuatica.put("tiempoGestacion", tiempoGestacion);
        nuevaAveAcuatica.put("peligroso", peligroso);
        nuevaAveAcuatica.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveAcuatica.put("venenoso", venenoso);
        nuevaAveAcuatica.put("tipoVeneno", tipoVeneno);
        nuevaAveAcuatica.put("maltratado", maltratado);
        nuevaAveAcuatica.put("comportamientoSocial", comportamientoSocial);
        nuevaAveAcuatica.put("caracter", caracter);
        nuevaAveAcuatica.put("precauciones", precauciones);
        avesAcuaticas.put(nuevaAveAcuatica);
        infoJson.getJSONArray("animales_aves_acuaticas").put(nuevaAveAcuatica);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveAcuatica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, tempHabitad, tiempoBuceo, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }

    public AnimalesAvesCarroñaRapiña crearNuevaAveCarroñaRapiña(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesCarroñaRapiña = readJson.AnimalesAvesCarroñaRapiñaJSON();
        JSONObject nuevaAveCarroñaRapiña = new JSONObject();
        nuevaAveCarroñaRapiña.put("codigo", codigo);
        nuevaAveCarroñaRapiña.put("nombre", nombre);
        nuevaAveCarroñaRapiña.put("especie", especie);
        nuevaAveCarroñaRapiña.put("genero", genero);
        nuevaAveCarroñaRapiña.put("edad", edad);
        nuevaAveCarroñaRapiña.put("peso", peso);
        nuevaAveCarroñaRapiña.put("dietaPrincipal", dietaPrincipal);
        nuevaAveCarroñaRapiña.put("dietaCompleta", dietaCompleta);
        nuevaAveCarroñaRapiña.put("envergadura", envergadura);
        nuevaAveCarroñaRapiña.put("vuela", vuela);
        nuevaAveCarroñaRapiña.put("tipoPico", tipoPico);
        nuevaAveCarroñaRapiña.put("colorPlumaje", colorPlumaje);
        nuevaAveCarroñaRapiña.put("habitad", habitad);
        nuevaAveCarroñaRapiña.put("zona", zona);
        nuevaAveCarroñaRapiña.put("procedencia", procedencia);
        nuevaAveCarroñaRapiña.put("riesgoExtincion", riesgoExtincion);
        nuevaAveCarroñaRapiña.put("gestacion", gestacion);
        nuevaAveCarroñaRapiña.put("tipoGestacion", tipoGestacion);
        nuevaAveCarroñaRapiña.put("tiempoGestacion", tiempoGestacion);
        nuevaAveCarroñaRapiña.put("peligroso", peligroso);
        nuevaAveCarroñaRapiña.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveCarroñaRapiña.put("venenoso", venenoso);
        nuevaAveCarroñaRapiña.put("tipoVeneno", tipoVeneno);
        nuevaAveCarroñaRapiña.put("maltratado", maltratado);
        nuevaAveCarroñaRapiña.put("comportamientoSocial", comportamientoSocial);
        nuevaAveCarroñaRapiña.put("caracter", caracter);
        nuevaAveCarroñaRapiña.put("precauciones", precauciones);
        nuevaAveCarroñaRapiña.put("especiesCompatibles", especiesCompatibles);
        avesCarroñaRapiña.put(nuevaAveCarroñaRapiña);
        infoJson.getJSONArray("animales_aves_carroña_rapiña").put(nuevaAveCarroñaRapiña);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveCarroñaRapiña(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesAvesExoticas crearNuevaAveExotica(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesExoticas = readJson.AnimalesAvesExoticasJSON();
        JSONObject nuevaAveExotica = new JSONObject();
        nuevaAveExotica.put("codigo", codigo);
        nuevaAveExotica.put("nombre", nombre);
        nuevaAveExotica.put("especie", especie);
        nuevaAveExotica.put("genero", genero);
        nuevaAveExotica.put("edad", edad);
        nuevaAveExotica.put("peso", peso);
        nuevaAveExotica.put("dietaPrincipal", dietaPrincipal);
        nuevaAveExotica.put("dietaCompleta", dietaCompleta);
        nuevaAveExotica.put("envergadura", envergadura);
        nuevaAveExotica.put("vuela", vuela);
        nuevaAveExotica.put("tipoPico", tipoPico);
        nuevaAveExotica.put("colorPlumaje", colorPlumaje);
        nuevaAveExotica.put("habitad", habitad);
        nuevaAveExotica.put("zona", zona);
        nuevaAveExotica.put("procedencia", procedencia);
        nuevaAveExotica.put("riesgoExtincion", riesgoExtincion);
        nuevaAveExotica.put("gestacion", gestacion);
        nuevaAveExotica.put("tipoGestacion", tipoGestacion);
        nuevaAveExotica.put("tiempoGestacion", tiempoGestacion);
        nuevaAveExotica.put("peligroso", peligroso);
        nuevaAveExotica.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveExotica.put("venenoso", venenoso);
        nuevaAveExotica.put("tipoVeneno", tipoVeneno);
        nuevaAveExotica.put("maltratado", maltratado);
        nuevaAveExotica.put("comportamientoSocial", comportamientoSocial);
        nuevaAveExotica.put("caracter", caracter);
        nuevaAveExotica.put("precauciones", precauciones);
        nuevaAveExotica.put("especiesCompatibles", especiesCompatibles);
        avesExoticas.put(nuevaAveExotica);
        infoJson.getJSONArray("animales_aves_exoticas").put(nuevaAveExotica);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveExotica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesAvesTerrestres crearNuevaAveTerrestre(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesTerrestres = readJson.AnimalesAvesTerrestresJSON();
        JSONObject nuevaAveTerrestre = new JSONObject();
        nuevaAveTerrestre.put("codigo", codigo);
        nuevaAveTerrestre.put("nombre", nombre);
        nuevaAveTerrestre.put("especie", especie);
        nuevaAveTerrestre.put("genero", genero);
        nuevaAveTerrestre.put("edad", edad);
        nuevaAveTerrestre.put("peso", peso);
        nuevaAveTerrestre.put("dietaPrincipal", dietaPrincipal);
        nuevaAveTerrestre.put("dietaCompleta", dietaCompleta);
        nuevaAveTerrestre.put("envergadura", envergadura);
        nuevaAveTerrestre.put("vuela", vuela);
        nuevaAveTerrestre.put("tipoPico", tipoPico);
        nuevaAveTerrestre.put("colorPlumaje", colorPlumaje);
        nuevaAveTerrestre.put("habitad", habitad);
        nuevaAveTerrestre.put("zona", zona);
        nuevaAveTerrestre.put("procedencia", procedencia);
        nuevaAveTerrestre.put("riesgoExtincion", riesgoExtincion);
        nuevaAveTerrestre.put("gestacion", gestacion);
        nuevaAveTerrestre.put("tipoGestacion", tipoGestacion);
        nuevaAveTerrestre.put("tiempoGestacion", tiempoGestacion);
        nuevaAveTerrestre.put("peligroso", peligroso);
        nuevaAveTerrestre.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevaAveTerrestre.put("venenoso", venenoso);
        nuevaAveTerrestre.put("tipoVeneno", tipoVeneno);
        nuevaAveTerrestre.put("maltratado", maltratado);
        nuevaAveTerrestre.put("comportamientoSocial", comportamientoSocial);
        nuevaAveTerrestre.put("caracter", caracter);
        nuevaAveTerrestre.put("precauciones", precauciones);
        nuevaAveTerrestre.put("aveDeCorral", aveDeCorral);
        avesTerrestres.put(nuevaAveTerrestre);
        infoJson.getJSONArray("animales_aves_terrestres").put(nuevaAveTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearAveTerrestre(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, aveDeCorral);
    }

    public AnimalesInsectos crearNuevosInsectos(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray insectos = readJson.AnimalesInsectosJSON();
        JSONObject nuevoInsecto = new JSONObject();
        nuevoInsecto.put("codigo", codigo);
        nuevoInsecto.put("nombre", nombre);
        nuevoInsecto.put("especie", especie);
        nuevoInsecto.put("metamorfosis", metamorfosis);
        nuevoInsecto.put("habitad", habitad);
        nuevoInsecto.put("zona", zona);
        nuevoInsecto.put("procedencia", procedencia);
        nuevoInsecto.put("cantidad", cantidad);
        nuevoInsecto.put("paresPatas", paresPatas);
        nuevoInsecto.put("paresAlas", paresAlas);
        nuevoInsecto.put("riesgoExtincion", riesgoExtincion);
        nuevoInsecto.put("dietaPrincipal", dietaPrincipal);
        nuevoInsecto.put("dietaCompleta", dietaCompleta);
        nuevoInsecto.put("peligroso", peligroso);
        nuevoInsecto.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoInsecto.put("venenoso", venenoso);
        nuevoInsecto.put("tipoVeneno", tipoVeneno);
        nuevoInsecto.put("precauciones", precauciones);
        insectos.put(nuevoInsecto);
        infoJson.getJSONArray("animales_insectos").put(nuevoInsecto);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearInsectos(codigo, nombre, especie, metamorfosis, habitad, zona, procedencia, cantidad, paresPatas, paresAlas, riesgoExtincion, dietaPrincipal, dietaCompleta, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
    }

    public AnimalesMamiferosAcuaticos crearNuevoMamiferoAcuatico(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        JSONObject nuevoMamiferoAcuatico = new JSONObject();
        nuevoMamiferoAcuatico.put("codigo", codigo);
        nuevoMamiferoAcuatico.put("nombre", nombre);
        nuevoMamiferoAcuatico.put("especie", especie);
        nuevoMamiferoAcuatico.put("genero", genero);
        nuevoMamiferoAcuatico.put("peso", peso);
        nuevoMamiferoAcuatico.put("dietaPrincipal", dietaPrincipal);
        nuevoMamiferoAcuatico.put("dietaCompleta", dietaCompleta);
        nuevoMamiferoAcuatico.put("edad", edad);
        nuevoMamiferoAcuatico.put("tiempoBuceo", tiempoBuceo);
        nuevoMamiferoAcuatico.put("mecanismoRespiracion", mecanismoRespiracion);
        nuevoMamiferoAcuatico.put("numAletas", numAletas);
        nuevoMamiferoAcuatico.put("habitad", habitad);
        nuevoMamiferoAcuatico.put("zona", zona);
        nuevoMamiferoAcuatico.put("procedencia", procedencia);
        nuevoMamiferoAcuatico.put("riesgoExtincion", riesgoExtincion);
        nuevoMamiferoAcuatico.put("gestacion", gestacion);
        nuevoMamiferoAcuatico.put("tipoGestacion", tipoGestacion);
        nuevoMamiferoAcuatico.put("tiempoGestacion", tiempoGestacion);
        nuevoMamiferoAcuatico.put("peligroso", peligroso);
        nuevoMamiferoAcuatico.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoMamiferoAcuatico.put("venenoso", venenoso);
        nuevoMamiferoAcuatico.put("tipoVeneno", tipoVeneno);
        nuevoMamiferoAcuatico.put("maltratado", maltratado);
        nuevoMamiferoAcuatico.put("comportamientoSocial", comportamientoSocial);
        nuevoMamiferoAcuatico.put("caracter", caracter);
        nuevoMamiferoAcuatico.put("precauciones", precauciones);
        nuevoMamiferoAcuatico.put("especiesCompatibles", especiesCompatibles);
        mamiferosAcuaticos.put(nuevoMamiferoAcuatico);
        infoJson.getJSONArray("animales_mamiferos_acuaticos").put(nuevoMamiferoAcuatico);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearMamiferoAcuatico(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, tiempoBuceo, mecanismoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
    }

    public AnimalesMamiferosTerrestres crearNuevoMamiferoTerrestre(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosTerrestres = readJson.AnimalesMamiferosTerrestresJSON();
        JSONObject nuevoMamiferoTerrestre = new JSONObject();
        nuevoMamiferoTerrestre.put("codigo", codigo);
        nuevoMamiferoTerrestre.put("nombre", nombre);
        nuevoMamiferoTerrestre.put("especie", especie);
        nuevoMamiferoTerrestre.put("genero", genero);
        nuevoMamiferoTerrestre.put("peso", peso);
        nuevoMamiferoTerrestre.put("dietaPrincipal", dietaPrincipal);
        nuevoMamiferoTerrestre.put("dietaCompleta", dietaCompleta);
        nuevoMamiferoTerrestre.put("edad", edad);
        nuevoMamiferoTerrestre.put("numPatas", numPatas);
        nuevoMamiferoTerrestre.put("habitad", habitad);
        nuevoMamiferoTerrestre.put("zona", zona);
        nuevoMamiferoTerrestre.put("procedencia", procedencia);
        nuevoMamiferoTerrestre.put("riesgoExtincion", riesgoExtincion);
        nuevoMamiferoTerrestre.put("gestacion", gestacion);
        nuevoMamiferoTerrestre.put("tipoGestacion", tipoGestacion);
        nuevoMamiferoTerrestre.put("tiempoGestacion", tiempoGestacion);
        nuevoMamiferoTerrestre.put("peligroso", peligroso);
        nuevoMamiferoTerrestre.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoMamiferoTerrestre.put("venenoso", venenoso);
        nuevoMamiferoTerrestre.put("tipoVeneno", tipoVeneno);
        nuevoMamiferoTerrestre.put("maltratado", maltratado);
        nuevoMamiferoTerrestre.put("comportamientoSocial", comportamientoSocial);
        nuevoMamiferoTerrestre.put("caracter", caracter);
        nuevoMamiferoTerrestre.put("comportamiento", comportamiento);
        nuevoMamiferoTerrestre.put("precauciones", precauciones);
        mamiferosTerrestres.put(nuevoMamiferoTerrestre);
        infoJson.getJSONArray("animales_mamiferos_terrestres").put(nuevoMamiferoTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearMamiferoTerrestre(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, comportamiento, precauciones);
    }

    public AnimalesPeces crearNuevosPeces(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray peces = readJson.AnimalesPecesJSON();
        JSONObject nuevoPez = new JSONObject();
        nuevoPez.put("codigo", codigo);
        nuevoPez.put("nombre", nombre);
        nuevoPez.put("especie", especie);
        nuevoPez.put("genero", genero);
        nuevoPez.put("coloracion", coloracion);
        nuevoPez.put("tipoAgua", tipoAgua);
        nuevoPez.put("tempAcuario", tempAcuario);
        nuevoPez.put("dietaPrincipal", dietaPrincipal);
        nuevoPez.put("dietaCompleta", dietaCompleta);
        nuevoPez.put("habitad", habitad);
        nuevoPez.put("zona", zona);
        nuevoPez.put("procedencia", procedencia);
        nuevoPez.put("cantidad", cantidad);
        nuevoPez.put("riesgoExtincion", riesgoExtincion);
        nuevoPez.put("reproduccion", reproduccion);
        nuevoPez.put("peligroso", peligroso);
        nuevoPez.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoPez.put("venenoso", venenoso);
        nuevoPez.put("tipoVeneno", tipoVeneno);
        nuevoPez.put("precauciones", precauciones);
        nuevoPez.put("especiesCompatibles", especiesCompatibles);
        peces.put(nuevoPez);
        infoJson.getJSONArray("animales_peces").put(nuevoPez);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearPeces(codigo, nombre, especie, genero, coloracion, tipoAgua, tempAcuario, dietaPrincipal, dietaCompleta, habitad, zona, procedencia, cantidad, riesgoExtincion, reproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones, especiesCompatibles);
    }

    public AnimalesReptilesAcuaticos crearNuevoReptilAcuatico(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        JSONObject nuevoReptilAcuatico = new JSONObject();
        nuevoReptilAcuatico.put("codigo", codigo);
        nuevoReptilAcuatico.put("nombre", nombre);
        nuevoReptilAcuatico.put("especie", especie);
        nuevoReptilAcuatico.put("genero", genero);
        nuevoReptilAcuatico.put("peso", peso);
        nuevoReptilAcuatico.put("edad", edad);
        nuevoReptilAcuatico.put("dietaPrincipal", dietaPrincipal);
        nuevoReptilAcuatico.put("dietaCompleta", dietaCompleta);
        nuevoReptilAcuatico.put("tipoPiel", tipoPiel);
        nuevoReptilAcuatico.put("coloracion", coloracion);
        nuevoReptilAcuatico.put("metodoRespiracion", metodoRespiracion);
        nuevoReptilAcuatico.put("numAletas", numAletas);
        nuevoReptilAcuatico.put("habitad", habitad);
        nuevoReptilAcuatico.put("zona", zona);
        nuevoReptilAcuatico.put("procedencia", procedencia);
        nuevoReptilAcuatico.put("riesgoExtincion", riesgoExtincion);
        nuevoReptilAcuatico.put("gestacion", gestacion);
        nuevoReptilAcuatico.put("tipoGestacion", tipoGestacion);
        nuevoReptilAcuatico.put("tiempoGestacion", tiempoGestacion);
        nuevoReptilAcuatico.put("tempEncubacion", tempEncubacion);
        nuevoReptilAcuatico.put("peligroso", peligroso);
        nuevoReptilAcuatico.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoReptilAcuatico.put("venenoso", venenoso);
        nuevoReptilAcuatico.put("tipoVeneno", tipoVeneno);
        nuevoReptilAcuatico.put("maltratado", maltratado);
        nuevoReptilAcuatico.put("comportamientoSocial", comportamientoSocial);
        nuevoReptilAcuatico.put("caracter", caracter);
        nuevoReptilAcuatico.put("precauciones", precauciones);
        reptilesAcuaticos.put(nuevoReptilAcuatico);
        infoJson.getJSONArray("animales_reptiles_acuaticos").put(nuevoReptilAcuatico);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearReptilesAcuaticos(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, metodoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }

    public AnimalesReptilesTerrestres crearNuevoReptilTerrestre(
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
    ) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesTerrestres = readJson.AnimalesReptilesTerrestresJSON();
        JSONObject nuevoReptilTerrestre = new JSONObject();
        nuevoReptilTerrestre.put("codigo", codigo);
        nuevoReptilTerrestre.put("nombre", nombre);
        nuevoReptilTerrestre.put("especie", especie);
        nuevoReptilTerrestre.put("genero", genero);
        nuevoReptilTerrestre.put("peso", peso);
        nuevoReptilTerrestre.put("edad", edad);
        nuevoReptilTerrestre.put("dietaPrincipal", dietaPrincipal);
        nuevoReptilTerrestre.put("dietaCompleta", dietaCompleta);
        nuevoReptilTerrestre.put("tipoPiel", tipoPiel);
        nuevoReptilTerrestre.put("coloracion", coloracion);
        nuevoReptilTerrestre.put("numPatas", numPatas);
        nuevoReptilTerrestre.put("habitad", habitad);
        nuevoReptilTerrestre.put("zona", zona);
        nuevoReptilTerrestre.put("procedencia", procedencia);
        nuevoReptilTerrestre.put("riesgoExtincion", riesgoExtincion);
        nuevoReptilTerrestre.put("gestacion", gestacion);
        nuevoReptilTerrestre.put("tipoGestacion", tipoGestacion);
        nuevoReptilTerrestre.put("tiempoGestacion", tiempoGestacion);
        nuevoReptilTerrestre.put("tempEncubacion", tempEncubacion);
        nuevoReptilTerrestre.put("peligroso", peligroso);
        nuevoReptilTerrestre.put("nivelPeligrosidad", nivelPeligrosidad);
        nuevoReptilTerrestre.put("venenoso", venenoso);
        nuevoReptilTerrestre.put("tipoVeneno", tipoVeneno);
        nuevoReptilTerrestre.put("maltratado", maltratado);
        nuevoReptilTerrestre.put("comportamientoSocial", comportamientoSocial);
        nuevoReptilTerrestre.put("caracter", caracter);
        nuevoReptilTerrestre.put("precauciones", precauciones);
        reptilesTerrestres.put(nuevoReptilTerrestre);
        infoJson.getJSONArray("animales_reptiles_terrestres").put(nuevoReptilTerrestre);
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
        CrearAnimal crear = new CrearAnimal();
        return crear.crearReptilesTerrestres(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
    }
}
