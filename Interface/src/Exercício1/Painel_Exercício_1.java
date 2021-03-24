package Exercício1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * Extends JPanel: significa que todos os métodos e 
 * atributos da classe JPanel poderão ser acessados 
 * pela minha classe Painel_Exercício_1
 */
public class Painel_Exercício_1 extends JPanel{

	/*
	 * Função de Painel_Exercício_1 que desenha o
	 * tabuleiro de xadrez
	 */
	public void paintComponent(Graphics g) {
		/*
		 * Se usa o "super" para acessar uma método
		 * da classe pai, nesse caso a classe 
		 * JPanel
		 */
		super.paintComponents(g);
			
		for(int x=0; x<8; x++) {
			for(int y=0; y<8; y++) {
	
				if((x+y) % 2 == 0)
					g.setColor(Color.white);
				else
					g.setColor(Color.black);
				
				g.fillRect(x*50, y*50, 50, 50);
			}
		}
	}
		

}
