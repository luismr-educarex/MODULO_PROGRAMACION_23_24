package practicasfinales.ventasentradas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tareas para los Alumnos
Calcular Precio:

Completar la lógica en el método calcularPrecio para determinar el precio de la entrada basada en si el usuario es abonado o no y si el tipo de precio es normal o reducido.
Comprar Entrada:

Completar la lógica en el método comprarEntrada para disminuir el número de localidades disponibles y actualizar las localidades restantes, además de mostrar mensajes apropiados al usuario.
Actualizar Localidades:

Completar la lógica en el método actualizarLocalidades para mostrar el número de localidades restantes basadas en la zona seleccionada.
Evaluación
Se evaluará la capacidad de los alumnos para completar la funcionalidad del programa, asegurar que el cálculo de precios y la actualización de localidades se realiza correctamente, y manejar adecuadamente los eventos de la interfaz gráfica.





 */
public class VentaEntradasInicio extends JFrame {
    private JComboBox<String> comboTipoEntrada;
    private JComboBox<String> comboTipoPrecio;
    private JCheckBox checkAbonado;
    private JTextField textPrecio;
    private JTextField textLocalidadesRestantes;
    
    private final int[] localidades = {200, 40, 400, 100};
    private final double[] preciosNormales = {25, 70, 20, 15.5};
    private final double[] preciosAbonados = {17.5, 40, 14, 10};
    private final String[] zonas = {"Principal", "Palco", "Central", "Lateral"};
    
    public VentaEntradasInicio() {
        setTitle("Venta de Entradas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        
        panel.add(new JLabel("Tipo de Entrada:"));
        comboTipoEntrada = new JComboBox<>(zonas);
        panel.add(comboTipoEntrada);
        
        panel.add(new JLabel("Tipo de Precio:"));
        comboTipoPrecio = new JComboBox<>(new String[]{"Normal", "Reducido"});
        panel.add(comboTipoPrecio);
        
        panel.add(new JLabel("Abonado:"));
        checkAbonado = new JCheckBox();
        panel.add(checkAbonado);
        
        panel.add(new JLabel("Precio:"));
        textPrecio = new JTextField();
        textPrecio.setEditable(false);
        panel.add(textPrecio);
        
        panel.add(new JLabel("Localidades Restantes:"));
        textLocalidadesRestantes = new JTextField();
        textLocalidadesRestantes.setEditable(false);
        panel.add(textLocalidadesRestantes);
        
        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        panel.add(calcularPrecioButton);
        
        JButton comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(comprarButton);
        
        add(panel);
        
    }
    
    private void calcularPrecio() {
     
    }
    
    private void comprarEntrada() {
       
    }
    
    private void actualizarLocalidades() {
      
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentaEntradasInicio().setVisible(true);
            }
        });
    }
}
