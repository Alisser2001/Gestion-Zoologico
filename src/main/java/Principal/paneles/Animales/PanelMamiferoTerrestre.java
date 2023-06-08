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
public class PanelMamiferoTerrestre extends JPanel{
    private InitView principal;
    
    private JLabel codigoLabel;
    private JTextField codigoField;
    private JLabel nombreLabel;
    private JTextField nombreField;
    private JLabel especieLabel;
    private JTextField especieField;
    private JLabel generoLabel;
    private JTextField generoField;
    private JLabel pesoLabel;
    private JTextField pesoField;
    private JLabel dietaPrincipalLabel;
    private JTextField dietaPrincipalField;
    private JLabel dietaCompletalLabel;
    private JTextField dietaCompletaField;
    private JLabel edadLabel;
    private JTextField edadField;
    private JLabel numPatasLabel;
    private JTextField numPatasField;
    private JLabel habitadLabel;
    private JTextField habitadField;
    private JLabel zonaLabel;
    private JTextField zonaField;
    private JLabel procedenciaLabel;
    private JTextField procedenciaField;
    private JLabel riesgoExtincionLabel;
    private JTextField riesgoExtincionField;
    private JCheckBox gestacionCheckBox;
    private JLabel tipoGestacionLabel;
    private JTextField tipoGestacionField;
    private JLabel tiempoGestacionLabel;
    private JTextField tiempoGestacionField;
    private JCheckBox peligrosoCheckBox;
    private JLabel nivelPeligrosidadLabel;
    private JTextField nivelPeligrosidadField;
    private JCheckBox venenosoCheckBox;
    private JLabel tipoVenenoLabel;
    private JTextField tipoVenenoField;
    private JCheckBox maltratadoCheckBox;
    private JLabel comportamientoSocialLabel;
    private JTextField comportamientoSocialField;
    private JLabel caracterLabel;
    private JTextField caracterField;
    private JLabel precaucionesLabel;
    private JTextField precaucionesField;
    private JLabel comportamientoLabel;
    private JTextField comportamientoField;
    
    private JButton btnGuardar;
    
    private int codigo;
    private String nombre;
    private String especie;
    private String genero;
    private float peso;
    private String dietaPrincipal;
    private String dietaCompleta[];
    private int edad;
    private int numPatas;
    private String habitad;
    private String zona;
    private String procedencia;
    private String riesgoExtincion;
    private boolean gestacion;
    private String tipoGestacion;
    private String tiempoGestacion;
    private boolean peligroso;
    private String nivelPeligrosidad;
    private boolean venenoso;
    private String tipoVeneno;
    private boolean maltratado;
    private String comportamientoSocial;
    private String caracter;
    private String comportamiento;
    private String[] precauciones;
    
    public PanelMamiferoTerrestre(InitView principal){
        this.principal = principal;
        setLayout(new GridLayout(8,6,5,5));
        setBounds(10,250,800,350);
        
        codigoLabel = new JLabel("Código:");
        codigoField = new JTextField();
        nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        especieLabel = new JLabel("Especie:");
        especieField = new JTextField();
        generoLabel = new JLabel("Género:");
        generoField = new JTextField();
        edadLabel = new JLabel("Edad:");
        edadField = new JTextField();
        pesoLabel = new JLabel("Peso:");
        pesoField = new JTextField();
        dietaPrincipalLabel = new JLabel("Dieta Principal:");
        dietaPrincipalField = new JTextField();
        dietaCompletalLabel = new JLabel("Dieta completa: ");
        dietaCompletaField = new JTextField();
        numPatasLabel = new JLabel("número de patas: ");
        numPatasField = new JTextField();
        comportamientoLabel = new JLabel("Comportamiento: ");
        comportamientoField = new JTextField();
        habitadLabel = new JLabel("Hábitad:");
        habitadField = new JTextField();
        zonaLabel = new JLabel("Zona:");
        zonaField = new JTextField();
        procedenciaLabel = new JLabel("Procedencia:");
        procedenciaField = new JTextField();
        riesgoExtincionLabel = new JLabel("Riesgo de Extinción:");
        riesgoExtincionField = new JTextField();
        gestacionCheckBox = new JCheckBox("Gestación");
        tipoGestacionLabel = new JLabel("Tipo de Gestación:");
        tipoGestacionField = new JTextField();
        tiempoGestacionLabel = new JLabel("Tiempo de Gestación:");
        tiempoGestacionField = new JTextField();
        peligrosoCheckBox = new JCheckBox("Peligroso");
        nivelPeligrosidadLabel = new JLabel("Nivel de Peligrosidad:");
        nivelPeligrosidadField = new JTextField();
        venenosoCheckBox = new JCheckBox("Venenoso");
        tipoVenenoLabel = new JLabel("Tipo de Veneno:");
        tipoVenenoField = new JTextField();
        maltratadoCheckBox = new JCheckBox("Maltratado");
        comportamientoSocialLabel = new JLabel("Comportamiento Social:");
        comportamientoSocialField = new JTextField();
        caracterLabel = new JLabel("Caracter:");
        caracterField = new JTextField();
        precaucionesLabel = new JLabel("Precauciones:");
        precaucionesField = new JTextField();
        
        btnGuardar = new JButton("Guardar");
        
        add(codigoLabel);
        add(codigoField);
        add(nombreLabel);
        add(nombreField);
        add(especieLabel);
        add(especieField);
        add(generoLabel);
        add(generoField);
        add(edadLabel);
        add(edadField);
        add(pesoLabel);
        add(pesoField);
        add(dietaPrincipalLabel);
        add(dietaPrincipalField);
        add(dietaCompletalLabel);
        add(dietaCompletaField);
        add(numPatasLabel);
        add(numPatasField);
        add(comportamientoLabel);
        add(comportamientoField);
        add(habitadLabel);
        add(habitadField);
        add(zonaLabel);
        add(zonaField);
        add(procedenciaLabel);
        add(procedenciaField);
        add(riesgoExtincionLabel);
        add(riesgoExtincionField);
        add(tipoGestacionLabel);
        add(tipoGestacionField);
        add(tiempoGestacionLabel);
        add(tiempoGestacionField);
        add(nivelPeligrosidadLabel);
        add(nivelPeligrosidadField);
        add(tipoVenenoLabel);
        add(tipoVenenoField);
        add(comportamientoSocialLabel);
        add(comportamientoSocialField);
        add(caracterLabel);
        add(caracterField);
        add(precaucionesLabel);
        add(precaucionesField);
        add(gestacionCheckBox);
        add(maltratadoCheckBox);
        add(peligrosoCheckBox);
        add(venenosoCheckBox);
        add(btnGuardar);
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Obtener los valores ingresados en los campos
                codigo = Integer.parseInt(codigoField.getText());
                edad = Integer.parseInt(edadField.getText());
                peso = Float.parseFloat(pesoField.getText());
                numPatas = Integer.parseInt(numPatasField.getText());
                gestacion = gestacionCheckBox.isSelected();
                peligroso = peligrosoCheckBox.isSelected();
                maltratado = maltratadoCheckBox.isSelected();
                venenoso = venenosoCheckBox.isSelected();
                nombre = nombreField.getText();
                especie = especieField.getText();
                genero = generoField.getText();
                comportamiento = comportamientoField.getText();
                dietaPrincipal = dietaPrincipalField.getText();
                dietaCompleta = textoArray(dietaCompletaField);
                
                habitad = habitadField.getText();
                zona = zonaField.getText();
                procedencia = procedenciaField.getText();
                riesgoExtincion = riesgoExtincionField.getText();
                tipoGestacion = tipoGestacionField.getText();
                tiempoGestacion = tiempoGestacionField.getText();
                nivelPeligrosidad = nivelPeligrosidadField.getText();
                tipoVeneno = tipoVenenoField.getText();
                comportamientoSocial = comportamientoSocialField.getText();
                caracter = caracterField.getText();
                precauciones = textoArray(precaucionesField);
                
                
                
                CrearNuevoAnimal nuevoAnimal = new CrearNuevoAnimal();
                try {
                    nuevoAnimal.crearNuevoMamiferoTerrestre(codigo, nombre, especie, 
                            genero, peso, dietaPrincipal, dietaCompleta, edad,
                            numPatas, habitad, zona, procedencia, riesgoExtincion, 
                            gestacion, tipoGestacion, tiempoGestacion, peligroso, 
                            nivelPeligrosidad, venenoso, tipoVeneno, maltratado, 
                            comportamientoSocial, caracter, comportamiento, precauciones);
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
