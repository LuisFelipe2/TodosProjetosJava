package Exercício2;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Exercício_2 extends JPanel{

	/*
	 * Declaração de variáveis
	 */
	String[] paises = {"Brasil", "Peru", "Bolívia", "Equador"};
	JComboBox jcb = new JComboBox(paises);
	
	ImageIcon img_br = new ImageIcon(getClass().getResource("img_brasil.jpg"));
	ImageIcon img_bl = new ImageIcon(getClass().getResource("img_bolivia.png"));
	ImageIcon img_pe = new ImageIcon(getClass().getResource("img_peru.jpg"));
//	ImageIcon img_eq = new ImageIcon(getClass().getResource("img_equador.jpg"));
	
	JLabel imagem = new JLabel();

	/*
	 * Método construtor
	 */
	public Painel_Exercício_2() {
		/*
		 * Função copiada do Stackoverflow
		 */
		jcb.addItemListener(new ItemListener() {
			
	        public void itemStateChanged(ItemEvent e) {
	        	
	        	switch(jcb.getSelectedIndex()) {
					case 0:
						imagem.setIcon(img_br);
						break;
					case 1:
						imagem.setIcon(img_bl);
						break;
					case 2:
						imagem.setIcon(img_pe);
						break;
					case 3:
					//	imagem.setIcon(img_eq);
				}
	        	
	        }
	    });
		
		
		/*
		 * adiciona as variáveis ao JPanel
		 */
		add(jcb);
		add(imagem);
	}

}
