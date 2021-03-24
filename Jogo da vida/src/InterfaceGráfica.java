
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGráfica extends JFrame{
		
	Tabuleiro t = new Tabuleiro();
	
	InterfaceGráfica(){			
		setTitle("Meu Frame");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		//EXECUTA O PAINEL_1
		Painel painel = new Painel();
		add(painel);
	}
		
	public static void main(String[] args) {
		new InterfaceGráfica();		
	}
	
	class Painel extends JPanel{

		public void paintComponent(Graphics g) {

			Graphics2D g2 = (Graphics2D) g;
			
			for(int x=0; x<10; x++) {
				for(int y=0; y<10; y++) {
		
					if(t.tabuleiro[x][y] == 1)
						g2.setColor(Color.cyan);
					else
						g2.setColor(Color.DARK_GRAY);
					
					g2.fillRect(y * 50, x * 50, 50, 50);
					
					g2.setColor(Color.blue);
					g2.drawRect(y * 50, x * 50, 50, 50);
					
					g2.setStroke(new BasicStroke(2));
					
				}
			}
		}
	}
}
