package Exercício3;

import javax.swing.JFrame;

public class Exercício3 extends JFrame{
	
	
	
	public Exercício3(){			
		//FRAME
		setTitle("Meu Frame");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		
		Painel_Exercicio_3 painel = new Painel_Exercicio_3();
		add(painel);
		
		
	
	}
	
	public static void main(String[] args) {
		new Exercício3();
	}

}
