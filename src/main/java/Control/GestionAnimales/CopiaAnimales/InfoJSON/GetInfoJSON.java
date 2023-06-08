/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.CopiaAnimales.InfoJSON;

import Control.GestionAnimales.CopiaAnimales.CrearAnimal;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class GetInfoJSON {

    ReadJSON info = new ReadJSON();

    public void GetInfoAnfibios() throws IOException {
        int codigo;
        String nombre,
                especie,
                genero,
                habitad,
                zona,
                procedencia,
                dietaPrincipal,
                dietaCompleta[],
                temperaturaHabitad,
                riesgoExtincion,
                tipoReproduccion,
                tipoVeneno,
                precauciones[],
                nivelPeligrosidad;
        boolean peligroso, venenoso;

        JSONArray anfibios = info.AnimalesAnfibiosJSON();
        for (int i = 0; i < anfibios.length(); i++) {
            JSONObject anfibio = anfibios.getJSONObject(i);
            codigo = anfibio.getInt("codigo");
            nombre = anfibio.getString("nombre");
            especie = anfibio.getString("especie");
            genero = anfibio.getString("genero");
            habitad = anfibio.getString("habitad");
            zona = anfibio.getString("zona");
            procedencia = anfibio.getString("procedencia");
            dietaPrincipal = anfibio.getString("dietaPrincipal");
            JSONArray dieta = anfibio.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            temperaturaHabitad = anfibio.getString("temperaturaHabitad");
            riesgoExtincion = anfibio.getString("riesgoExtincion");
            tipoReproduccion = anfibio.getString("tipoReproduccion");
            tipoVeneno = anfibio.getString("tipoVeneno");
            JSONArray precau = anfibio.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = anfibio.getString("nivelPeligrosidad");
            peligroso = anfibio.getBoolean("peligroso");
            venenoso = anfibio.getBoolean("venenoso");
            CrearAnimal animal = new CrearAnimal();
            animal.crearAnfibio(
                    codigo, nombre, especie, genero, habitad, zona, 
                    procedencia, dietaPrincipal, dietaCompleta, temperaturaHabitad, 
                    riesgoExtincion, tipoReproduccion, peligroso, nivelPeligrosidad, 
                    venenoso, tipoVeneno, precauciones
                    );
        }
    }

    public void GetInfoAvesAcuaticas() throws IOException {
        int codigo, edad;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                envergadura,
                tipoPico,
                colorPlumaje,
                habitad,
                zona,
                procedencia,
                tempHabitad,
                tiempoBuceo,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion,
                vuela;

        JSONArray aves = info.AnimalesAvesAcuaticasJSON();
        for (int i = 0; i < aves.length(); i++) {
            JSONObject ave = aves.getJSONObject(i);
            codigo = ave.getInt("codigo");
            nombre = ave.getString("nombre");
            especie = ave.getString("especie");
            genero = ave.getString("genero");
            edad = ave.getInt("edad");
            peso = ave.getFloat("peso");
            envergadura = ave.getString("envergadura");
            tipoPico = ave.getString("tipoPico");
            colorPlumaje = ave.getString("colorPlumaje");
            vuela = ave.getBoolean("vuela");
            habitad = ave.getString("habitad");
            zona = ave.getString("zona");
            procedencia = ave.getString("procedencia");
            tempHabitad = ave.getString("tempHabitad");
            tiempoBuceo = ave.getString("tiempoBuceo");
            dietaPrincipal = ave.getString("dietaPrincipal");
            JSONArray dieta = ave.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = ave.getString("riesgoExtincion");
            gestacion = ave.getBoolean("gestacion");
            tipoGestacion = ave.getString("tipoGestacion");
            tiempoGestacion = ave.getString("tiempoGestacion");
            caracter = ave.getString("caracter");
            tipoVeneno = ave.getString("tipoVeneno");
            JSONArray precau = ave.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = ave.getString("nivelPeligrosidad");
            comportamientoSocial = ave.getString("comportamientoSocial");
            peligroso = ave.getBoolean("peligroso");
            venenoso = ave.getBoolean("venenoso");
            maltratado = ave.getBoolean("maltratado");
            CrearAnimal animal = new CrearAnimal();
            animal.crearAveAcuatica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, tempHabitad, tiempoBuceo, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        }
    }

    public void GetInfoAvesCarroñaRapiña() throws IOException {
        int codigo, edad;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                envergadura,
                tipoPico,
                colorPlumaje,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[],
                especiesCompatibles[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion,
                vuela;

        JSONArray aves = info.AnimalesAvesCarroñaRapiñaJSON();
        for (int i = 0; i < aves.length(); i++) {
            JSONObject ave = aves.getJSONObject(i);
            codigo = ave.getInt("codigo");
            nombre = ave.getString("nombre");
            especie = ave.getString("especie");
            genero = ave.getString("genero");
            edad = ave.getInt("edad");
            peso = ave.getFloat("peso");
            envergadura = ave.getString("envergadura");
            tipoPico = ave.getString("tipoPico");
            colorPlumaje = ave.getString("colorPlumaje");
            vuela = ave.getBoolean("vuela");
            habitad = ave.getString("habitad");
            zona = ave.getString("zona");
            procedencia = ave.getString("procedencia");
            dietaPrincipal = ave.getString("dietaPrincipal");
            JSONArray dieta = ave.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = ave.getString("riesgoExtincion");
            gestacion = ave.getBoolean("gestacion");
            tipoGestacion = ave.getString("tipoGestacion");
            tiempoGestacion = ave.getString("tiempoGestacion");
            caracter = ave.getString("caracter");
            tipoVeneno = ave.getString("tipoVeneno");
            JSONArray precau = ave.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = ave.getString("nivelPeligrosidad");
            comportamientoSocial = ave.getString("comportamientoSocial");
            peligroso = ave.getBoolean("peligroso");
            venenoso = ave.getBoolean("venenoso");
            maltratado = ave.getBoolean("maltratado");
            JSONArray especiesComp = ave.getJSONArray("especiesCompatibles");
            especiesCompatibles = new String[especiesComp.length()];
            for (int j = 0; j < especiesComp.length(); j++) {
                especiesCompatibles[j] = especiesComp.get(j).toString();
            }
            CrearAnimal animal = new CrearAnimal();
            animal.crearAveCarroñaRapiña(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
        }
    }

    public void GetInfoAvesExoticas() throws IOException {
        int codigo, edad;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                envergadura,
                tipoPico,
                colorPlumaje,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[],
                especiesCompatibles[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion,
                vuela;

        JSONArray aves = info.AnimalesAvesExoticasJSON();
        for (int i = 0; i < aves.length(); i++) {
            JSONObject ave = aves.getJSONObject(i);
            codigo = ave.getInt("codigo");
            nombre = ave.getString("nombre");
            especie = ave.getString("especie");
            genero = ave.getString("genero");
            edad = ave.getInt("edad");
            peso = ave.getFloat("peso");
            envergadura = ave.getString("envergadura");
            tipoPico = ave.getString("tipoPico");
            colorPlumaje = ave.getString("colorPlumaje");
            vuela = ave.getBoolean("vuela");
            habitad = ave.getString("habitad");
            zona = ave.getString("zona");
            procedencia = ave.getString("procedencia");
            dietaPrincipal = ave.getString("dietaPrincipal");
            JSONArray dieta = ave.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = ave.getString("riesgoExtincion");
            gestacion = ave.getBoolean("gestacion");
            tipoGestacion = ave.getString("tipoGestacion");
            tiempoGestacion = ave.getString("tiempoGestacion");
            caracter = ave.getString("caracter");
            tipoVeneno = ave.getString("tipoVeneno");
            JSONArray precau = ave.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = ave.getString("nivelPeligrosidad");
            comportamientoSocial = ave.getString("comportamientoSocial");
            peligroso = ave.getBoolean("peligroso");
            venenoso = ave.getBoolean("venenoso");
            maltratado = ave.getBoolean("maltratado");
            JSONArray especiesComp = ave.getJSONArray("especiesCompatibles");
            especiesCompatibles = new String[especiesComp.length()];
            for (int j = 0; j < especiesComp.length(); j++) {
                especiesCompatibles[j] = especiesComp.get(j).toString();
            }
            CrearAnimal animal = new CrearAnimal();
            animal.crearAveExotica(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
        }
    }

    public void GetInfoAvesTerrestres() throws IOException {
        int codigo, edad;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                envergadura,
                tipoPico,
                colorPlumaje,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion,
                vuela,
                aveDeCorral;

        JSONArray aves = info.AnimalesAvesTerrestresJSON();
        for (int i = 0; i < aves.length(); i++) {
            JSONObject ave = aves.getJSONObject(i);
            codigo = ave.getInt("codigo");
            nombre = ave.getString("nombre");
            especie = ave.getString("especie");
            genero = ave.getString("genero");
            edad = ave.getInt("edad");
            peso = ave.getFloat("peso");
            envergadura = ave.getString("envergadura");
            tipoPico = ave.getString("tipoPico");
            colorPlumaje = ave.getString("colorPlumaje");
            vuela = ave.getBoolean("vuela");
            habitad = ave.getString("habitad");
            zona = ave.getString("zona");
            procedencia = ave.getString("procedencia");
            dietaPrincipal = ave.getString("dietaPrincipal");
            JSONArray dieta = ave.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = ave.getString("riesgoExtincion");
            gestacion = ave.getBoolean("gestacion");
            tipoGestacion = ave.getString("tipoGestacion");
            tiempoGestacion = ave.getString("tiempoGestacion");
            caracter = ave.getString("caracter");
            tipoVeneno = ave.getString("tipoVeneno");
            JSONArray precau = ave.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = ave.getString("nivelPeligrosidad");
            comportamientoSocial = ave.getString("comportamientoSocial");
            peligroso = ave.getBoolean("peligroso");
            venenoso = ave.getBoolean("venenoso");
            maltratado = ave.getBoolean("maltratado");
            aveDeCorral = ave.getBoolean("aveDeCorral");
            CrearAnimal animal = new CrearAnimal();
            animal.crearAveTerrestre(codigo, nombre, especie, genero, edad, peso, dietaPrincipal, dietaCompleta, envergadura, vuela, tipoPico, colorPlumaje, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, aveDeCorral);
        }
    }

    public void GetInfoInsectos() throws IOException {
        int codigo, cantidad, paresPatas, paresAlas;
        String nombre,
                especie,
                habitad,
                zona,
                procedencia,
                dietaPrincipal,
                dietaCompleta[],
                riesgoExtincion,
                tipoVeneno,
                precauciones[],
                nivelPeligrosidad;
        boolean peligroso, venenoso, metamorfosis;

        JSONArray insectos = info.AnimalesInsectosJSON();
        for (int i = 0; i < insectos.length(); i++) {
            JSONObject insecto = insectos.getJSONObject(i);
            codigo = insecto.getInt("codigo");
            nombre = insecto.getString("nombre");
            especie = insecto.getString("especie");
            habitad = insecto.getString("habitad");
            zona = insecto.getString("zona");
            procedencia = insecto.getString("procedencia");
            dietaPrincipal = insecto.getString("dietaPrincipal");
            JSONArray dieta = insecto.getJSONArray("dietaCompleta");
            metamorfosis = insecto.getBoolean("metamorfosis");
            paresAlas = insecto.getInt("paresAlas");
            paresPatas = insecto.getInt("paresPatas");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = insecto.getString("riesgoExtincion");
            tipoVeneno = insecto.getString("tipoVeneno");
            JSONArray precau = insecto.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = insecto.getString("nivelPeligrosidad");
            peligroso = insecto.getBoolean("peligroso");
            venenoso = insecto.getBoolean("venenoso");
            cantidad = insecto.getInt("cantidad");
            CrearAnimal animal = new CrearAnimal();
            animal.crearInsectos(codigo, nombre, especie, metamorfosis, habitad, zona, procedencia, cantidad, paresPatas, paresAlas, riesgoExtincion, dietaPrincipal, dietaCompleta, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
        }
    }

    public void GetInfoMamiferosAcuaticos() throws IOException {
        int codigo, edad, numAletas;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                tiempoBuceo,
                mecanismoRespiracion,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[],
                especiesCompatibles[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion;

        JSONArray mamiferos = info.AnimalesMamiferosAcuaticosJSON();
        for (int i = 0; i < mamiferos.length(); i++) {
            JSONObject mamifero = mamiferos.getJSONObject(i);
            codigo = mamifero.getInt("codigo");
            nombre = mamifero.getString("nombre");
            especie = mamifero.getString("especie");
            genero = mamifero.getString("genero");
            edad = mamifero.getInt("edad");
            peso = mamifero.getFloat("peso");
            numAletas = mamifero.getInt("numAletas");
            tiempoBuceo = mamifero.getString("tiempoBuceo");
            mecanismoRespiracion = mamifero.getString("mecanismoRespiracion");
            habitad = mamifero.getString("habitad");
            zona = mamifero.getString("zona");
            procedencia = mamifero.getString("procedencia");
            dietaPrincipal = mamifero.getString("dietaPrincipal");
            JSONArray dieta = mamifero.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = mamifero.getString("riesgoExtincion");
            gestacion = mamifero.getBoolean("gestacion");
            tipoGestacion = mamifero.getString("tipoGestacion");
            tiempoGestacion = mamifero.getString("tiempoGestacion");
            caracter = mamifero.getString("caracter");
            tipoVeneno = mamifero.getString("tipoVeneno");
            JSONArray precau = mamifero.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = mamifero.getString("nivelPeligrosidad");
            comportamientoSocial = mamifero.getString("comportamientoSocial");
            peligroso = mamifero.getBoolean("peligroso");
            venenoso = mamifero.getBoolean("venenoso");
            maltratado = mamifero.getBoolean("maltratado");
            JSONArray especiesComp = mamifero.getJSONArray("especiesCompatibles");
            especiesCompatibles = new String[especiesComp.length()];
            for (int j = 0; j < especiesComp.length(); j++) {
                especiesCompatibles[j] = especiesComp.get(j).toString();
            }
            CrearAnimal animal = new CrearAnimal();
            animal.crearMamiferoAcuatico(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, tiempoBuceo, mecanismoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones, especiesCompatibles);
        }
    }

    public void GetInfoMamiferosTerrestres() throws IOException {
        int codigo, edad, numPatas;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                comportamiento,
                precauciones[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion;

        JSONArray mamiferos = info.AnimalesMamiferosTerrestresJSON();
        for (int i = 0; i < mamiferos.length(); i++) {
            JSONObject mamifero = mamiferos.getJSONObject(i);
            codigo = mamifero.getInt("codigo");
            nombre = mamifero.getString("nombre");
            especie = mamifero.getString("especie");
            genero = mamifero.getString("genero");
            edad = mamifero.getInt("edad");
            peso = mamifero.getFloat("peso");
            numPatas = mamifero.getInt("numPatas");
            habitad = mamifero.getString("habitad");
            zona = mamifero.getString("zona");
            procedencia = mamifero.getString("procedencia");
            dietaPrincipal = mamifero.getString("dietaPrincipal");
            JSONArray dieta = mamifero.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = mamifero.getString("riesgoExtincion");
            gestacion = mamifero.getBoolean("gestacion");
            tipoGestacion = mamifero.getString("tipoGestacion");
            tiempoGestacion = mamifero.getString("tiempoGestacion");
            caracter = mamifero.getString("caracter");
            tipoVeneno = mamifero.getString("tipoVeneno");
            JSONArray precau = mamifero.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = mamifero.getString("nivelPeligrosidad");
            comportamientoSocial = mamifero.getString("comportamientoSocial");
            peligroso = mamifero.getBoolean("peligroso");
            venenoso = mamifero.getBoolean("venenoso");
            maltratado = mamifero.getBoolean("maltratado");
            comportamiento = mamifero.getString("comportamiento");
            CrearAnimal animal = new CrearAnimal();
            animal.crearMamiferoTerrestre(codigo, nombre, especie, genero, peso, dietaPrincipal, dietaCompleta, edad, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, comportamiento, precauciones);
        }
    }

    public void GetInfoPeces() throws IOException {
        int codigo, cantidad;
        String nombre,
                especie,
                genero,
                coloracion,
                tipoAgua,
                tempAcuario,
                dietaPrincipal,
                dietaCompleta[],
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                reproduccion,
                nivelPeligrosidad,
                tipoVeneno,
                precauciones[],
                especiesCompatibles[];
        boolean venenoso,
                peligroso;

        JSONArray peces = info.AnimalesPecesJSON();
        for (int i = 0; i < peces.length(); i++) {
            JSONObject pez = peces.getJSONObject(i);
            codigo = pez.getInt("codigo");
            nombre = pez.getString("nombre");
            especie = pez.getString("especie");
            genero = pez.getString("genero");
            habitad = pez.getString("habitad");
            zona = pez.getString("zona");
            procedencia = pez.getString("procedencia");
            cantidad = pez.getInt("cantidad");
            coloracion = pez.getString("coloracion");
            tipoAgua = pez.getString("tipoAgua");
            tempAcuario = pez.getString("tempAcuario");
            reproduccion = pez.getString("reproduccion");
            dietaPrincipal = pez.getString("dietaPrincipal");
            JSONArray dieta = pez.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = pez.getString("riesgoExtincion");
            tipoVeneno = pez.getString("tipoVeneno");
            JSONArray precau = pez.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = pez.getString("nivelPeligrosidad");
            peligroso = pez.getBoolean("peligroso");
            venenoso = pez.getBoolean("venenoso");
            JSONArray especiesComp = pez.getJSONArray("especiesCompatibles");
            especiesCompatibles = new String[especiesComp.length()];
            for (int j = 0; j < especiesComp.length(); j++) {
                especiesCompatibles[j] = especiesComp.get(j).toString();
            }
            CrearAnimal animal = new CrearAnimal();
            animal.crearPeces(codigo, nombre, especie, genero, coloracion, tipoAgua, tempAcuario, dietaPrincipal, dietaCompleta, habitad, zona, procedencia, cantidad, riesgoExtincion, reproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones, especiesCompatibles);
        }
    }

    public void GetInfoReptilesAcuaticos() throws IOException {
        int codigo, edad, numAletas;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                tipoPiel,
                coloracion,
                metodoRespiracion,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                tempEncubacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion;

        JSONArray reptiles = info.AnimalesReptilesAcuaticosJSON();
        for (int i = 0; i < reptiles.length(); i++) {
            JSONObject reptil = reptiles.getJSONObject(i);
            codigo = reptil.getInt("codigo");
            nombre = reptil.getString("nombre");
            especie = reptil.getString("especie");
            genero = reptil.getString("genero");
            edad = reptil.getInt("edad");
            peso = reptil.getFloat("peso");
            numAletas = reptil.getInt("numAletas");
            tipoPiel = reptil.getString("tipoPiel");
            coloracion = reptil.getString("coloracion");
            metodoRespiracion = reptil.getString("metodoRespiracion");
            habitad = reptil.getString("habitad");
            zona = reptil.getString("zona");
            procedencia = reptil.getString("procedencia");
            dietaPrincipal = reptil.getString("dietaPrincipal");
            JSONArray dieta = reptil.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = reptil.getString("riesgoExtincion");
            gestacion = reptil.getBoolean("gestacion");
            tipoGestacion = reptil.getString("tipoGestacion");
            tiempoGestacion = reptil.getString("tiempoGestacion");
            tempEncubacion = reptil.getString("tempEncubacion");
            caracter = reptil.getString("caracter");
            tipoVeneno = reptil.getString("tipoVeneno");
            JSONArray precau = reptil.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = reptil.getString("nivelPeligrosidad");
            comportamientoSocial = reptil.getString("comportamientoSocial");
            peligroso = reptil.getBoolean("peligroso");
            venenoso = reptil.getBoolean("venenoso");
            maltratado = reptil.getBoolean("maltratado");
            CrearAnimal animal = new CrearAnimal();
            animal.crearReptilesAcuaticos(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, metodoRespiracion, numAletas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        }
    }

    public void GetInfoReptilesTerrestres() throws IOException {
        int codigo, edad, numPatas;
        float peso;
        String nombre,
                especie,
                genero,
                dietaPrincipal,
                dietaCompleta[],
                tipoPiel,
                coloracion,
                habitad,
                zona,
                procedencia,
                riesgoExtincion,
                tipoGestacion,
                tiempoGestacion,
                tempEncubacion,
                nivelPeligrosidad,
                tipoVeneno,
                comportamientoSocial,
                caracter,
                precauciones[];
        boolean maltratado,
                venenoso,
                peligroso,
                gestacion;

        JSONArray reptiles = info.AnimalesReptilesTerrestresJSON();
        for (int i = 0; i < reptiles.length(); i++) {
            JSONObject reptil = reptiles.getJSONObject(i);
            codigo = reptil.getInt("codigo");
            nombre = reptil.getString("nombre");
            especie = reptil.getString("especie");
            genero = reptil.getString("genero");
            edad = reptil.getInt("edad");
            peso = reptil.getFloat("peso");
            numPatas = reptil.getInt("numPatas");
            tipoPiel = reptil.getString("tipoPiel");
            coloracion = reptil.getString("coloracion");
            habitad = reptil.getString("habitad");
            zona = reptil.getString("zona");
            procedencia = reptil.getString("procedencia");
            dietaPrincipal = reptil.getString("dietaPrincipal");
            JSONArray dieta = reptil.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[j] = dieta.get(j).toString();
            }
            riesgoExtincion = reptil.getString("riesgoExtincion");
            gestacion = reptil.getBoolean("gestacion");
            tipoGestacion = reptil.getString("tipoGestacion");
            tiempoGestacion = reptil.getString("tiempoGestacion");
            tempEncubacion = reptil.getString("tempEncubacion");
            caracter = reptil.getString("caracter");
            tipoVeneno = reptil.getString("tipoVeneno");
            JSONArray precau = reptil.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[j] = precau.get(j).toString();
            }
            nivelPeligrosidad = reptil.getString("nivelPeligrosidad");
            comportamientoSocial = reptil.getString("comportamientoSocial");
            peligroso = reptil.getBoolean("peligroso");
            venenoso = reptil.getBoolean("venenoso");
            maltratado = reptil.getBoolean("maltratado");
            CrearAnimal animal = new CrearAnimal();
            animal.crearReptilesTerrestres(codigo, nombre, especie, genero, peso, edad, dietaPrincipal, dietaCompleta, tipoPiel, coloracion, numPatas, habitad, zona, procedencia, riesgoExtincion, gestacion, tipoGestacion, tiempoGestacion, tempEncubacion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, maltratado, comportamientoSocial, caracter, precauciones);
        }
    }
}
