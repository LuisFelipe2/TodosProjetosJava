package monitoria;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	ImageIcon img = new ImageIcon(getClass().getResource("flor.jpeg"));
	ImageIcon img2 = new ImageIcon(getClass().getResource("flori.jpg"));
	//public JLabel imglb;

	public View() {
		setTitle("Bandeiras");
		Start();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] cbItem = { "Selecione", "Alemanha", "Brasil", "China", "Espanha", "Portugal" };
		comboBox = new JComboBox(cbItem);
		comboBox.setBounds(135, 32, 165, 22);
		contentPane.add(comboBox);
		JLabel imglb = new JLabel(img);
		imglb.setIcon(img2);
		imglb.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(imglb);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				switch (comboBox.getSelectedIndex()) {
				case 1:
					
					
					imglb.setBounds(92, 91, 244, 129);
					break;
				
				 case 2:
					 break;
					 /*
				 * 
				 *  case 3:
				 * 
				 * break; case 4:
				 * 
				 * break; case 5:
				 * 
				 * break;
				 */
				}
			//	imglb.setIcon(img);
			}
		});
		
		
	}

}