package unidad6.ejemplos.avanzado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNumeros extends JFrame {
    private JTextField campoNumerico;
    private JButton[] botonesNumeros;
    private JButton aceptarButton;

    public VentanaNumeros() {
        // Configuración de la ventana principal
        setTitle("Ventana de Números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear componentes
        campoNumerico = new JTextField(10); // Un solo campo de texto
        botonesNumeros = new JButton[10];
        aceptarButton = new JButton("Aceptar");

        // Configurar el diseño de la ventana principal
        setLayout(new BorderLayout());

        // Panel para el campo de texto (FlowLayout, centrado)
        JPanel panelCampoNumerico = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCampoNumerico.add(campoNumerico);
        add(panelCampoNumerico, BorderLayout.NORTH);

        // Panel para los botones (GridLayout con dos filas)
        JPanel panelBotones = new JPanel(new GridLayout(2, 5, 10, 10));

        // Botones del 0 al 9
        for (int i = 0; i < 10; i++) {
            final int numero = i;
            botonesNumeros[i] = new JButton(Integer.toString(i));
            botonesNumeros[i].setFont(new Font("Arial", Font.PLAIN, 12));
            botonesNumeros[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Agregar el número al campo de texto
                    campoNumerico.setText(campoNumerico.getText() + numero);
                }
            });
            panelBotones.add(botonesNumeros[i]);
        }

        add(panelBotones, BorderLayout.CENTER);

        // Panel para el botón Aceptar (FlowLayout, centrado)
        JPanel panelAceptar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        aceptarButton.setFont(new Font("Arial", Font.PLAIN, 14));
        panelAceptar.add(aceptarButton);
        add(panelAceptar, BorderLayout.SOUTH);

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones al hacer clic en el botón Aceptar
                JOptionPane.showMessageDialog(VentanaNumeros.this, "¡Botón Aceptar presionado!");
            }
        });
        
        // Mostrar la ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
   

    public static void main(String[] args) {
        new VentanaNumeros();
    }
}
