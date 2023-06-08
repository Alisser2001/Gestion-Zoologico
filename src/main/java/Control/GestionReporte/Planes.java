/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionReporte;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Planes {
    private static final String RUTA = "src/main/java/resources/planes.json";
    private String tipoPlan;
    
    public Planes(String plan){
        this.tipoPlan = plan;
    }

    public double getPrecioPlan() {
        try {
            StringBuilder jsonContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(RUTA));
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(jsonContent.toString());
            JSONArray jsonArray = json.getJSONArray("planes");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject plan = jsonArray.getJSONObject(i);
                String nombre = plan.getString("nombre");
                if (nombre.equals(tipoPlan)) {
                    return plan.getDouble("precio");
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return 0.0; // Si no se encuentra el plan, se retorna 0.0 o un valor predeterminado.
    }
    
    public double getPuntos() {
        try {
            StringBuilder jsonContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(RUTA));
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(jsonContent.toString());
            JSONArray jsonArray = json.getJSONArray("planes");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject plan = jsonArray.getJSONObject(i);
                String nombre = plan.getString("nombre");
                if (nombre.equals(tipoPlan)) {
                    return plan.getDouble("puntos");
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return 0.0; // Si no se encuentra el plan, se retorna 0.0 o un valor predeterminado.
    }
}
