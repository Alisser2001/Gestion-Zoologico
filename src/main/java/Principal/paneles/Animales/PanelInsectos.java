/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles.Animales;

import Control.GestionAnimales.Animales.Gestionar.CrearNuevoAnimal;
import Principal.View.InitView;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelInsectos extends JPanel{
    
    private InitView principal;
    private JLabel codigoLabel;
    private JTextField codigoField;
    private JLabel nombreLabel;
    private JTextField nombreField;
    private JLabel especieLabel;
    private JTextField especieField;
    private JCheckBox metamorfosisCheckBox;
    private JLabel habitadLabel;
    private JTextField habitadField;
    private JLabel zonaLabel;
    private JTextField zonaField; 
    private JLabel procedenciaLabel;
    private JTextField procedenciaField;
    private JLabel cantidadLabel;
    private JTextField cantidadField;
    private JLabel paresPatasLabel;
    private JTextField paresPatasField;
    private JLabel paresAlasLabel;
    private JTextField paresAlasField;
    private JLabel riesgoExtincionLabel;
    private JTextField riesgoExtincionField;
    private JLabel dietaLabel;
    private JTextField dietaField;
    private JLabel dietaCompletaLabel;
    private JTextField dietaCompletaField;
    private JCheckBox peligrosoCheckBox;
    private JLabel nivelPeligrosidadLabel;
    private JTextField nivelPeligrosidadField;
    private JCheckBox venenosoCheckBox;
    private JLabel tipoVenenoLabel;
    private JTextField tipoVenenoField;
    private JLabel precaucionesLabel;
    private JTextField precaucionesField;
    
    private JButton btnGuardar;
    
    private int codigo;
    private String nombre;
    private String especie;
    private boolean metamorfosis;
    private String habitad;
    private String zona;
    private String procedencia;
    private int cantidad;
    private int paresPatas;
    private int paresAlas;
    private String riesgoExtincion;
    private String dietaPrincipal;
    private String dietaCompleta[];
    private boolean peligroso;
    private String nivelPeligrosidad;
    private boolean venenoso;
    private String tipoVeneno;
    private String[] precauciones;
    
    
    public PanelInsectos(InitView principal){
        this.principal = principal;
        setLayout(new GridLayout(6,6,5,5));
        setBounds(10,250,800,350);
        
        codigoLabel = new JLabel("Código:");
        codigoField = new JTextField();
        nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        especieLabel = new JLabel("Especie:");
        especieField = new JTextField();
        habitadLabel = new JLabel("Hábitad:");
        habitadField = new JTextField();
        zonaLabel = new JLabel("Zona:");
        zonaField = new JTextField();
        procedenciaLabel = new JLabel("Procedencia:");
        procedenciaField = new JTextField();
        cantidadLabel = new JLabel("cantidad:");
        cantidadField = new JTextField();
        paresPatasLabel = new JLabel("Pares patas:");
        paresPatasField = new JTextField();
        paresAlasLabel = new JLabel("Pares alas:");
        paresAlasField = new JTextField();
        riesgoExtincionLabel = new JLabel("Riesgo extionción:");
        riesgoExtincionField = new JTextField();
        dietaLabel = new JLabel("Dieta:");
        dietaField = new JTextField();
        dietaCompletaLabel = new JLabel("Dieta completa:");
        dietaCompletaField = new JTextField();
        nivelPeligrosidadLabel = new JLabel("Nivel peligrosidad:");
        nivelPeligrosidadField = new JTextField();
        precaucionesLabel = new JLabel("Precauciones:");
        precaucionesField = new JTextField();
        tipoVenenoLabel = new JLabel("Tipo veneno:");
        tipoVenenoField = new JTextField();
        
        peligrosoCheckBox = new JCheckBox("Peligroso");
        venenosoCheckBox = new JCheckBox("Venenoso");
        metamorfosisCheckBox = new JCheckBox("Metamorfosis");
        btnGuardar = new JButton("Guardar");
        
        add(codigoLabel);
        add(codigoField);
        add(nombreLabel);
        add(nombreField);
        add(especieLabel);
        add(especieField);
        add(habitadLabel);
        add(habitadField);
        add(zonaLabel);
        add(zonaField);
        add(procedenciaLabel);
        add(procedenciaField);
        add(cantidadLabel);
        add(cantidadField);
        add(paresPatasLabel);
        add(paresPatasField);
        add(paresAlasLabel);
        add(paresAlasField);
        add(riesgoExtincionLabel);
        add(riesgoExtincionField);
        add(dietaLabel);
        add(dietaField);
        add(dietaCompletaLabel);
        add(dietaCompletaField);
        add(nivelPeligrosidadLabel);
        add(nivelPeligrosidadField);
        add(precaucionesLabel);
        add(precaucionesField);
        add(tipoVenenoLabel);
        add(tipoVenenoField);
        add(peligrosoCheckBox);
        add(venenosoCheckBox);
        add(metamorfosisCheckBox);
        add(btnGuardar);
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Obtener los valores ingresados en los campos
                codigo = Integer.parseInt(codigoField.getText());
                nombre = nombreField.getText();
                especie = especieField.getText();
                metamorfosis = metamorfosisCheckBox.isSelected();
                habitad = habitadField.getText();
                zona = zonaField.getText();
                procedencia = procedenciaField.getText();
                cantidad = Integer.parseInt(cantidadField.getText());
                paresPatas = Integer.parseInt(paresPatasField.getText());
                paresAlas = Integer.parseInt(paresAlasField.getText());
                dietaPrincipal = dietaField.getText();
                dietaCompleta = textoArray(dietaCompletaField);
                riesgoExtincion = riesgoExtincionField.getText();
                peligroso = peligrosoCheckBox.isSelected();
                nivelPeligrosidad = nivelPeligrosidadField.getText();
                venenoso = venenosoCheckBox.isSelected();    
                tipoVeneno = tipoVenenoField.getText();
                precauciones = textoArray(precaucionesField);
                
                CrearNuevoAnimal nuevoAnimal = new CrearNuevoAnimal();
                try {
                    nuevoAnimal.crearNuevosInsectos(codigo, nombre, especie, 
                            metamorfosis, habitad, zona, procedencia, cantidad, 
                            paresPatas, paresAlas, riesgoExtincion, dietaPrincipal,
                            dietaCompleta, peligroso, nivelPeligrosidad, venenoso,
                            tipoVeneno, precauciones);
                } catch (IOException ex) {
                    Logger.getLogger(PanelAnfibio.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                principal.showPanelAnimalAgregado();

            }
        });
    }
    
    public String[] textoArray(JTextField texto){
        String textoExtraido = texto.getText();
        String[] stringArray = textoExtraido.split(",");
        System.out.println(stringArray);
        
        return stringArray;
    }
    
}
