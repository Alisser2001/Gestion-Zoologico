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
public class PanelAnfibio extends JPanel{
    //labels y campos para llenar animal
    private InitView principal;
    
    private JLabel codigoLabel;
    private JTextField codigoField;
    private JLabel nombreLabel;
    private JTextField nombreField;
    private JLabel generoLabel;
    private JTextField generoField;
    private JLabel especieLabel;
    private JTextField especieField;
    private JLabel habitadLabel;
    private JTextField habitadField;
    private JLabel zonaLabel;
    private JTextField zonaField;  
    private JCheckBox peligrosoCheckBox;  
    private JLabel tipoVenenoLabel;
    private JTextField tipoVenenoField;
    private JLabel procedenciaLabel;
    private JTextField procedenciaField;
    private JLabel dietaLabel;
    private JTextField dietaField;
    private JLabel dietaCompletaLabel;
    private JTextField dietaCompletaField;
    private JLabel temperaturaLabel;
    private JTextField temperaturaField;
    private JLabel riesgoExtincionLabel;
    private JTextField riesgoExtincionField;
    private JLabel tipoReproduccionLabel;
    private JTextField tipoReproduccionField;
    private JLabel nivelPeligrosidadLabel;
    private JTextField nivelPeligrosidadField;
    private JCheckBox venenosoCheckBox;
    private JLabel precaucionesLabel;
    private JTextField precaucionesField;
    
    
    private JButton btnGuardar;
    
    //atributos del anfibio
    private int codigo;
    private String nombre;
    private String genero;
    private String especie;
    private String habitad;
    private String zona;
    private boolean peligroso;
    private String tipoVeneno;
    private String procedencia;
    private String dietaPrincipal;
    private String dietaCompleta[];
    private String temperaturaHabitad;
    private String riesgoExtincion;
    private String tipoReproduccion;
    private String nivelPeligrosidad;
    private boolean venenoso;
    private String precauciones[];
    
    public PanelAnfibio(InitView principal){
        this.principal = principal;
        setLayout(new GridLayout(6,6,5,5));
        setBounds(10,250,800,250);
        
        //inicializacion de labels y campos
        codigoLabel = new JLabel("Código:");
        codigoField = new JTextField();
        nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        generoLabel = new JLabel("Género:");
        generoField = new JTextField();
        especieLabel = new JLabel("Especie:");
        especieField = new JTextField();
        habitadLabel = new JLabel("Hábitad:");
        habitadField = new JTextField();
        zonaLabel = new JLabel("Zona:");
        zonaField = new JTextField();
        tipoVenenoLabel = new JLabel("Tipo veneno:");
        tipoVenenoField = new JTextField();
        procedenciaLabel = new JLabel("Procedencia:");
        procedenciaField = new JTextField();
        dietaLabel = new JLabel("Dieta:");
        dietaField = new JTextField();
        dietaCompletaLabel = new JLabel("Dieta completa:");
        dietaCompletaField = new JTextField();
        temperaturaLabel = new JLabel("Temperatura:");
        temperaturaField = new JTextField();
        riesgoExtincionLabel = new JLabel("Riesgo extionción:");
        riesgoExtincionField = new JTextField();
        tipoReproduccionLabel = new JLabel("tipo de Reproduccion:");
        tipoReproduccionField = new JTextField();
        nivelPeligrosidadLabel = new JLabel("Nivel peligrosidad:");
        nivelPeligrosidadField = new JTextField();
        precaucionesLabel = new JLabel("Precauciones:");
        precaucionesField = new JTextField();
        
        peligrosoCheckBox = new JCheckBox("Peligroso");
        venenosoCheckBox = new JCheckBox("Venenoso");
        btnGuardar = new JButton("Guardar");
        
        //agregar campos
        add(codigoLabel);
        add(codigoField);
        add(nombreLabel);
        add(nombreField);
        add(generoLabel);
        add(generoField);
        add(especieLabel);
        add(especieField);
        add(habitadLabel);
        add(habitadField);
        add(zonaLabel);
        add(zonaField);
        add(tipoVenenoLabel);
        add(tipoVenenoField);
        add(procedenciaLabel);
        add(procedenciaField);
        add(dietaLabel);
        add(dietaField);
        add(dietaCompletaLabel);
        add(dietaCompletaField);
        add(temperaturaLabel);
        add(temperaturaField);
        add(riesgoExtincionLabel);
        add(riesgoExtincionField);
        add(tipoReproduccionLabel);
        add(tipoReproduccionField);
        add(nivelPeligrosidadLabel);
        add(nivelPeligrosidadField);
        add(precaucionesLabel);
        add(precaucionesField);
        add(peligrosoCheckBox);
        add(venenosoCheckBox);
        add(btnGuardar);
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Obtener los valores ingresados en los campos
                codigo = Integer.parseInt(codigoField.getText());
                nombre = nombreField.getText();
                genero = generoField.getText();
                especie = especieField.getText();
                habitad = habitadField.getText();
                zona = zonaField.getText();
                procedencia = procedenciaField.getText();
                dietaPrincipal = dietaField.getText();
                dietaCompleta = textoArray(dietaCompletaField);
                temperaturaHabitad = temperaturaField.getText();
                riesgoExtincion = riesgoExtincionField.getText();
                tipoReproduccion = tipoReproduccionField.getText();
                peligroso = peligrosoCheckBox.isSelected();
                nivelPeligrosidad = nivelPeligrosidadField.getText();
                venenoso = venenosoCheckBox.isSelected();    
                tipoVeneno = tipoVenenoField.getText();
                precauciones = textoArray(precaucionesField);
                
                CrearNuevoAnimal nuevoAnimal = new CrearNuevoAnimal();
                try {
                    nuevoAnimal.crearNuevoAnfibio(codigo, nombre, especie, genero,
                            habitad, zona, procedencia, dietaPrincipal, dietaCompleta,
                            temperaturaHabitad, riesgoExtincion, tipoReproduccion, peligroso,
                            nivelPeligrosidad, venenoso, tipoVeneno, precauciones);
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
    

