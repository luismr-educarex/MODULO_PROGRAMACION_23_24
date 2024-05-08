package unidad13.ejemplos.bodega;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

class Depositos extends JPanel {
        private int nivelLiquido;

        public Depositos(int nivelLiquido) {
            this.nivelLiquido = nivelLiquido;
            this.setPreferredSize(new Dimension(100, 100));
            this.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public void establecerNivelLiquido(int nivel) {
            this.nivelLiquido = Math.min(Math.max(nivel, 0), 100);
            this.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int alturaLlenado = this.getHeight() * nivelLiquido / 100;
            g.setColor(Color.blue);
            g.fillRect(0, this.getHeight() - alturaLlenado, this.getWidth(), alturaLlenado);
        }

		public int getNivelLiquido() {
			return nivelLiquido;
		}
        
        
    }