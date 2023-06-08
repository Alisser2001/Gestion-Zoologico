/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.View;
import Control.GestionReporte.ReporteVentas;
import Principal.paneles.Animales.PanelAnfibio;
import Principal.paneles.Animales.PanelAveAcuatica;
import Principal.paneles.Animales.PanelAveCarroña;
import Principal.paneles.Animales.PanelAveExotica;
import Principal.paneles.Animales.PanelAveTerrestre;
import Principal.paneles.Animales.PanelInsectos;
import Principal.paneles.Animales.PanelMamiferoAcuatico;
import Principal.paneles.Animales.PanelMamiferoTerrestre;
import Principal.paneles.Animales.PanelPeces;
import Principal.paneles.Animales.PanelReptilAcuatico;
import Principal.paneles.Animales.PanelReptilTerrestre;
import Principal.paneles.PanelAgregarAnimal;
import Principal.paneles.PanelAnimalAgregado;
import Principal.paneles.PanelAnimalEliminado;
import Principal.paneles.PanelEliminarAnimal;
import Principal.paneles.PanelInforme;
import Principal.paneles.PanelOpcionesGestion;
import Principal.paneles.PanelVentaExitosa;
import Principal.paneles.PanelVentaIndividual;
import Principal.paneles.PanelVentaRegular;
import Principal.paneles.PanelVentaValidacion;
import Principal.paneles.PanelVentas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author Brahiam
 */
public class InitView extends JFrame{
    private JPanel panelPrincipal, panelBotones;
    private JLabel labelTitulo;
    private JButton btnGestion, btnVentas, btnReporte;
    private static ArrayList<String[]> ventas = new ArrayList<>();

    public InitView(){
        // Configuración del JFrame
        setTitle("Zoologico");
        setSize(900, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal y su layout
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        
        // JLabel con el título del zoologico
        labelTitulo = new JLabel("Zoologico Universidad de Antioquia");
        labelTitulo.setFont(new Font("Arial",Font.BOLD,44));
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        labelTitulo.setBounds(50, 50, 800, 50);
        panelPrincipal.add(labelTitulo, BorderLayout.NORTH);
        
        // Panel de botones y su layout
        panelBotones = new JPanel(new GridLayout(1, 3, 50, 0));
        panelBotones.setBounds(50, 350, 800, 250);

        // Botón de gestión
        btnGestion = new JButton("Gestion");
        btnGestion.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnGestion);

        // Botón de ventas
        btnVentas = new JButton("Ventas");
        btnVentas.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnVentas);

        // Botón de reporte
        btnReporte = new JButton("Reporte");
        btnReporte.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnReporte);

        // Agregamos el panel de botones al panel principal
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        
        btnVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones anteriores
                panelBotones.setVisible(false);

                // Creamos el panel para los nuevos botones
                showPanelVenta();
            }
        });
        
        btnReporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones anteriores
                panelBotones.setVisible(false);

                // Creamos el panel para los nuevos botones
                showReporte();
            }
        });
        
        btnGestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones anteriores
                panelBotones.setVisible(false);

                // Creamos el panel para los nuevos botones
                showPanelOpcionesGestion();
            }
        });
        
        
        // Agregamos el panel principal al JFrame
        add(panelPrincipal);

        // Hacemos el JFrame visible
        setVisible(true);
        
        
    }
    
    public void showPanelAnfibio(){
        PanelAnfibio animal = new PanelAnfibio(this);
        panelPrincipal.add(animal);
    }
    public void showPanelInsectos(){
        PanelInsectos animal = new PanelInsectos(this);
        panelPrincipal.add(animal);
    }
    public void showPanelAveTerrestre(){
        PanelAveTerrestre animal = new PanelAveTerrestre(this);
        panelPrincipal.add(animal);
    }
    public void showPanelEliminarAnimal(){
        PanelEliminarAnimal animal = new PanelEliminarAnimal(this);
        panelPrincipal.add(animal);
    }
    public void showPanelAnimalEliminado(){
        PanelAnimalEliminado animal = new PanelAnimalEliminado(this);
        panelPrincipal.add(animal);
    }
    
    public void showPanelAveAcuatica(){
        PanelAveAcuatica animal = new PanelAveAcuatica(this);
        panelPrincipal.add(animal);
    }
    public void showPanelAveCarroña(){
        PanelAveCarroña animal = new PanelAveCarroña(this);
        panelPrincipal.add(animal);
    }
    public void showPanelAveExotica(){
        PanelAveExotica animal = new PanelAveExotica(this);
        panelPrincipal.add(animal);
    }
    public void showPanelReptilTerrestre(){
        PanelReptilTerrestre animal = new PanelReptilTerrestre(this);
        panelPrincipal.add(animal);
    }
    public void showMamiferoAcuatico(){
        PanelMamiferoAcuatico animal = new PanelMamiferoAcuatico(this);
        panelPrincipal.add(animal);
    }
    public void showPanelMamiferoTerrestre(){
        PanelMamiferoTerrestre animal = new PanelMamiferoTerrestre(this);
        panelPrincipal.add(animal);
    }
    public void showPanelReptilAcuatico(){
        
        PanelReptilAcuatico animal = new PanelReptilAcuatico(this);
        panelPrincipal.add(animal);
    }
    public void showPanelPeces(){
        PanelPeces animal = new PanelPeces(this);
        panelPrincipal.add(animal);
    }
    public void showPanelAnimalAgregado(){
        PanelAnimalAgregado animal = new PanelAnimalAgregado(this);
        panelPrincipal.add(animal);
    }
    
    public void showPanelOpcionesGestion(){
        PanelOpcionesGestion opciones = new PanelOpcionesGestion(this);
        panelPrincipal.add(opciones);
    }
    
    public void showPanelAgregarAnimal(){
        PanelAgregarAnimal agregarAnimal = new PanelAgregarAnimal(this);
        panelPrincipal.add(agregarAnimal);
    }
    
    public void showPanelVentaIndividual(){
        PanelVentaIndividual venta =new PanelVentaIndividual(this); 
        panelPrincipal.add(venta);
    }
    public void showPanelVenta(){
        PanelVentas panelVentas = new PanelVentas(this);
        panelPrincipal.add(panelVentas);
    }
    public void showPrincipal(){
        panelBotones.setVisible(true);
    }
    public void showReporte(){
        new ReporteVentas(getVentas());
        PanelInforme info = new PanelInforme(this);
        panelPrincipal.add(info);
    }
    
    public void showVentaExitosa(){
        PanelVentaExitosa ventaExitosa = new PanelVentaExitosa(this);
        panelPrincipal.add(ventaExitosa);
    }
    public void showVentaValidacion(){
        PanelVentaValidacion ventaRegular = new PanelVentaValidacion(this);
        panelPrincipal.add(ventaRegular);
    }
    public void showVentaRegular(int id){
        PanelVentaRegular nuevoCliente = new PanelVentaRegular(this, id);
        panelPrincipal.add(nuevoCliente);
    }
    public void addVenta(String[] venta){
        this.ventas.add(venta);
    }

    public static ArrayList<String[]> getVentas() {
        return ventas;
    }
    
    
}
