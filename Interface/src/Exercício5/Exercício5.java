package Exercício5;

import javax.swing.JFrame;

public class Exercício5 extends JFrame{
	
	public Exercício5(){
		setTitle("Meu Frame");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Painel_Menu_Exercício_5 p = new Painel_Menu_Exercício_5();
		add(p);
		
	}
	
	public static void main(String[] args) {
		new Exercício5();
	}
	

}
