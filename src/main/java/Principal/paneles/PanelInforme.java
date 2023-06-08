/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

/**
 *
 * @author Brahiam
 */
import Principal.View.InitView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelInforme extends JPanel {
    private InitView prinipal;
    private JLabel informeLabel;
    private JButton btnRegresar;

    public PanelInforme(InitView principal) {
        this.prinipal = principal;
        setLayout(new GridLayout(1,2));
        setBounds(50,250,800,250);

        // Creamos el JLabel y lo añadimos al panel
        informeLabel = new JLabel("Informe generado exitosamente");
        informeLabel.setFont(new Font("Arial",Font.BOLD,25));
        informeLabel.setHorizontalAlignment(JLabel.CENTER);
        informeLabel.setBounds(50, 300, 800, 50);
        add(informeLabel);;

        // Creamos el JButton y lo añadimos al panel
        btnRegresar = new JButton("Regresar");
        add(btnRegresar);
        
        
        
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
