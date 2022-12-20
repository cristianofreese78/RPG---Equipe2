//Tela de Introdução - O texto relacionado a história do jogo sobe dinamicamente na tela com o emprego de uma thread

package br.telas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaHistoria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistoria frame = new TelaHistoria();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaHistoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200, 200, 600, 600);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		contentPane.setBackground(Color.BLACK);
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		flowLayout.setVgap(20);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setBackground(Color.BLUE);
		JLabel jLabel1 = new JLabel("A centenas de anos atrás, um bondoso rei governava as ");
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(jLabel1);
		
		JLabel jLabel2 = new JLabel("terras distantes, onde quase não haviam habitantes.");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel2.setBackground(Color.WHITE);
		contentPane.add(jLabel2);
		
		JLabel jLabel3 = new JLabel("O rei era conhecido pela sua grande força, que usava");
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel3.setBackground(Color.WHITE);
		contentPane.add(jLabel3);
		
		JLabel jLabel4 = new JLabel("para o bem, protegendo o seu povo.");
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setForeground(Color.WHITE);
		jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel4.setBackground(Color.WHITE);
		contentPane.add(jLabel4);
		
		JLabel jLabel5 = new JLabel("Porém, centenas de anos se passam, e um novo culto");
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setForeground(Color.WHITE);
		jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel5.setBackground(Color.WHITE);
		contentPane.add(jLabel5);
		
		JLabel jLabel6 = new JLabel("ressurge nas terras distantes, um terrível culto com");
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setForeground(Color.WHITE);
		jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel6.setBackground(Color.WHITE);
		contentPane.add(jLabel6);
		
		JLabel jLabel7 = new JLabel("diversos feitiços e maldições para cada ocasião.");
		jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel7.setForeground(Color.WHITE);
		jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel7.setBackground(Color.WHITE);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel("A comando de um dos irmãos de Lúficer, eles desejam");
		jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel8.setForeground(Color.WHITE);
		jLabel8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel8.setBackground(Color.WHITE);
		contentPane.add(jLabel8);
		
		JLabel jLabel9 = new JLabel("realizar um ritual para trazer o próprio para a terra. ");
		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel9.setForeground(Color.WHITE);
		jLabel9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel9.setBackground(Color.WHITE);
		contentPane.add(jLabel9);
		
		JLabel jLabel10 = new JLabel("Mas então, um distinto grupo surgiu para acabar com");
		jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel10.setForeground(Color.WHITE);
		jLabel10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel10.setBackground(Color.WHITE);
		contentPane.add(jLabel10);
		
		JLabel jLabel11 = new JLabel("os planos do mal supremo!");
		jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel11.setForeground(Color.WHITE);
		jLabel11.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jLabel11.setBackground(Color.WHITE);
		contentPane.add(jLabel11);
		new Thread() {
			public void run() {
				int x = 20;
				int y = 600;
				while(true) {
					y --;
					if(y < -600) {
						dispose();
					}
					jLabel1.setLocation(x,y);
					jLabel2.setLocation(x,y+60);
					jLabel3.setLocation(x,y+120);
					jLabel4.setLocation(x,y+180);
					jLabel5.setLocation(x,y+240);
					jLabel6.setLocation(x,y+300);
					jLabel7.setLocation(x,y+360);
					jLabel8.setLocation(x,y+420);
					jLabel9.setLocation(x,y+480);
					jLabel10.setLocation(x,y+540);
					jLabel11.setLocation(x,y+600);
					try {
						sleep(50);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			
			}
			
		}.start();
	}

}
