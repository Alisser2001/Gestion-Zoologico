/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Gestionar;

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
public class EliminarAnimal {

    ReadJSON readJson = new ReadJSON();

    public void EliminarAnfibio(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray anfibios = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < anfibios.length(); i++) {
            JSONObject anfibio = (JSONObject) anfibios.get(i);
            if (anfibio.getInt("codigo") == codigo) {
                anfibios.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_anfibios").clear();
        for(int i=0 ; i< anfibios.length();i++){
            infoJson.getJSONArray("animales_anfibios").put(anfibios.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveAcuatica(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesAcuaticas = readJson.AnimalesAvesAcuaticasJSON();
        for (int i = 0; i < avesAcuaticas.length(); i++) {
            JSONObject aveAcuatica = (JSONObject) avesAcuaticas.get(i);
            if (aveAcuatica.getInt("codigo") == codigo) {
                avesAcuaticas.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_acuaticas").clear();
        for(int i=0;i<avesAcuaticas.length();i++){
            infoJson.getJSONArray("animales_aves_acuaticas").put(avesAcuaticas.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveCarroñaRapiña(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesCarroñaRapiña = readJson.AnimalesAvesCarroñaRapiñaJSON();
        for (int i = 0; i < avesCarroñaRapiña.length(); i++) {
            JSONObject aveCarroñaRapiña = (JSONObject) avesCarroñaRapiña.get(i);
            if (aveCarroñaRapiña.getInt("codigo") == codigo) {
                avesCarroñaRapiña.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_carroña_rapiña").clear();
        for(int i=0;i<= avesCarroñaRapiña.length();i++){
            infoJson.getJSONArray("animales_aves_carroña_rapiña").put(avesCarroñaRapiña.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveExotica(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesExoticas = readJson.AnimalesAvesExoticasJSON();
        for (int i = 0; i < avesExoticas.length(); i++) {
            JSONObject aveExotica = (JSONObject) avesExoticas.get(i);
            if (aveExotica.getInt("codigo") == codigo) {
                avesExoticas.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_exoticas").clear();
        for(int i=0;i< avesExoticas.length();i++){
            infoJson.getJSONArray("animales_aves_exoticas").put(avesExoticas.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarAveTerrestre(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray avesTerrestres = readJson.AnimalesAvesTerrestresJSON();
        for (int i = 0; i < avesTerrestres.length(); i++) {
            JSONObject aveTerrestre = (JSONObject) avesTerrestres.get(i);
            if (aveTerrestre.getInt("codigo") == codigo) {
                avesTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_aves_terrestres").clear();
        for(int i=0;i<avesTerrestres.length();i++){
            infoJson.getJSONArray("animales_aves_terrestres").put(avesTerrestres.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarInsectos(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray insectos = readJson.AnimalesInsectosJSON();
        for (int i = 0; i < insectos.length(); i++) {
            JSONObject insecto = (JSONObject) insectos.get(i);
            if (insecto.getInt("codigo") == codigo) {
                insectos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_insectos").clear();
        for(int i=0;i<insectos.length();i++){
            infoJson.getJSONArray("animales_insectos").put(insectos.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarMamiferoAcuatico(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosAcuaticos = readJson.AnimalesMamiferosAcuaticosJSON();
        for (int i = 0; i < mamiferosAcuaticos.length(); i++) {
            JSONObject mamiferoAcuatico = (JSONObject) mamiferosAcuaticos.get(i);
            if (mamiferoAcuatico.getInt("codigo") == codigo) {
                mamiferosAcuaticos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_mamiferos_acuaticos").clear();
        for(int i=0;i<mamiferosAcuaticos.length();i++){
            infoJson.getJSONArray("animales_mamiferos_acuaticos").put(mamiferosAcuaticos.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarMamiferoTerrestre(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray mamiferosTerrestres = readJson.AnimalesMamiferosTerrestresJSON();
        for (int i = 0; i < mamiferosTerrestres.length(); i++) {
            JSONObject mamiferoTerrestre = (JSONObject) mamiferosTerrestres.get(i);
            if (mamiferoTerrestre.getInt("codigo") == codigo) {
                mamiferosTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_mamiferos_terrestres").clear();
        for(int i=0;i<mamiferosTerrestres.length();i++){
            infoJson.getJSONArray("animales_mamiferos_terrestres").put(mamiferosTerrestres.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarPeces(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray peces = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < peces.length(); i++) {
            JSONObject pez = (JSONObject) peces.get(i);
            if (pez.getInt("codigo") == codigo) {
                peces.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_peces").clear();
        for(int i=0;i<peces.length();i++){
            infoJson.getJSONArray("animales_peces").put(peces.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarReptilAcuatico(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesAcuaticos = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < reptilesAcuaticos.length(); i++) {
            JSONObject reptilAcuatico = (JSONObject) reptilesAcuaticos.get(i);
            if (reptilAcuatico.getInt("codigo") == codigo) {
                reptilesAcuaticos.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_reptiles_acuaticos").clear();
        for(int i=0;i<reptilesAcuaticos.length();i++){
            infoJson.getJSONArray("animales_reptiles_acuaticos").put(reptilesAcuaticos.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
    
    public void EliminarReptilTerrestre(int codigo) throws IOException {
        JSONObject infoJson = readJson.JsonInfo();
        JSONArray reptilesTerrestres = readJson.AnimalesAnfibiosJSON();
        for (int i = 0; i < reptilesTerrestres.length(); i++) {
            JSONObject reptilTerrestre = (JSONObject) reptilesTerrestres.get(i);
            if (reptilTerrestre.getInt("codigo") == codigo) {
                reptilesTerrestres.remove(i);
                break;
            }
        }
        infoJson.getJSONArray("animales_reptiles_terrestres").clear();
        for(int i=0;i<reptilesTerrestres.length();i++){
            infoJson.getJSONArray("animales_reptiles_terrestres").put(reptilesTerrestres.get(i));
        }
        Files.write(Paths.get("Animales.json"), infoJson.toString().getBytes());
    }
}
