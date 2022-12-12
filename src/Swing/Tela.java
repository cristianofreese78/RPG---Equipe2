package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ProgressMonitor;
import java.awt.Component;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 135, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(20, 30, 103, 14);
		panel.add(progressBar_1);
		progressBar_1.setValue(90);
		
		JLabel lblNewLabel_2 = new JLabel("SAMURAI");
		lblNewLabel_2.setBounds(10, 11, 76, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Lv 9");
		lblNewLabel.setBounds(96, 11, 27, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EXP");
		lblNewLabel_1.setBounds(10, 55, 13, 10);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(30, 57, 93, 8);
		panel.add(progressBar);
		progressBar.setValue(30);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(289, 11, 135, 73);
		contentPane.add(panel_1);
		
		JProgressBar progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setValue(45);
		progressBar_1_1.setBounds(20, 30, 103, 14);
		panel_1.add(progressBar_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOBISOMEN");
		lblNewLabel_2_1.setBounds(10, 11, 84, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\samuraiIcone2.jpg"));
		lblNewLabel_3.setBounds(10, 95, 108, 108);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\lobisomenIcone2.png"));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(316, 95, 108, 108);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 214, 338, 36);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ataque Básico");
		rdbtnNewRadioButton.setBounds(6, 7, 114, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAtaqueEspecial = new JRadioButton("Lâmina Mortal");
		rdbtnAtaqueEspecial.setBounds(122, 7, 172, 23);
		panel_2.add(rdbtnAtaqueEspecial);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\playIcon3.png"));
		lblNewLabel_5.setBounds(300, 3, 28, 30);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(347, 214, 77, 36);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("MP 5");
		lblNewLabel_4.setBounds(31, 11, 46, 14);
		panel_2_1.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(165, 95, 108, 108);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaDireitaIcon.png"));
		lblNewLabel_6.setBounds(28, 11, 58, 39);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ataque Básico");
		lblNewLabel_7.setBounds(10, 61, 88, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Dano 10");
		lblNewLabel_8.setBounds(28, 86, 88, 14);
		panel_3.add(lblNewLabel_8);
	}
}
