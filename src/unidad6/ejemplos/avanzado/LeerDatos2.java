package unidad6.ejemplos.avanzado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeerDatos2 extends JFrame {

    private JTextArea areaTexto;
    private JLabel resultadoLabel; // Etiqueta para mostrar el resultado

    public LeerDatos2() {
        setTitle("Entrada de Texto Multilinea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        areaTexto = new JTextArea();
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(areaTexto);

        JButton botonObtenerTexto = new JButton("Obtener Texto");
        botonObtenerTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoIngresado = areaTexto.getText();
                String[] lineasTexto = textoIngresado.split("\n");

                StringBuilder resultado = new StringBuilder("Texto ingresado:\n");
                for (String linea : lineasTexto) {
                    resultado.append(linea).append("\n");
                }

                // Actualizar la etiqueta de resultado
                resultadoLabel.setText(resultado.toString());
            }
        });

        // Crear una etiqueta para mostrar el resultado
        resultadoLabel = new JLabel();

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(scrollPane);
        add(botonObtenerTexto);
        add(resultadoLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
       new LeerDatos2();
    }
}
