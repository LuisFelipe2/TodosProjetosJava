package Exercício4;

import javax.swing.JFrame;

public class Exercício4 extends JFrame{

	
	public Exercício4(){
		setTitle("Meu Frame");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		
		Painel_Exercício_4 cadastro = new Painel_Exercício_4();
		add(cadastro);
		
	}
	public static void main(String[] args) {
		new Exercício4();

	}
}
