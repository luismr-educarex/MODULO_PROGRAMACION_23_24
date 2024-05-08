package unidad13.ejemplos.bodega;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlNivelDepositosBodega extends JFrame {
    private Depositos[] depositos = new Depositos[3];
    private JTextField[] entradasNivel = new JTextField[3];
    private JButton botonLLenar, botonVaciar, botonSalvar, botonCargar;

    public ControlNivelDepositosBodega() {
        super("Control de Depósitos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        // Panel para los inputs y depósitos
        JPanel panelControlDepositos = new JPanel(new GridLayout(1, 6));
        for (int i = 0; i < depositos.length; i++) {
            entradasNivel[i] = new JTextField("0");
            depositos[i] = new Depositos(0);
            panelControlDepositos.add(entradasNivel[i]);
            panelControlDepositos.add(depositos[i]);
        }
        this.add(panelControlDepositos);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        botonLLenar = new JButton("Llenar");
        botonVaciar = new JButton("Vaciar");
        botonSalvar = new JButton("Guardar Estado");
        botonCargar = new JButton("Cargar Estado");

        botonLLenar.addActionListener(e -> llenarVaciearDepositos(true));   
        botonVaciar.addActionListener(e -> llenarVaciearDepositos(false)); 
        botonSalvar.addActionListener(e -> guardarEstado()); 
        botonCargar.addActionListener(e -> cargarEstado()); 
        
        panelBotones.add(botonLLenar);
        panelBotones.add(Box.createHorizontalGlue());
        panelBotones.add(botonVaciar);
        panelBotones.add(Box.createHorizontalGlue());
        panelBotones.add(botonSalvar);
        panelBotones.add(Box.createHorizontalGlue());
        panelBotones.add(botonCargar);
        this.add(panelBotones);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


	private void llenarVaciearDepositos(boolean llenar) {
		
        for (int i = 0; i < depositos.length; i++) {
            int nivelCambio = Integer.parseInt(entradasNivel[i].getText().trim());
            int nivelNuevo = llenar ? depositos[i].getNivelLiquido() + nivelCambio : depositos[i].getNivelLiquido() - nivelCambio;
            depositos[i].establecerNivelLiquido(nivelNuevo);
        }
    
	}

	private void guardarEstado() {
        try (FileWriter fw = new FileWriter("nivelesDeposito.txt")) {
            for (JTextField entrada : entradasNivel) {
                fw.write(entrada.getText() + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el estado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarEstado() {
        try (BufferedReader br = new BufferedReader(new FileReader("nivelesDeposito.txt"))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null && i < entradasNivel.length) {
                entradasNivel[i].setText(linea);
                depositos[i].establecerNivelLiquido(Integer.parseInt(linea));
                i++;
            }
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el estado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    

    public static void main(String[] args) {
        new ControlNivelDepositosBodega();
    }
}
