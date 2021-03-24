package Exercícios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class guia extends JFrame implements ActionListener{

	JButton jb = new JButton("botão 1");
	JButton jb2 = new JButton("botão 2");
	JLabel jl = new JLabel("mensagem");
	JTextField jt = new JTextField(20);
	JCheckBox jc = new JCheckBox("Check",true);
	JRadioButton rb_mas = new JRadioButton("Masculino");
	JRadioButton rb_fem = new JRadioButton("Feminino");
	ButtonGroup grupo = new ButtonGroup();
	JComboBox<String> cb = new JComboBox();
	ImageIcon br = new ImageIcon(getClass().getResource("img_brasil.jpg"));
	JLabel imagem = new JLabel(br);
	JMenuBar mb = new JMenuBar();
	JMenu op1 = new JMenu("opções1");
	JMenu op2 = new JMenu("sair");
	JMenuItem sair = new JMenuItem("cair fora");
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(imagem);
	Font f = new Font("Courier New", Font.CENTER_BASELINE, 24);
	Color c = new Color(255, 45, 60);
	public guia(){
		
		
		
	
		//FRAME
		setTitle("Meu Frame");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				int codigo = e.getKeyCode();
				if(codigo == KeyEvent.VK_ENTER)
					System.out.println("Foi Pressionado o enter");
				
				char c = e.getKeyChar();
				
				System.out.println(c);
				
			}
		});
		
		//Botão
		setLayout(null);
		add(jb);
		jb.setBounds(100, 200, 150, 50);
		jb.addActionListener(this);
		
		//Layout
		
	//	setLayout(new BorderLayout());
	//	add(BorderLayout.NORTH, jb2);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(jb2);
		
	//	setLayout(new GridLayout(2,2));
	//	add(jb2);
		
		//Font
		jb.setFont(f);
		
		//Cores
		jb.setForeground(Color.gray);
		jb.setBackground(c);
	
		//JLabel
		add(jl);
		jl.setFont(f);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		//TEXTO
		add(jt);
//		jt.setText("digite seu texto");
		System.out.println(jt.getText());
		
		
		//CHECK BOX
		add(jc);
		System.out.println(jc.isSelected());
		
		//RADIO BUTTON
		add(rb_mas);
		add(rb_fem);
		
		grupo.add(rb_mas);
		grupo.add(rb_fem);
		
		//COMBO BOX
		add(cb);
		cb.addItem("Brasil");
		cb.addItem("Uruguai");
		cb.addItem("Argentina");
		cb.setSelectedIndex(1);
		System.out.println(String.valueOf(cb.getSelectedItem()));
		
		//JLabel
	//	add(imagem);
		add(sp);
		//MENU
		setJMenuBar(mb);
		mb.add(op1);
		mb.add(op2);
		op2.add(sair);
		
		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
			
		});
		
		//textarea
	//	add(sp);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new guia();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb)
			JOptionPane.showMessageDialog(null, "message");
		
		//System.exit(0);
	}

}
