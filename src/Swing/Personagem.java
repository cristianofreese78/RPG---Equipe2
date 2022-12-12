package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class Personagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personagem frame = new Personagem();
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
	public Personagem() {
		setFont(new Font("Snap ITC", Font.PLAIN, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELEÇÃO DE PERSONAGEM");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, 14, 319, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panel.setBounds(21, 53, 90, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("SAMURAI");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaSamurai.png"));
		lblNewLabel_2.setBounds(5, 5, 80, 80);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panel_1.setBounds(21, 154, 90, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setToolTipText("CAVALEIRO");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaCavaleiro.png"));
		lblNewLabel_2_2.setBounds(5, 5, 80, 80);
		panel_1.add(lblNewLabel_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panel_2.setBounds(121, 53, 90, 90);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("MONGE");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaMonge.png"));
		lblNewLabel_2_1.setBounds(5, 5, 80, 80);
		panel_2.add(lblNewLabel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panel_1_1.setBounds(121, 154, 90, 90);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setToolTipText("CAÇADOR");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaCacador.png"));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(5, 5, 78, 78);
		panel_1_1.add(lblNewLabel_2_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(249, 55, 160, 186);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PERSONAGEM");
		lblNewLabel_1.setBounds(10, 6, 140, 15);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_1 = new JLabel("VIDA");
		lblNewLabel_1_1.setBounds(10, 39, 54, 14);
		panel_3.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		
		JLabel lblNewLabel_3 = new JLabel("SAMURAI");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 19, 140, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("110");
		lblNewLabel_3_1.setForeground(Color.ORANGE);
		lblNewLabel_3_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(10, 52, 54, 14);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ATAQUE BÁSICO");
		lblNewLabel_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_2.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 72, 150, 14);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("9");
		lblNewLabel_3_2.setForeground(Color.ORANGE);
		lblNewLabel_3_2.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(10, 85, 140, 14);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ATAQUE ESPECIAL");
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 105, 150, 14);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("LÂMINA MORTAL");
		lblNewLabel_3_1_1.setForeground(Color.ORANGE);
		lblNewLabel_3_1_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(10, 118, 140, 14);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("MP");
		lblNewLabel_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_1_2.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(105, 39, 37, 14);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("20");
		lblNewLabel_3_1_2.setForeground(Color.ORANGE);
		lblNewLabel_3_1_2.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_1_2.setBounds(105, 52, 37, 14);
		panel_3.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("18");
		lblNewLabel_3_1_1_1.setForeground(Color.ORANGE);
		lblNewLabel_3_1_1_1.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(10, 131, 140, 14);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("EFEITO");
		lblNewLabel_1_3.setForeground(Color.GRAY);
		lblNewLabel_1_3.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 151, 140, 15);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("SANGRAMENTO");
		lblNewLabel_3_3.setForeground(Color.ORANGE);
		lblNewLabel_3_3.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(10, 164, 140, 14);
		panel_3.add(lblNewLabel_3_3);
	}
}
