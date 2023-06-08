/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.CopiaAnimales.InfoJSON;

import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;

/**
 *
 * @author Alisser
 */
public class ReadJSON {
    public JSONObject JsonInfo() throws IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get("Animales.json")));
        JSONObject json = new JSONObject(jsonString);
        return json;
    }
    public JSONArray AnimalesMamiferosTerrestresJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_mamiferos_terrestres");
    }
    public JSONArray AnimalesMamiferosAcuaticosJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_mamiferos_acuaticos");
    }
    public JSONArray AnimalesAnfibiosJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_anfibios");
    }
    public JSONArray AnimalesAvesAcuaticasJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_aves_acuaticas");
    }
    public JSONArray AnimalesAvesTerrestresJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_aves_terrestres");
    }
    public JSONArray AnimalesAvesExoticasJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_aves_exoticas");
    }
    public JSONArray AnimalesAvesCarroñaRapiñaJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_aves_carroña_rapiña");
    }
    public JSONArray AnimalesInsectosJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_insectos");
    }
    public JSONArray AnimalesPecesJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_peces");
    }
    public JSONArray AnimalesReptilesTerrestresJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_reptiles_terrestres");
    }
    public JSONArray AnimalesReptilesAcuaticosJSON() throws IOException{
        JSONObject info = JsonInfo();
        return info.getJSONArray("animales_reptiles_acuaticos");
    }
}
