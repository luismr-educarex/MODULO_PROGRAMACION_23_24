package unidad13.select;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SelectDemo {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Ejemplo de JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Crear un array de opciones para el JComboBox
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};

        // Crear el JComboBox con las opciones
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Añadir un ActionListener al JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String selectedOption = (String) cb.getSelectedItem();
                System.out.println("Opción seleccionada: " + selectedOption);
            }
        });

        // Agregar el JComboBox al JFrame
        frame.add(comboBox);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
