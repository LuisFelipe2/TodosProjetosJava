package Exercício5;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/*
 * Para importar coloque o nome do pacote e depois o nome da classe
 */
import Exercício1.Painel_Exercício_1;
import Exercício2.Painel_Exercício_2;
import Exercício3.Painel_Exercicio_3;
import Exercício4.Painel_Exercício_4;

public class Painel_Menu_Exercício_5 extends JPanel implements ActionListener{

	
	/*
	 * Variáveis
	 */
	CardLayout card = new CardLayout();
	JPanel jp1 = new Painel_Exercício_1();
	JPanel jp2 = new Painel_Exercício_2();
	JPanel jp3 = new Painel_Exercicio_3();
	JPanel jp4 = new Painel_Exercício_4();
	JPanel painelPrincipal = new JPanel(card);
	
	
	JMenuBar barra = new JMenuBar();
	JMenu menu = new JMenu("Exercícios");
	
	JMenuItem item1 = new JMenuItem("exercício 1");
	JMenuItem item2 = new JMenuItem("exercício 2");
	JMenuItem item3 = new JMenuItem("exercício 3");
	JMenuItem item4 = new JMenuItem("exercício 4");
	
	/*
	 * Método construtor
	 */
	public Painel_Menu_Exercício_5() {
		
		/*
		 * Criando a barra de menu
		 */
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		
		barra.add(menu);

		setLayout(new BorderLayout());
		add(barra, BorderLayout.NORTH);
		
		/*
		 * Adicionando os Painels
		 */
		
		add(painelPrincipal);
				
		painelPrincipal.add(jp1, "exercicio1");
		painelPrincipal.add(jp2, "exercicio2");
		painelPrincipal.add(jp3, "exercicio3");
		painelPrincipal.add(jp4, "exercicio4");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==item1)
			card.show(painelPrincipal, "exercicio1");
			
		if(e.getSource()==item2) 
			card.show(painelPrincipal, "exercicio2");
			
		if(e.getSource()==item3) 
			card.show(painelPrincipal, "exercicio3");
			
		if(e.getSource()==item4)
			card.show(painelPrincipal, "exercicio4");
			
	}

}
