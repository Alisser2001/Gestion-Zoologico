/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Principal.View.InitView;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Brahiam
 */
public class PanelOpcionesGestion extends JPanel{
    private InitView principal;
    private JPanel panelbotones;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnRegresar;
    
    public PanelOpcionesGestion(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(1,3,50,0));
        setBounds(50,250,800,250);
        
        
        btnAgregar = new JButton("Agregar Animal");
        btnAgregar.setPreferredSize(new Dimension(200, 250));
        add(btnAgregar);
        
        
        btnEliminar = new JButton("Eliminar Animal");
        btnEliminar.setPreferredSize(new Dimension(200, 250));
        add(btnEliminar);
        
        btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(200, 250));
        add(btnRegresar);
        
        panelbotones = new JPanel();
        panelbotones.add(this);
        
        
        
        
        
        btnAgregar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showPanelAgregarAnimal();
            }
        });
        
        
        btnEliminar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showPanelEliminarAnimal();
            }
        });
        
        btnRegresar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showPrincipal();
            }
        });
    }
}
