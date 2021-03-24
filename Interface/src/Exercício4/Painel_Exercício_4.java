package Exercício4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * A classe Painel_Exercício_4 implementa a interface ActionListener e o
 * método com a annotation @Override
 */
public class Painel_Exercício_4 extends JPanel implements ActionListener{

	/*
	 * Declaração e inicialização de variáveis
	 */
	
	JLabel nome_label = new JLabel("Digite seu nome: ");
	JTextField nome = new JTextField("Digite seu nome");
	
	JLabel enderco_label = new JLabel("Digite seu endereço: ");
	JTextField endereco = new JTextField("Digite seu endereço: ");
	
	JLabel sexo_label = new JLabel("Selecione seu sexo: ");
	String [] sexo_opcoes = {"masculino", "feminino"};
	JComboBox sexo = new JComboBox(sexo_opcoes);
	
	JLabel estado_label = new JLabel("Selecione seu estado civil: ");
	String [] estadoCivil_opcoes = {"Solteiro", "Casado"};
	JComboBox estadoCivil = new JComboBox(estadoCivil_opcoes);

	JButton salvar = new JButton("Salvar");
	JButton limpar = new JButton("Limpar");
	
	JLabel campo = new JLabel();
	
	
	public Painel_Exercício_4() {
		
		/*
		 * Adicionando os eventos nos botões salvar e limpar
		 */
		salvar.addActionListener(this);
		limpar.addActionListener(this);
		
		/*
		 * iniciando painel 1 e adicionando as variáveis instanciadas
		 */
		JPanel formulario = new JPanel();
		formulario.setLayout(new GridLayout(5,2));
		formulario.add(nome_label);
		formulario.add(nome);
		formulario.add(enderco_label);
		formulario.add(endereco);
		formulario.add(sexo_label);
		formulario.add(sexo);
		formulario.add(estado_label);
		formulario.add(estadoCivil);
		formulario.add(salvar);
		formulario.add(limpar);
		
		/*
		 * iniciando painel 2 e adicionando as variáveis instanciadas
		 */
		JPanel resposta = new JPanel();
		resposta.setLayout(new FlowLayout(FlowLayout.LEFT));
		resposta.add(campo);
		
		/*
		 * adicionado os 2 painels acima no Jpanel Painel_Exercício_4
		 */
		setLayout(new BorderLayout());
		add(formulario, BorderLayout.NORTH);
		add(resposta, BorderLayout.CENTER);		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * Quando o usuário clicar no botão salvar
		 * o if é executado, quando clicar no outro
		 * o else é executado
		 * 
		 */
		if(e.getSource() == salvar) {
			
			/*
			 * Setando na varíavel campo a string concatenada com comandos
			 * html + informações das variáveis por get()
			 */
			
			campo.setText(
					"<html>"+
					nome.getText() + "<br>"+
					endereco.getText()+ "<br>"+
					sexo.getSelectedItem()+ "<br>"+
					estadoCivil.getSelectedItem() +
					"</html>"
					);

		}else {
			campo.setText("");
			nome.setText("");
			endereco.setText("");
		}
	}
}


