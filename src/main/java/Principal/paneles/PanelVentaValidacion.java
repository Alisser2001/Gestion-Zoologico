/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Control.GestionVentas.Clientes;
import Principal.View.InitView;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelVentaValidacion extends JPanel{
    private int idCliente;
    private InitView principal;
    private JTextField campoId;
    private JButton btnValidar;
    private JLabel id;
    
    //atributos cliente
    private static String nombreCliente;
    private int puntosCliente;
    
    public PanelVentaValidacion(InitView principal){
        this.idCliente = 0;
        this.principal = principal;
        this.setLayout(new GridLayout(6,1,0,10));
        setBounds(165,130,600,300);
        
        this.id = new JLabel("ID (sin puntos y solo numeros):");
        id.setFont(new Font("Arial",Font.BOLD,15));
        id.setHorizontalAlignment(JLabel.CENTER);
        id.setBounds(50, 300, 600, 50);
        add(id);;
        
        this.campoId = new JTextField(19);
        add(campoId);
        
        this.btnValidar = new JButton("validar");
        btnValidar.setBounds(50, 300, 600, 50);
        add(btnValidar);
        
        btnValidar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                //ocultar boton de validacion y despliegue de nuevos campos
                btnValidar.setVisible(false);
                revalidate();
                repaint();
                idCliente = Integer.parseInt(campoId.getText());
                
                Clientes cliente = new Clientes(idCliente);
                if(cliente.getSize() == 0){
                    //cliente nuevo
                    System.out.println("Cliente nuevo");
                    JLabel nombreC = new JLabel("Nombre del cliente: ");
                    nombreC.setFont(new Font("Arial",Font.BOLD,15));
                    nombreC.setHorizontalAlignment(JLabel.CENTER);
                    nombreC.setBounds(50, 300, 600, 50);
                    add(nombreC);
                    
                    JTextField campoNombre = new JTextField(19);
                    add(campoNombre);

                    JButton btnRegistrar = new JButton("Registrar cliente");
                    btnRegistrar.setBounds(50, 300, 600, 50);
                    add(btnRegistrar);
                    
                    
                    
                    
                    
                    //accion boton registrar
                    btnRegistrar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            setNombre(campoNombre.getText());
                            setPuntos(0);
                            setVisible(false);
                            cliente.agregarCliente(getNombre(), puntosCliente);
                            principal.showVentaRegular(getIdCliente());  
                        }
                        });
                    
                    
                }
                else{
                    setVisible(false);
                    principal.showVentaRegular(getIdCliente());
                }
            
            }
        });
        
    }

    public void setNombre(String nombre) {
        this.nombreCliente = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntosCliente = puntos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return this.nombreCliente;
    }
    
    
    
}
