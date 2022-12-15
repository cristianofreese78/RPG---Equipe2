package br.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Classes.Batalhas;
import Classes.BatalhasChefao;
import Classes.Jogador;
import Classes.ListasElementos;
import Classes.Inimigo;

public class TelaJogo extends JFrame {

	private JPanel PaneTelaJogo;

	public TelaJogo(Jogador jog, ListasElementos lstElem,  Batalhas btlInim, BatalhasChefao btlChef) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PaneTelaJogo = new JPanel();
		PaneTelaJogo.setBackground(new Color(204, 255, 204));
		PaneTelaJogo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PaneTelaJogo);
		PaneTelaJogo.setLayout(null);
		
		JPanel panelJogador = new JPanel();
		panelJogador.setForeground(new Color(0, 255, 128));
		panelJogador.setBackground(new Color(255, 250, 205));
		panelJogador.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(128, 0, 0), null));
		panelJogador.setBounds(10, 11, 135, 73);
		PaneTelaJogo.add(panelJogador);
		panelJogador.setLayout(null);
		
		JProgressBar progressBarVidaPersonagem = new JProgressBar();
		progressBarVidaPersonagem.setForeground(Color.GREEN);
		progressBarVidaPersonagem.setBackground(Color.LIGHT_GRAY);
		progressBarVidaPersonagem.setBounds(20, 30, 103, 14);
		panelJogador.add(progressBarVidaPersonagem);
		progressBarVidaPersonagem.setValue(90);
		
		JLabel lblPersonagem = new JLabel("SAMURAI");
		lblPersonagem.setForeground(Color.GRAY);
		lblPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblPersonagem.setBounds(10, 11, 76, 14);
		panelJogador.add(lblPersonagem);
		
		JLabel lblNivelPersonagem = new JLabel("Lv 9");
		lblNivelPersonagem.setForeground(Color.GRAY);
		lblNivelPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNivelPersonagem.setBounds(96, 6, 31, 25);
		panelJogador.add(lblNivelPersonagem);
		
		JProgressBar progressExpPersonagem = new JProgressBar();
		progressExpPersonagem.setForeground(Color.CYAN);
		progressExpPersonagem.setBackground(Color.LIGHT_GRAY);
		progressExpPersonagem.setBounds(30, 55, 93, 8);
		panelJogador.add(progressExpPersonagem);
		progressExpPersonagem.setValue(30);
		
		JLabel lblExpPersonagem = new JLabel("EXP");
		lblExpPersonagem.setForeground(Color.ORANGE);
		lblExpPersonagem.setBackground(Color.WHITE);
		lblExpPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 7));
		lblExpPersonagem.setBounds(10, 51, 20, 14);
		panelJogador.add(lblExpPersonagem);
		
		JPanel panelAdversario = new JPanel();
		panelAdversario.setLayout(null);
		panelAdversario.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(165, 42, 42), null));
		panelAdversario.setBounds(289, 11, 135, 73);
		panelAdversario.setForeground(new Color(0, 255, 128));
		panelAdversario.setBackground(new Color(255, 250, 205));
		PaneTelaJogo.add(panelAdversario);
		
		JProgressBar progressVidaAdversario = new JProgressBar();
		progressVidaAdversario.setForeground(Color.GREEN);
		progressVidaAdversario.setBackground(Color.LIGHT_GRAY);
		progressVidaAdversario.setValue(45);
		progressVidaAdversario.setBounds(20, 30, 103, 14);
		panelAdversario.add(progressVidaAdversario);
		
		JLabel lblAdversario = new JLabel("LOBISOMEN");
		lblAdversario.setForeground(Color.GRAY);
		lblAdversario.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblAdversario.setBounds(10, 11, 113, 14);
		panelAdversario.add(lblAdversario);
		
		JButton btnPocao1Adversario = new JButton("");
		btnPocao1Adversario.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\pocaoIcon2.png"));
		btnPocao1Adversario.setBounds(20, 48, 18, 18);
		panelAdversario.add(btnPocao1Adversario);
		
		JButton btnPocao2Adversario = new JButton("");
		btnPocao2Adversario.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\pocaoIcon2.png"));
		btnPocao2Adversario.setBounds(40, 48, 18, 18);
		panelAdversario.add(btnPocao2Adversario);
		
		JLabel lblImgPersonagem = new JLabel("");
		lblImgPersonagem.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\samuraiIcon3.png"));
		lblImgPersonagem.setBounds(10, 95, 108, 108);
		PaneTelaJogo.add(lblImgPersonagem);
		
		JLabel lblImgAdversario = new JLabel("");
		lblImgAdversario.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\lobisomenIcon2.png"));
		lblImgAdversario.setBounds(315, 95, 109, 108);
		PaneTelaJogo.add(lblImgAdversario);
		
		JPanel panelAtaques = new JPanel();
		panelAtaques.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelAtaques.setBounds(10, 214, 338, 36);
		PaneTelaJogo.add(panelAtaques);
		panelAtaques.setLayout(null);
		
		JRadioButton rdbtnAtaqueBasico = new JRadioButton("ATAQUE BÁSICO");
		rdbtnAtaqueBasico.setForeground(Color.GRAY);
		rdbtnAtaqueBasico.setFont(new Font("Snap ITC", Font.PLAIN, 9));
		rdbtnAtaqueBasico.setBounds(6, 7, 123, 23);
		panelAtaques.add(rdbtnAtaqueBasico);
		
		JRadioButton rdbtnAtaqueEspecial = new JRadioButton("LÃMINA MORTAL");
		rdbtnAtaqueEspecial.setForeground(Color.GRAY);
		rdbtnAtaqueEspecial.setFont(new Font("Snap ITC", Font.PLAIN, 9));
		rdbtnAtaqueEspecial.setBounds(131, 7, 163, 23);
		panelAtaques.add(rdbtnAtaqueEspecial);
		
		JButton btnAtacar = new JButton("");
		btnAtacar.setToolTipText("Atacar");
		btnAtacar.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\playIcon2.png"));
		btnAtacar.setBounds(305, 3, 30, 30);
		panelAtaques.add(btnAtacar);
		
		JPanel panelMPPersonagem = new JPanel();
		panelMPPersonagem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelMPPersonagem.setBounds(347, 214, 77, 36);
		PaneTelaJogo.add(panelMPPersonagem);
		panelMPPersonagem.setLayout(null);
		
		JLabel lblMPPersonagem = new JLabel("MP 5");
		lblMPPersonagem.setForeground(Color.GRAY);
		lblMPPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblMPPersonagem.setBounds(21, 11, 46, 14);
		panelMPPersonagem.add(lblMPPersonagem);
		
		JPanel panelBatalhaStatusAtaques = new JPanel();
		panelBatalhaStatusAtaques.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelBatalhaStatusAtaques.setBounds(145, 95, 146, 108);
		PaneTelaJogo.add(panelBatalhaStatusAtaques);
		panelBatalhaStatusAtaques.setLayout(null);
		
		JLabel lblBatalhaTipoAtaque = new JLabel("ATAQUE BÁSICO");
		lblBatalhaTipoAtaque.setForeground(Color.RED);
		lblBatalhaTipoAtaque.setFont(new Font("Snap ITC", Font.PLAIN, 10));
		lblBatalhaTipoAtaque.setBounds(20, 61, 126, 14);
		panelBatalhaStatusAtaques.add(lblBatalhaTipoAtaque);
		
		JLabel lblBatalhaDanoAtaque = new JLabel("DANO 10");
		lblBatalhaDanoAtaque.setForeground(Color.RED);
		lblBatalhaDanoAtaque.setBackground(Color.WHITE);
		lblBatalhaDanoAtaque.setFont(new Font("Snap ITC", Font.PLAIN, 10));
		lblBatalhaDanoAtaque.setBounds(48, 83, 88, 14);
		panelBatalhaStatusAtaques.add(lblBatalhaDanoAtaque);
		
		JLabel lblBatalhaSentidoAtaque = new JLabel("");
		lblBatalhaSentidoAtaque.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaDireitaIcon2.jpg"));
		lblBatalhaSentidoAtaque.setBounds(15, 11, 116, 39);
		panelBatalhaStatusAtaques.add(lblBatalhaSentidoAtaque);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		/*
		System.out.println(jog.toString());
		System.out.println(lstElem.getListaJogador());
		System.out.println(lstElem.getListaInimigo1());
		System.out.println(lstElem.getListaInimigo2());
		System.out.println(lstElem.getListaInimigo3());
		System.out.println(lstElem.getListaChefao());
		System.out.println(btlInim.toString());
		System.out.println(btlChef.toString());
		*/
		
		//Carrega dados do jogador. jog
		progressBarVidaPersonagem.setValue(jog.getPtsVida());
		lblPersonagem.setText(jog.getNome());
		lblNivelPersonagem.setText(Integer.toString(jog.getNvlJogador()));
		progressExpPersonagem.setValue(jog.getPtsExperiencia());
		lblMPPersonagem.setText(Integer.toString(jog.getMpJogador()));
		lblImgPersonagem.setIcon(new ImageIcon(jog.getImagem()));
		lblImgPersonagem.setToolTipText(jog.getNome().toUpperCase());
		
		while(lstElem.getListaInimigo1().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray = gerador.nextInt(lstElem.getListaInimigo1().size());
			Inimigo inimigoAtual = lstElem.getListaInimigo1().get(escolhaArray); 
			//Carrega dados do inimigo
			System.out.println(inimigoAtual.toString());
			
			
			btlInim.batalha(jog,inimigoAtual);
			lstElem.getListaInimigo1().remove(escolhaArray);
			//Atualiza dados jogador
			System.out.println("VIDA DO JOGADOR: "+jog.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jog.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jog.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jog.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jog.getPocao());
			System.out.println("====================");
		}
		if(jog.getPtsVida() > 0) {
			//Carrega dados chefao 0
			btlChef.batalha(jog,lstElem.getListaChefao().get(0));
			}
		while(lstElem.getListaInimigo2().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray2 = gerador.nextInt(lstElem.getListaInimigo2().size());
			Inimigo inimigo = lstElem.getListaInimigo2().get(escolhaArray2); System.out.println(inimigo.toString());
			btlInim.batalha(jog,inimigo);
			lstElem.getListaInimigo2().remove(escolhaArray2);
			System.out.println("VIDA DO JOGADOR: "+jog.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jog.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jog.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jog.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jog.getPocao());
			System.out.println("====================");
			
			
		}
		if(jog.getPtsVida() > 0) {
			btlChef.batalha(jog,lstElem.getListaChefao().get(1));
		}
		while(lstElem.getListaInimigo3().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray3 = gerador.nextInt(lstElem.getListaInimigo3().size());
			Inimigo inimigo = lstElem.getListaInimigo3().get(escolhaArray3); System.out.println(inimigo.toString());
			System.out.println("Inimigos nível 3");
			btlInim.batalha(jog,inimigo);
			lstElem.getListaInimigo3().remove(escolhaArray3);
			System.out.println("VIDA DO JOGADOR: "+jog.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jog.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jog.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jog.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jog.getPocao());
			System.out.println("====================");
		}
		if(jog.getPtsVida() > 0) {
		System.out.println("É hora de enfrentar o Rei Esqueleto!");
		btlChef.batalha(jog,lstElem.getListaChefao().get(2));
		}
		if(jog.getPtsVida() > 0) {
			
			System.out.println("Parabéns, você finalizou o jogo !");
		}else {
			System.out.println("Fim de Jogo!");
		}
	}
}


