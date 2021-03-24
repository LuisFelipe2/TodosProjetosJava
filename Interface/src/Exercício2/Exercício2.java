package Exercício2;

import javax.swing.JFrame;

public class Exercício2 extends JFrame{

	public Exercício2(){
		
		//FRAME
		setTitle("Meu Frame");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		//Layout
		Painel_Exercício_2 SelecaoDePaises = new Painel_Exercício_2();
		add(SelecaoDePaises);
	}
		
	public static void main(String[] args) {
		new Exercício2();		
	}
}
