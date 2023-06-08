/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Control.GestionReporte.Planes;
import Control.GestionVentas.Clientes;
import Principal.View.InitView;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelVentaRegular extends JPanel{
    private Clientes cliente;
    private InitView principal;
    private int id;
    private int puntos;
    private boolean conGuia = false;
    private JTextField campoCantidad;
    private JCheckBox validarDescuento;
    private JCheckBox validarGuia;
    private boolean descuento = false;
    private JButton btnVender;
    private String cantidad;
    
    public PanelVentaRegular(InitView principal, int id){
        this.principal = principal;
        this.id = id;
        this.cliente = new Clientes(id);
        this.puntos = cliente.getPuntos();
        
        this.setLayout(new GridLayout(6,1,0,10));
        setBounds(50,250,800,300);
        
        
        if(cliente.getPuntos()<200){
            //Jlabel auxiliar (para mantener la estructura)
            JLabel aux = new JLabel("");
            aux.setFont(new Font("Arial",Font.BOLD,15));
            aux.setHorizontalAlignment(JLabel.CENTER);
            aux.setBounds(50, 300, 600, 50);
            add(aux);
            }
        else{
            //Eleccion de descuento por puntos
            validarDescuento = new JCheckBox("Incluir descuento por puntos");
            validarDescuento.setFont(new Font("Arial",Font.BOLD,15));
            validarDescuento.setHorizontalAlignment(JLabel.CENTER);
            validarDescuento.setBounds(50, 300, 600, 50);
            add(validarDescuento);
            
            //validar si se quiere un descuento o no
            validarDescuento.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Obtener el estado actual del checkbox
                    boolean seleccionado = validarDescuento.isSelected();

                    // Actualizar el valor de verdad
                    descuento = seleccionado;
                    
                }
            });
            
            
        }
        
        JLabel ide = new JLabel("Cantidad de entradas");
        ide.setFont(new Font("Arial",Font.BOLD,15));
        ide.setHorizontalAlignment(JLabel.CENTER);
        ide.setBounds(50, 300, 600, 50);
        add(ide);
        
        this.campoCantidad = new JTextField(19);
        add(campoCantidad);
        
        validarGuia = new JCheckBox("Incluir un guía al recorrido");
        validarGuia.setFont(new Font("Arial",Font.BOLD,15));
        validarGuia.setHorizontalAlignment(JLabel.CENTER);
        validarGuia.setBounds(50, 300, 600, 50);
        add(validarGuia);
        
        validarGuia.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Obtener el estado actual del checkbox
                    boolean seleccionado = validarGuia.isSelected();

                    // Actualizar el valor de verdad
                    conGuia = seleccionado;          
                }
        });
        
        JLabel espacio = new JLabel("");
        espacio.setFont(new Font("Arial",Font.BOLD,15));
        espacio.setHorizontalAlignment(JLabel.CENTER);
        espacio.setBounds(50, 300, 600, 50);
        add(espacio);
        
        this.btnVender = new JButton("Confirmar venta");
        btnVender.setBounds(50, 300, 600, 50);
        add(btnVender);
        
        btnVender.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                setCantidad(campoCantidad.getText());
                // Eliminamos los botones de ventas
                setVisible(false);
                if(conGuia){
                    Planes planRegularCon = new Planes("Regular con guía");
                    String[] venta = {"Regular con guía",campoCantidad.getText(),""+planRegularCon.getPrecioPlan(),""+isDescuento()};
                    if(isDescuento()){
                        cliente.modificarPuntosCliente(id, (cliente.getPuntos()-200));
                    }
                    else{
                        cliente.modificarPuntosCliente(id, (cliente.getPuntos()+(int)planRegularCon.getPuntos()));
                    }
                    principal.addVenta(venta);
                }
                else{
                    Planes planRegularSin = new Planes("Regular");
                    String[] venta = {"Regular",campoCantidad.getText(),""+planRegularSin.getPrecioPlan(),""+isDescuento()};
                    if(isDescuento()){
                        cliente.modificarPuntosCliente(id, (cliente.getPuntos()-200));
                    }
                    else{
                        cliente.modificarPuntosCliente(id, (cliente.getPuntos()+(int)planRegularSin.getPuntos()));
                    }
                    principal.addVenta(venta);
                }
                
                // Mostrar venta exitosa
                principal.showVentaExitosa();
            }
        });
        
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDescuento() {
        return descuento;
    }
    
    
    
}
