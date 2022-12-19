package br.telas;

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

import Classes.Jogador;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaEscolhaPersonagem extends JFrame {
	
	
	private JPanel PaneSelecaoPers;
	public Jogador jogAux = new Jogador();
	
	public static int ObtemIndice(String nomePers, ArrayList<Jogador> lstJg) {
		int indice = 0;
		for (int i=0; i <=3; i++) {
			if (nomePers.equals(lstJg.get(i).getNome())) return i;
		}
		return 0; 
	}
	
	public static String GetEfeitoJog(Jogador jg) {
		if (jg.getAtordoamento() == 1) return "Atordoamento";
	    if (jg.getSangramento() == 1) return "Sangramento";
	    if (jg.getSedento() == 1) return "Sedento";
	    if (jg.getCritico() == 1) return "Critico";
		return "Efeito";
	}
	
	public static void atualizaCard(Jogador jg, JLabel[] lbl) {
		lbl[0].setText(jg.getNome());						//lblNomePers
		lbl[1].setText(Integer.toString(jg.getPtsVida()));	//lblVidaPers
		lbl[2].setText(Integer.toString(jg.getMpJogador()));		//lblMPPers
		lbl[3].setText(Integer.toString(jg.getDnAtaqueBasico()));	//lblDanoBasicoPers
		lbl[4].setText(Integer.toString(jg.getDnAtaqueEspecial()));	//lblDanoEspecialPers
		lbl[5].setText(jg.getTpAtaqueEspecial());			//lblNomeAtaqueEspPers
		lbl[6].setText(GetEfeitoJog(jg));					//lblEfeitoAtaquePers
	}

	public Jogador getJogAux() {
		return jogAux;
	}

	public void setJogAux(Jogador jogAux) {
		this.jogAux = jogAux;
	}
	
	public TelaEscolhaPersonagem(ArrayList<Jogador> lstJog) {
						
		setFont(new Font("Snap ITC", Font.PLAIN, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PaneSelecaoPers = new JPanel();
		PaneSelecaoPers.setBackground(new Color(204, 255, 204));
		PaneSelecaoPers.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PaneSelecaoPers);
		PaneSelecaoPers.setLayout(null);
		
		JPanel panelCard = new JPanel();
		panelCard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
				
			}
		});
		panelCard.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelCard.setBounds(249, 59, 160, 186);
		PaneSelecaoPers.add(panelCard);
		panelCard.setLayout(null);
		
		JLabel lblSelecaoPers = new JLabel("SELEÇÃO DE PERSONAGEM");
		lblSelecaoPers.setForeground(Color.GRAY);
		lblSelecaoPers.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblSelecaoPers.setBounds(20, 14, 319, 14);
		PaneSelecaoPers.add(lblSelecaoPers);
		
		JLabel lblPersonagem = new JLabel("PERSONAGEM");
		lblPersonagem.setBounds(10, 6, 140, 15);
		panelCard.add(lblPersonagem);
		lblPersonagem.setForeground(Color.GRAY);
		lblPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		
		JLabel lblVida = new JLabel("VIDA");
		lblVida.setBounds(10, 39, 54, 14);
		panelCard.add(lblVida);
		lblVida.setForeground(Color.GRAY);
		lblVida.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		
		JLabel lblNomePers = new JLabel("SAMURAI");
		lblNomePers.setForeground(Color.ORANGE);
		lblNomePers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNomePers.setBounds(10, 19, 140, 14);
		panelCard.add(lblNomePers);
		
		JLabel lblVidaPers = new JLabel("110");
		lblVidaPers.setForeground(Color.ORANGE);
		lblVidaPers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblVidaPers.setBounds(10, 52, 54, 14);
		panelCard.add(lblVidaPers);
		
		JLabel lblAtaqueBasico = new JLabel("ATAQUE BÁSICO");
		lblAtaqueBasico.setForeground(Color.GRAY);
		lblAtaqueBasico.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblAtaqueBasico.setBounds(10, 72, 150, 14);
		panelCard.add(lblAtaqueBasico);
		
		JLabel lblDanoBasicoPers = new JLabel("9");
		lblDanoBasicoPers.setForeground(Color.ORANGE);
		lblDanoBasicoPers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblDanoBasicoPers.setBounds(10, 85, 140, 14);
		panelCard.add(lblDanoBasicoPers);
		
		JLabel lblAtaqueEspecial = new JLabel("ATAQUE ESPECIAL");
		lblAtaqueEspecial.setForeground(Color.GRAY);
		lblAtaqueEspecial.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblAtaqueEspecial.setBounds(10, 105, 150, 14);
		panelCard.add(lblAtaqueEspecial);
		
		JLabel lblNomeAtaqueEspPers = new JLabel("LÂMINA MORTAL");
		lblNomeAtaqueEspPers.setForeground(Color.ORANGE);
		lblNomeAtaqueEspPers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNomeAtaqueEspPers.setBounds(10, 118, 140, 14);
		panelCard.add(lblNomeAtaqueEspPers);
		
		JLabel lblMP = new JLabel("MP");
		lblMP.setForeground(Color.GRAY);
		lblMP.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblMP.setBounds(105, 39, 37, 14);
		panelCard.add(lblMP);
		
		JLabel lblMPPers = new JLabel("20");
		lblMPPers.setForeground(Color.ORANGE);
		lblMPPers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblMPPers.setBounds(105, 52, 37, 14);
		panelCard.add(lblMPPers);
		
		JLabel lblDanoEspecialPers = new JLabel("18");
		lblDanoEspecialPers.setForeground(Color.ORANGE);
		lblDanoEspecialPers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblDanoEspecialPers.setBounds(10, 131, 140, 14);
		panelCard.add(lblDanoEspecialPers);
		
		JLabel lblEfeito = new JLabel("EFEITO");
		lblEfeito.setForeground(Color.GRAY);
		lblEfeito.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblEfeito.setBounds(10, 151, 140, 15);
		panelCard.add(lblEfeito);
		
		JLabel lblEfeitoAtaquePers = new JLabel("SANGRAMENTO");
		lblEfeitoAtaquePers.setForeground(Color.ORANGE);
		lblEfeitoAtaquePers.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblEfeitoAtaquePers.setBounds(10, 164, 140, 14);
		panelCard.add(lblEfeitoAtaquePers);
		
		JPanel panelSamurai = new JPanel();
		panelSamurai.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panelSamurai.setBounds(21, 53, 101, 101);
		PaneSelecaoPers.add(panelSamurai);
		panelSamurai.setLayout(null);
		
		JLabel lblSamurai = new JLabel("Samurai");
		lblSamurai.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel[] labels = {lblNomePers,lblVidaPers,lblMPPers,lblDanoBasicoPers, lblDanoEspecialPers, 
						          lblNomeAtaqueEspPers, lblEfeitoAtaquePers};
				
				setJogAux(lstJog.get(ObtemIndice(lblSamurai.getText(), lstJog)));
				atualizaCard(getJogAux(), labels);
			}
		});
		lblSamurai.setToolTipText("SAMURAI");
		lblSamurai.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaSamurai.png"));
		lblSamurai.setBounds(3, 3, 95, 95);
		panelSamurai.add(lblSamurai);
		
		JPanel panelCavaleiro = new JPanel();
		panelCavaleiro.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panelCavaleiro.setBounds(21, 154, 101, 101);
		PaneSelecaoPers.add(panelCavaleiro);
		panelCavaleiro.setLayout(null);
		
		JLabel lblCavaleiro = new JLabel("Cavaleiro");
		lblCavaleiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel[] labels = {lblNomePers,lblVidaPers,lblMPPers,lblDanoBasicoPers, lblDanoEspecialPers, 
				          lblNomeAtaqueEspPers, lblEfeitoAtaquePers};
		
				setJogAux(lstJog.get(ObtemIndice(lblCavaleiro.getText(), lstJog)));
				atualizaCard(getJogAux(), labels);
			}
		});
		lblCavaleiro.setToolTipText("CAVALEIRO");
		lblCavaleiro.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaCavaleiro.png"));
		lblCavaleiro.setBounds(3, 3, 95, 95);
		panelCavaleiro.add(lblCavaleiro);
		
		JPanel panelMonge = new JPanel();
		panelMonge.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panelMonge.setBounds(121, 53, 101, 101);
		PaneSelecaoPers.add(panelMonge);
		panelMonge.setLayout(null);
		
		JLabel lblMonge = new JLabel("Monge");
		lblMonge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel[] labels = {lblNomePers,lblVidaPers,lblMPPers,lblDanoBasicoPers, lblDanoEspecialPers, 
				          lblNomeAtaqueEspPers, lblEfeitoAtaquePers};
		
				setJogAux(lstJog.get(ObtemIndice(lblMonge.getText(), lstJog)));
				atualizaCard(getJogAux(), labels);
			}
		});
		lblMonge.setToolTipText("MONGE");
		lblMonge.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaMonge.png"));
		lblMonge.setBounds(3, 3, 95, 95);
		panelMonge.add(lblMonge);
		
		JPanel panelCacador = new JPanel();
		panelCacador.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panelCacador.setBounds(121, 154, 101, 101);
		PaneSelecaoPers.add(panelCacador);
		panelCacador.setLayout(null);
		
		JLabel lblCacador = new JLabel("Caçador");
		lblCacador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel[] labels = {lblNomePers,lblVidaPers,lblMPPers,lblDanoBasicoPers, lblDanoEspecialPers, 
				          lblNomeAtaqueEspPers, lblEfeitoAtaquePers};
		
				setJogAux(lstJog.get(ObtemIndice(lblCacador.getText(), lstJog)));
				atualizaCard(getJogAux(), labels);
			}
		});
		lblCacador.setToolTipText("CAÇADOR");
		lblCacador.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaCacador.png"));
		lblCacador.setBounds(3, 3, 95, 95);
		panelCacador.add(lblCacador);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				JLabel[] labels = {lblNomePers,lblVidaPers,lblMPPers,lblDanoBasicoPers, lblDanoEspecialPers, 
				          lblNomeAtaqueEspPers, lblEfeitoAtaquePers};
		
				setJogAux(lstJog.get(ObtemIndice(lblCacador.getText(), lstJog)));
				atualizaCard(getJogAux(), labels);
			}
		});
		
	}
}


