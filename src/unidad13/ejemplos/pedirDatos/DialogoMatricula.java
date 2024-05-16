package unidad13.ejemplos.pedirDatos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoMatricula extends JDialog {
    private JTextField licenseField;
    private JTextField typeField;
    private JButton okButton;
    private JButton cancelButton;

    public DialogoMatricula(JFrame parent) {
        super(parent, "Datos del Coche", true);
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        // Configurar el layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Componentes del diálogo
        licenseField = new JTextField(10);
      
        add(new JLabel("Matrícula:"), gbc);
        add(licenseField, gbc);

        // Botones de acción
        okButton = new JButton("Aceptar");
        cancelButton = new JButton("Cancelar");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, gbc);

        // Eventos de los botones
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí se podría implementar la validación y recolección de datos
                setVisible(false);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            setVisible(false);
            }
        });
    }

    // Método para mostrar el diálogo y devolver los datos introducidos
    public String showDialog() {
        setVisible(true);

        return licenseField.getText();
    }
}