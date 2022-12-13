package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class TelaJogo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 255, 128));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(128, 0, 0), null));
		panel.setBounds(10, 11, 135, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setForeground(Color.GREEN);
		progressBar_1.setBackground(Color.LIGHT_GRAY);
		progressBar_1.setBounds(20, 30, 103, 14);
		panel.add(progressBar_1);
		progressBar_1.setValue(90);
		
		JLabel lblNewLabel_2 = new JLabel("SAMURAI");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 11, 76, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Lv 9");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel.setBounds(96, 6, 31, 25);
		panel.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.CYAN);
		progressBar.setBackground(Color.LIGHT_GRAY);
		progressBar.setBounds(30, 55, 93, 8);
		panel.add(progressBar);
		progressBar.setValue(30);
		
		JLabel lblNewLabel_1 = new JLabel("EXP");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 7));
		lblNewLabel_1.setBounds(10, 51, 20, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(165, 42, 42), null));
		panel_1.setBounds(289, 11, 135, 73);
		panel_1.setForeground(new Color(0, 255, 128));
		panel_1.setBackground(new Color(255, 250, 205));
		contentPane.add(panel_1);
		
		JProgressBar progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setForeground(Color.GREEN);
		progressBar_1_1.setBackground(Color.LIGHT_GRAY);
		progressBar_1_1.setValue(45);
		progressBar_1_1.setBounds(20, 30, 103, 14);
		panel_1.add(progressBar_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOBISOMEN");
		lblNewLabel_2_1.setForeground(Color.GRAY);
		lblNewLabel_2_1.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(10, 11, 113, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\pocaoIcon2.png"));
		btnNewButton.setBounds(20, 48, 18, 18);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\samuraiIcon3.png"));
		lblNewLabel_3.setBounds(10, 95, 108, 108);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\lobisomenIcon2.png"));
		lblNewLabel_3_1.setBounds(315, 95, 109, 108);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 214, 338, 36);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ATAQUE BÁSICO");
		rdbtnNewRadioButton.setForeground(Color.GRAY);
		rdbtnNewRadioButton.setFont(new Font("Snap ITC", Font.PLAIN, 9));
		rdbtnNewRadioButton.setBounds(6, 7, 123, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAtaqueEspecial = new JRadioButton("LÃMINA MORTAL");
		rdbtnAtaqueEspecial.setForeground(Color.GRAY);
		rdbtnAtaqueEspecial.setFont(new Font("Snap ITC", Font.PLAIN, 9));
		rdbtnAtaqueEspecial.setBounds(131, 7, 163, 23);
		panel_2.add(rdbtnAtaqueEspecial);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Atacar");
		btnNewButton_1.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\playIcon2.png"));
		btnNewButton_1.setBounds(305, 3, 30, 30);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(347, 214, 77, 36);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("MP 5");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(21, 11, 46, 14);
		panel_2_1.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(145, 95, 146, 108);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("ATAQUE BÁSICO");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Snap ITC", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(20, 61, 126, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DANO 10");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Snap ITC", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(48, 83, 88, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaDireitaIcon2.jpg"));
		lblNewLabel_6.setBounds(15, 11, 116, 39);
		panel_3.add(lblNewLabel_6);
	}
}


