/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Principal.View.InitView;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brahiam
 */
public class PanelAgregarAnimal extends JPanel{
    private InitView principal;
    private JButton btnAgregar;
    private JComboBox<String> comboBox;
    private JLabel informeLabel;
    
    public PanelAgregarAnimal(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(1,3,15,0));
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
        
        // Botón de individual
        btnAgregar = new JButton("Agregar Animal");
        btnAgregar.setPreferredSize(new Dimension(200, 250));
        add(btnAgregar);
        
        //Accion del boton Individual
        btnAgregar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                 // Obtener la opción seleccionada por el usuario
                String opcionSeleccionada = (String) comboBox.getSelectedItem();
                setVisible(false);
                // Ejecutar las clases según la opción seleccionada
                if (opcionSeleccionada.equals("Anfibio")) {
                    principal.showPanelAnfibio();
                    
                }
                else if(opcionSeleccionada.equals("Ave Acuatica")){
                    principal.showPanelAveAcuatica();
                }
                else if(opcionSeleccionada.equals("Ave carroña rapiña")){
                    principal.showPanelAveCarroña();
                }
                else if(opcionSeleccionada.equals("Ave exótica")){
                    principal.showPanelAveExotica();
                }
                else if(opcionSeleccionada.equals("Ave terrestre")){
                    principal.showPanelAveTerrestre();
                }
                else if(opcionSeleccionada.equals("Insecto")){
                    principal.showPanelInsectos();
                }
                else if(opcionSeleccionada.equals("Mamifero acuatico")){
                    principal.showMamiferoAcuatico();
                }
                else if(opcionSeleccionada.equals("Mamifero terrestre")){
                    principal.showPanelMamiferoTerrestre();
                }
                else if(opcionSeleccionada.equals("Peces")){
                    principal.showPanelPeces();
                }
                else if(opcionSeleccionada.equals("Reptil acuatico")){
                    principal.showPanelReptilAcuatico();
                }
                else if(opcionSeleccionada.equals("Reptil terrestre")){
                    principal.showPanelReptilTerrestre();
                }
            }
        });
    }
}
