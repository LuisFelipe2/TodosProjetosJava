package Exercício1;

import javax.swing.JFrame;

public class Exercício1 extends JFrame{

	//crio o método construtor da classe
	public Exercício1(){
		
		//INICIALIZA O FRAME
		setTitle("Meu Frame");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		//EXECUTA O PAINEL_1	
		Painel_Exercício_1 tabuleiro = new Painel_Exercício_1();
		add(tabuleiro);
		
	}
		
	public static void main(String[] args) {
		//chamo o método construtor da classe instanciando a classe
		new Exercício1();		
	}
}
