/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionVentas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Brahiam
 */
public class Clientes {
    private static final String RUTA = "src/main/java/resources/clientes.json";
    //estructura cliente: [id,nombre,puntos]
    private ArrayList<Object> arrayCliente = new ArrayList<>();
    private int idCliente;
    private String nombre;
    private int puntos;
    
    public Clientes(int id){
        this.idCliente = id;
        getCliente();
    }
    
    public ArrayList<Object> getCliente() {
        try {
            StringBuilder jsonContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(RUTA));
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(jsonContent.toString());
            JSONArray jsonArray = json.getJSONArray("clientes");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject cliente = jsonArray.getJSONObject(i);
                int id = cliente.getInt("identificacion");
                if (id == this.idCliente) {
                    this.nombre = cliente.getString("nombre");
                    this.puntos = cliente.getInt("puntos");
                    this.arrayCliente.add(this.idCliente);
                    this.arrayCliente.add(this.nombre);
                    this.arrayCliente.add(this.puntos);
                    System.out.println(this.arrayCliente);
                    return this.arrayCliente;
                }
                
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return clienteNuevo();
    }
    
    public void modificarPuntosCliente(int identificacion, int nuevosPuntos) {
        try {
            StringBuilder jsonContent = new StringBuilder();

            FileInputStream fis = new FileInputStream(RUTA);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(jsonContent.toString());
            JSONArray clientes = jsonObject.getJSONArray("clientes");

            for (int i = 0; i < clientes.length(); i++) {
                JSONObject cliente = clientes.getJSONObject(i);
                long id = cliente.getLong("identificacion");
                if (id == identificacion) {
                    cliente.put("puntos", nuevosPuntos);
                    break;
                }
            }

            FileWriter file = new FileWriter(RUTA);
            file.write(jsonObject.toString(2));
            file.close();

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
    
    public void agregarCliente(String nombre, int puntos){
        try {
            // Leer el archivo JSON existente
            FileInputStream input = new FileInputStream(RUTA);
            InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            // Convertir el contenido en un objeto JSON
            JSONObject jsonObject = new JSONObject(jsonContent.toString());

            // Obtener el array "clientes" del objeto JSON
            JSONArray clientesArray = jsonObject.getJSONArray("clientes");

            // Crear el objeto JSON del nuevo cliente
            JSONObject nuevoCliente = new JSONObject();
            nuevoCliente.put("nombre", nombre);
            nuevoCliente.put("identificacion", idCliente);
            nuevoCliente.put("puntos", puntos);

            // Agregar el nuevo cliente al array "clientes"
            clientesArray.put(nuevoCliente);

            // Escribir los cambios en el archivo JSON
            FileWriter fileWriter = new FileWriter(RUTA);
            fileWriter.write(jsonObject.toString());
            fileWriter.close();

            System.out.println("Se ha creado un nuevo cliente y se ha guardado en el archivo JSON.");
        } catch (IOException e) {
            
        }
    }
    
    public ArrayList<Object> clienteNuevo(){
        return this.arrayCliente;
    }  
    public int getSize(){
        return this.arrayCliente.size();
    }

    public int getPuntos() {
        return puntos;
    }
    

    public int getIdCliente() {
        return idCliente;
    }
}
