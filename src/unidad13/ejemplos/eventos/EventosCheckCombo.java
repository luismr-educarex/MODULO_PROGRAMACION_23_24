package unidad13.ejemplos.eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class EventosCheckCombo extends JFrame {
    // Componentes
    private JCheckBox beca;
    private JComboBox<String> ciclos;
    private JComboBox<String> modulos;

    public EventosCheckCombo() {
        // Configuración de la ventana
        setTitle("Ejemplo eventos en checkBox y comboBox");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de los componentes
        beca = new JCheckBox("Beca");
        ciclos = new JComboBox<>(new String[]{"DAW", "DAM", "ASIR"});
        modulos = new JComboBox<>();
        modulos.setVisible(false); // Inicialmente no visible

        // Añadir componentes a la ventana
        add(beca);
        add(ciclos);
        add(modulos);

        // Listeners #################################
        beca.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    ejecutarFuncion();
                }
            }
        });

        ciclos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarComboBox2();
            }
        });
    }

    private void ejecutarFuncion() {
        // Código a ejecutar cuando el checkbox está seleccionado
        System.out.println("Beca seleccionada!");
    }

    private void actualizarComboBox2() {
        // Ejemplo de cómo actualizar el segundo combobox
    	modulos.removeAllItems();
        if (ciclos.getSelectedItem().toString().equals("DAW")) {
        	modulos.addItem("Desarrollo en entorno cliente");
        	modulos.addItem("Desarrollo en entorno cliente");
        } else if (ciclos.getSelectedItem().toString().equals("DAM")) {
        	modulos.addItem("Acceso a datos");
        	modulos.addItem("Programación de servicios y procesos");
        } else {
        	modulos.addItem("Administración de bases de datos");
            modulos.addItem("Servicios de red e internet");
        }
        
        modulos.setVisible(true); // Hacer visible después de llenar
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventosCheckCombo().setVisible(true);
            }
        });
    }
}
