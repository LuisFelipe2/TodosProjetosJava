package Exercício3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/*
 * A classe Painel_Exercício_3 implementa a interface ActionListener e o
 * método com a annotation @Override
 */
public class Painel_Exercicio_3 extends JPanel implements ActionListener {

	/*
	 * Declaração de variáveis
	 */
	JPanel painel = new JPanel();
	JLabel texto1 = new JLabel("Digite o total: ");
	JTextField campoTexto = new JTextField(5);
	JRadioButton dinheiro = new JRadioButton("dinheiro");
	JRadioButton cheque = new JRadioButton("cheque");
	JRadioButton cartão = new JRadioButton("cartão");
	ButtonGroup grupo = new ButtonGroup(); 
	JLabel texto2 = new JLabel("O total à pagar é: ");
	JLabel resultado = new JLabel("???");
	
	/*
	 * método construtor
	 */
	public Painel_Exercicio_3()  {
		
		/*
		 * Adiciona as varíaveis instanciadas do swing
		 */
		add(texto1);
		campoTexto.setSize(100, 200);
		add(campoTexto);
			
		grupo.add(cheque);
		grupo.add(cartão);
		grupo.add(dinheiro);
			
		add(cheque);
		add(cartão);
		add(dinheiro);
			
		add(texto2);
		add(resultado);
		
		/*
		 * Adiciona eventos para as seguintes varíaveis
		 */
		cheque.addActionListener(this);
		cartão.addActionListener(this);
		dinheiro.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			/*
			 * Se o programa conseguir converter o texto do campoTexto em double o programa segue,
			 * caso contrario o usuário não digitou um número
			 */
			double numero = Double.parseDouble(campoTexto.getText());
			
			if(cheque.isSelected()) 
				resultado.setText(numero*1.05+"");
				
			else if (cartão.isSelected()) 
				resultado.setText(numero*1.10+"");
				
			else if(dinheiro.isSelected()) 
				resultado.setText(numero*0.95+"");
				
			else 
				resultado.setText("Nenhuma opção de pagamento foi escolhida");
			
			
		}catch(Exception e1) {
			resultado.setText("Erro ao entender o número informado");
		}
	}
	

}
