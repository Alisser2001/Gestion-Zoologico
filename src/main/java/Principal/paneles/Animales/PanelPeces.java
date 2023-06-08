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
public class PanelPeces extends JPanel{
    private InitView principal;
    private JLabel codigoLabel;
    private JTextField codigoField;
    private JLabel nombreLabel;
    private JTextField nombreField;
    private JLabel especieLabel;
    private JTextField especieField;
    private JLabel generoLabel;
    private JTextField generoField;
    private JLabel coloracionLabel;
    private JTextField coloracionField;
    private JLabel tipoAguaLabel;
    private JTextField tipoAguaField;
    private JLabel tempAcuarioLabel;
    private JTextField tempAcuarioField;
    private JLabel dietaPrincipalLabel;
    private JTextField dietaPrincipalField;
    private JLabel dietaCompletalLabel;
    private JTextField dietaCompletaField;
    private JLabel habitadLabel;
    private JTextField habitadField;
    private JLabel zonaLabel;
    private JTextField zonaField;
    private JLabel procedenciaLabel;
    private JTextField procedenciaField;
    private JLabel cantidadLabel;
    private JTextField cantidadField;
    private JLabel riesgoExtincionLabel;
    private JTextField riesgoExtincionField;
    private JLabel reproduccionLabel;
    private JTextField reproduccionField;
    private JCheckBox peligrosoCheckBox;
    private JLabel nivelPeligrosidadLabel;
    private JTextField nivelPeligrosidadField;
    private JCheckBox venenosoCheckBox;
    private JLabel tipoVenenoLabel;
    private JTextField tipoVenenoField;
    private JLabel precaucionesLabel;
    private JTextField precaucionesField;
    private JLabel especiesCompatiblesLabel;
    private JTextField especiesCompatiblesField;
    
    private JButton btnGuardar;
    
    int codigo;
    String nombre;
    String especie;
    String genero;
    String coloracion;
    String tipoAgua;
    String tempAcuario;
    String dietaPrincipal;
    String dietaCompleta[];
    String habitad;
    String zona;
    String procedencia;
    int cantidad;
    String riesgoExtincion;
    String reproduccion;
    boolean peligroso;
    String nivelPeligrosidad;
    boolean venenoso;
    String tipoVeneno;
    String[] precauciones;
    String[] especiesCompatibles;
    
    
    public PanelPeces(InitView principal){
        this.principal = principal;
        setLayout(new GridLayout(7,6,5,5));
        setBounds(10,250,800,350);
        
        codigoLabel = new JLabel("Código:");
        codigoField = new JTextField();
        nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        especieLabel = new JLabel("Especie:");
        especieField = new JTextField();
        generoLabel = new JLabel("Género:");
        generoField = new JTextField();
        coloracionLabel = new JLabel("coloracion:");
        coloracionField = new JTextField();
        tipoAguaLabel = new JLabel("tipoAgua:");
        tipoAguaField = new JTextField();
        tempAcuarioLabel = new JLabel("temperatura Ac:");
        tempAcuarioField = new JTextField();
        dietaPrincipalLabel = new JLabel("Dieta Principal:");
        dietaPrincipalField = new JTextField();
        dietaCompletalLabel = new JLabel("Dieta completa: ");
        dietaCompletaField = new JTextField();
        habitadLabel = new JLabel("Hábitad:");
        habitadField = new JTextField();
        zonaLabel = new JLabel("Zona:");
        zonaField = new JTextField();
        procedenciaLabel = new JLabel("Procedencia:");
        procedenciaField = new JTextField();
        cantidadLabel = new JLabel("cantidad:");
        cantidadField = new JTextField();
        riesgoExtincionLabel = new JLabel("Riesgo de Extinción:");
        riesgoExtincionField = new JTextField();
        reproduccionLabel = new JLabel("Reproducción:");
        reproduccionField = new JTextField();
        
        peligrosoCheckBox = new JCheckBox("Peligroso");
        nivelPeligrosidadLabel = new JLabel("Nivel de Peligrosidad:");
        nivelPeligrosidadField = new JTextField();
        venenosoCheckBox = new JCheckBox("Venenoso");
        tipoVenenoLabel = new JLabel("Tipo de Veneno:");
        tipoVenenoField = new JTextField();
        precaucionesLabel = new JLabel("Precauciones:");
        precaucionesField = new JTextField();
        especiesCompatiblesLabel = new JLabel("Especies compatibles: ");
        especiesCompatiblesField = new JTextField();
        
        btnGuardar = new JButton("Guardar");
        
        add(codigoLabel);
        add(codigoField);
        add(nombreLabel);
        add(nombreField);
        add(especieLabel);
        add(especieField);
        add(generoLabel);
        add(generoField);
        add(coloracionLabel);
        add(coloracionField);
        add(tipoAguaLabel);
        add(tipoAguaField);
        add(tempAcuarioLabel);
        add(tempAcuarioField);add(dietaPrincipalLabel);
        add(dietaPrincipalField);
        add(dietaCompletalLabel);
        add(dietaCompletaField);
        add(habitadLabel);
        add(habitadField);
        add(zonaLabel);
        add(zonaField);
        add(procedenciaLabel);
        add(procedenciaField);
        add(cantidadLabel);
        add(cantidadField);
        add(riesgoExtincionLabel);
        add(riesgoExtincionField);
        add(reproduccionLabel);
        add(reproduccionField);
        add(nivelPeligrosidadLabel);
        add(nivelPeligrosidadField);
        add(tipoVenenoLabel);
        add(tipoVenenoField);
        add(precaucionesLabel);
        add(precaucionesField);
        add(especiesCompatiblesLabel);
        add(especiesCompatiblesField);
        add(peligrosoCheckBox);
        add(venenosoCheckBox);
        add(btnGuardar);
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Obtener los valores ingresados en los campos
                codigo = Integer.parseInt(codigoField.getText());
                cantidad = Integer.parseInt(cantidadField.getText());
                peligroso = peligrosoCheckBox.isSelected();
                venenoso = venenosoCheckBox.isSelected();
                nombre = nombreField.getText();
                especie = especieField.getText();
                genero = generoField.getText();
                reproduccion = reproduccionField.getText();
                dietaPrincipal = dietaPrincipalField.getText();
                coloracion = coloracionField.getText();
                tipoAgua = tipoAguaField.getText();
                tempAcuario = tempAcuarioField.getText();
                dietaCompleta = textoArray(dietaCompletaField);
                
                habitad = habitadField.getText();
                zona = zonaField.getText();
                procedencia = procedenciaField.getText();
                riesgoExtincion = riesgoExtincionField.getText();
                nivelPeligrosidad = nivelPeligrosidadField.getText();
                tipoVeneno = tipoVenenoField.getText();
                precauciones = textoArray(precaucionesField);
                
                especiesCompatibles = textoArray(especiesCompatiblesField);
                
                
                
                CrearNuevoAnimal nuevoAnimal = new CrearNuevoAnimal();
                try {
                    nuevoAnimal.crearNuevosPeces(codigo, nombre, especie, genero,
                            coloracion, tipoAgua, tempAcuario, dietaPrincipal, dietaCompleta, 
                            habitad, zona, procedencia, cantidad, riesgoExtincion, reproduccion, 
                            peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones, especiesCompatibles);
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
