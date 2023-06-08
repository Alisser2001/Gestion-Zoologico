/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Control.GestionAnimales.Animales.Gestionar.EliminarAnimal;
import Principal.View.InitView;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelEliminarAnimal extends JPanel{
    private InitView principal;
    private JButton btnEliminar;
    private JComboBox<String> comboBox;
    private JLabel informeLabel;
    
    public PanelEliminarAnimal(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(2,3,15,0));
        setBounds(15,335,850,80);
        
        informeLabel = new JLabel("Tipo de animal: ");
        informeLabel.setFont(new Font("Arial",Font.BOLD,20));
        informeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(informeLabel);;
        
        this.comboBox = new JComboBox<>();
        //Opciones para agregar animal
        comboBox.addItem("Anfibio");
        comboBox.addItem("Ave Acuatica");
        comboBox.addItem("Ave carroña rapiña");
        comboBox.addItem("Ave exótica");
        comboBox.addItem("Ave terrestre");
        comboBox.addItem("Insecto");
        comboBox.addItem("Mamifero acuatico");
        comboBox.addItem("Mamifero terrestre");
        comboBox.addItem("Peces");
        comboBox.addItem("Reptil acuatico");
        comboBox.addItem("Reptil terrestre");
        
        add(comboBox);
        add(new JLabel(""));
        
        JLabel codigo = new JLabel("Codigo: ");
        codigo.setFont(new Font("Arial",Font.BOLD,20));
        codigo.setHorizontalAlignment(JLabel.CENTER);
        add(codigo);
        
        JTextField codigoAnimal = new JTextField();
        add(codigoAnimal);
        
        // Botón de individual
        btnEliminar = new JButton("Eliminar Animal");
        btnEliminar.setPreferredSize(new Dimension(200, 250));
        add(btnEliminar);
        
        //Accion del boton Individual
        btnEliminar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                EliminarAnimal animal = new EliminarAnimal();
                int codigo = Integer.parseInt(codigoAnimal.getText());
                 // Obtener la opción seleccionada por el usuario
                String opcionSeleccionada = (String) comboBox.getSelectedItem();
                setVisible(false);
                // Ejecutar las clases según la opción seleccionada
                if (opcionSeleccionada.equals("Anfibio")) {
                    try {
                        animal.EliminarAnfibio(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Ave Acuatica")){
                    try {
                        animal.EliminarAveAcuatica(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Ave carroña rapiña")){
                    try {
                        animal.EliminarAveCarroñaRapiña(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Ave exótica")){
                    try {
                        animal.EliminarAveExotica(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Ave terrestre")){
                    try {
                        animal.EliminarAveTerrestre(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Insecto")){
                    try {
                        animal.EliminarInsectos(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Mamifero acuatico")){
                    try {
                        animal.EliminarMamiferoAcuatico(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Mamifero terrestre")){
                    try {
                        animal.EliminarMamiferoTerrestre(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Peces")){
                    try {
                        animal.EliminarPeces(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Reptil acuatico")){
                    try {
                        animal.EliminarReptilAcuatico(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
                else if(opcionSeleccionada.equals("Reptil terrestre")){
                    try {
                        animal.EliminarReptilTerrestre(codigo);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelEliminarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    principal.showPanelAnimalEliminado();
                }
            }
        });
    }
}
