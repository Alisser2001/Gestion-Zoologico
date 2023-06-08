/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;
import Control.GestionReporte.Planes;
import Principal.View.InitView;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Brahiam
 */
public class PanelVentaIndividual extends JPanel{
    private InitView principal;
    private JPanel panelbotones;
    private JButton btnEstudiante;
    private JButton btnRegular;
    private JButton btnregresar;
    
    public PanelVentaIndividual(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(1,3,50,0));
        setBounds(50,250,800,250);
        
        // Botón de individual
        btnEstudiante = new JButton("Estudiante");
        btnEstudiante.setPreferredSize(new Dimension(200, 250));
        add(btnEstudiante);
        
        // Botón de familiar
        btnRegular = new JButton("Regular");
        btnRegular.setPreferredSize(new Dimension(200, 250));
        add(btnRegular);
        panelbotones = new JPanel();
        panelbotones.add(this);
        
        //regresar
        btnregresar = new JButton("Regresar");
        btnregresar.setPreferredSize(new Dimension(200, 250));
        add(btnregresar);
        
        
        //Accion boton regresar
        btnregresar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showPrincipal();
            }
        });
        
        //Accion boton venta a estudiante
        btnEstudiante.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                Planes planEstudiante = new Planes("Estudiante");
                //nueva venta
                String[] venta = {"Estudiante","1",""+planEstudiante.getPrecioPlan(),"false"};
                principal.addVenta(venta);
                // Mostramos los botones anteriores
                principal.showVentaExitosa();
            }
        });
        //Accion boton venta a regular
        btnRegular.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showVentaValidacion();
            }
        });
        
}
}
