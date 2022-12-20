//Tela do jogo - Responsável por todas as interações e atualizações das batalhas entre o jogador e os inimigos e chefões
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
import Classes.Chefao;
import Classes.Jogador;
import Classes.ListasElementos;
import Classes.Inimigo;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogo extends JFrame {
	private JPanel PaneTelaJogo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	//Metodo principal da tela do jogo - Carrega todos os objetos visuais e eventos necessários.
	//Carrega também toda implementação necessária para as batalhas passando objetos da tela como parâmetros para
	//as devidas atualizações durante os processamentos internos das classes batalha e batalha chefão.
	public TelaJogo(Jogador jog, ListasElementos lstElem,  Batalhas btlInim, BatalhasChefao btlChef) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 401);
		PaneTelaJogo = new JPanel();
		PaneTelaJogo.setBackground(new Color(95, 158, 160));
		PaneTelaJogo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PaneTelaJogo);
		PaneTelaJogo.setLayout(null);
		
		JPanel panelJogador = new JPanel();
		panelJogador.setForeground(new Color(0, 255, 128));
		panelJogador.setBackground(new Color(255, 250, 205));
		panelJogador.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(128, 0, 0), null));
		panelJogador.setBounds(10, 11, 224, 73);
		PaneTelaJogo.add(panelJogador);
		panelJogador.setLayout(null);
		
		JProgressBar progressBarVidaPersonagem = new JProgressBar();
		progressBarVidaPersonagem.setForeground(Color.GREEN);
		progressBarVidaPersonagem.setBackground(Color.LIGHT_GRAY);
		progressBarVidaPersonagem.setBounds(20, 30, 183, 14);
		panelJogador.add(progressBarVidaPersonagem);
		progressBarVidaPersonagem.setValue(90);
		
		JLabel lblPersonagem = new JLabel("SAMURAI");
		lblPersonagem.setForeground(Color.GRAY);
		lblPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblPersonagem.setBounds(10, 11, 135, 14);
		panelJogador.add(lblPersonagem);
		
		JLabel lblNivelPersonagem = new JLabel("9");
		lblNivelPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelPersonagem.setForeground(Color.GRAY);
		lblNivelPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblNivelPersonagem.setBounds(183, 6, 20, 25);
		panelJogador.add(lblNivelPersonagem);
		
		JProgressBar progressExpPersonagem = new JProgressBar();
		progressExpPersonagem.setMaximum(1000);
		progressExpPersonagem.setForeground(Color.CYAN);
		progressExpPersonagem.setBackground(Color.LIGHT_GRAY);
		progressExpPersonagem.setBounds(38, 55, 165, 8);
		panelJogador.add(progressExpPersonagem);
		progressExpPersonagem.setValue(30);
		
		JLabel lblExpPersonagem = new JLabel("EXP");
		lblExpPersonagem.setForeground(Color.BLUE);
		lblExpPersonagem.setBackground(Color.WHITE);
		lblExpPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 9));
		lblExpPersonagem.setBounds(10, 51, 28, 14);
		panelJogador.add(lblExpPersonagem);
		
		JLabel lblIDNivelPersonagem = new JLabel("LV");
		lblIDNivelPersonagem.setForeground(Color.BLUE);
		lblIDNivelPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblIDNivelPersonagem.setBounds(155, 11, 33, 14);
		panelJogador.add(lblIDNivelPersonagem);
		
		JPanel panelAdversario = new JPanel();
		panelAdversario.setLayout(null);
		panelAdversario.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(165, 42, 42), null));
		panelAdversario.setBounds(285, 11, 224, 73);
		panelAdversario.setForeground(new Color(0, 255, 128));
		panelAdversario.setBackground(new Color(255, 250, 205));
		PaneTelaJogo.add(panelAdversario);
		
		JProgressBar progressVidaAdversario = new JProgressBar();
		progressVidaAdversario.setForeground(Color.GREEN);
		progressVidaAdversario.setBackground(Color.LIGHT_GRAY);
		progressVidaAdversario.setValue(45);
		progressVidaAdversario.setBounds(20, 30, 183, 14);
		panelAdversario.add(progressVidaAdversario);
		
		JLabel lblAdversario = new JLabel("LOBISOMEN");
		lblAdversario.setForeground(Color.GRAY);
		lblAdversario.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		lblAdversario.setBounds(10, 11, 204, 14);
		panelAdversario.add(lblAdversario);
		
		JLabel lblImgPersonagem = new JLabel("");
		lblImgPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPersonagem.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaCacador2.png"));
		lblImgPersonagem.setBounds(10, 111, 150, 150);
		PaneTelaJogo.add(lblImgPersonagem);
		
		JLabel lblImgAdversario = new JLabel("");
		lblImgAdversario.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgAdversario.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\escolhaReiEsqueleto.png"));
		lblImgAdversario.setBounds(357, 111, 150, 150);
		PaneTelaJogo.add(lblImgAdversario);
		
		JPanel panelAtaques = new JPanel();
		panelAtaques.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelAtaques.setBounds(10, 300, 392, 51);
		PaneTelaJogo.add(panelAtaques);
		panelAtaques.setLayout(null);
		
		JRadioButton rdbtnAtaqueBasico = new JRadioButton("ATAQUE BÁSICO");
		rdbtnAtaqueBasico.setSelected(true);
		buttonGroup.add(rdbtnAtaqueBasico);
		rdbtnAtaqueBasico.setForeground(Color.GRAY);
		rdbtnAtaqueBasico.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		rdbtnAtaqueBasico.setBounds(6, 14, 154, 23);
		panelAtaques.add(rdbtnAtaqueBasico);
		
		JRadioButton rdbtnAtaqueEspecial = new JRadioButton("ATAQUE ESPECIAL");
		rdbtnAtaqueEspecial.setSelected(true);
		buttonGroup.add(rdbtnAtaqueEspecial);
		rdbtnAtaqueEspecial.setForeground(Color.GRAY);
		rdbtnAtaqueEspecial.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		rdbtnAtaqueEspecial.setBounds(162, 14, 163, 23);
		panelAtaques.add(rdbtnAtaqueEspecial);
		
		JButton btnAtacar = new JButton("");
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtacar.addMouseListener(new MouseAdapter() {
			@Override
			//Executa o ataque ao inimigo ou chefão. Atribui um valor de referência a ser usado nas classes batalha e
			//batalha chefao de modo a identificar o tipo de ataque (básico ou especial)
			public void mouseClicked(MouseEvent e) {
				if (rdbtnAtaqueBasico.isSelected()) {jog.setOpcaoAtaque(1);}
				if (rdbtnAtaqueEspecial.isSelected()) {jog.setOpcaoAtaque(2);}
			}
		});
		btnAtacar.setToolTipText("Atacar");
		btnAtacar.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\botaoAtaque4.png"));
		btnAtacar.setBounds(335, 6, 50, 40);
		panelAtaques.add(btnAtacar);
		
		JPanel panelMPPersonagem = new JPanel();
		panelMPPersonagem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelMPPersonagem.setBounds(402, 300, 108, 51);
		PaneTelaJogo.add(panelMPPersonagem);
		panelMPPersonagem.setLayout(null);
		
		JLabel lblMPPersonagem = new JLabel("5");
		lblMPPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMPPersonagem.setForeground(Color.GRAY);
		lblMPPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblMPPersonagem.setBounds(42, 7, 25, 14);
		panelMPPersonagem.add(lblMPPersonagem);
		
		JLabel lblPocoes = new JLabel("0");
		lblPocoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblPocoes.setForeground(Color.GRAY);
		lblPocoes.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblPocoes.setBounds(42, 26, 25, 14);
		panelMPPersonagem.add(lblPocoes);
		
		JLabel lblIDMPPersonagem = new JLabel("MP");
		lblIDMPPersonagem.setForeground(Color.BLUE);
		lblIDMPPersonagem.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblIDMPPersonagem.setBounds(10, 7, 33, 14);
		panelMPPersonagem.add(lblIDMPPersonagem);
		
		JLabel lblIDPocoes = new JLabel("P");
		lblIDPocoes.setForeground(Color.BLUE);
		lblIDPocoes.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblIDPocoes.setBounds(10, 26, 25, 14);
		panelMPPersonagem.add(lblIDPocoes);
		lblImgPersonagem.setIcon(new ImageIcon(jog.getImagem()));
		lblImgPersonagem.setToolTipText("");
		
		JPanel panelBatalhaStatusAtaques = new JPanel();
		panelBatalhaStatusAtaques.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelBatalhaStatusAtaques.setBounds(184, 132, 146, 108);
		PaneTelaJogo.add(panelBatalhaStatusAtaques);
		panelBatalhaStatusAtaques.setLayout(null);
		
		JLabel lblBatalhaTipoAtaque = new JLabel("-");
		lblBatalhaTipoAtaque.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatalhaTipoAtaque.setForeground(Color.RED);
		lblBatalhaTipoAtaque.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		lblBatalhaTipoAtaque.setBounds(0, 61, 146, 14);
		panelBatalhaStatusAtaques.add(lblBatalhaTipoAtaque);
		
		JLabel lblBatalhaDanoAtaque = new JLabel("-");
		lblBatalhaDanoAtaque.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatalhaDanoAtaque.setForeground(Color.RED);
		lblBatalhaDanoAtaque.setBackground(Color.WHITE);
		lblBatalhaDanoAtaque.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		lblBatalhaDanoAtaque.setBounds(0, 83, 146, 14);
		panelBatalhaStatusAtaques.add(lblBatalhaDanoAtaque);
		
		JLabel lblBatalhaSentidoAtaque = new JLabel("");
		lblBatalhaSentidoAtaque.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\aguardaAtaque.png"));
		lblBatalhaSentidoAtaque.setBounds(15, 11, 116, 39);
		panelBatalhaStatusAtaques.add(lblBatalhaSentidoAtaque);
		
		JButton btnPocao1Adversario = new JButton("");
		btnPocao1Adversario.addMouseListener(new MouseAdapter() {
			@Override
			//Atribui pontos de vida extra ao jogador devido ao ganho de uma poção, removendo o botão após o clique
			public void mouseClicked(MouseEvent e) {
				jog.setPtsVida(jog.getPtsVida()+20);
				progressBarVidaPersonagem.setValue(jog.getPtsVida());
				jog.setPocao(jog.getPocao()-1);
				lblPocoes.setText(Integer.toString(jog.getPocao()));
				btnPocao1Adversario.setVisible(false);
			}
		});
		btnPocao1Adversario.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\pocaoIcon2.png"));
		btnPocao1Adversario.setSelectedIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\pocaoIcon2.png"));
		btnPocao1Adversario.setBounds(240, 66, 18, 18);
		btnPocao1Adversario.setVisible(false);
		PaneTelaJogo.add(btnPocao1Adversario);
		
		JButton btnEfeitoAtaqueJogador = new JButton("");
		btnEfeitoAtaqueJogador.setToolTipText("");
		btnEfeitoAtaqueJogador.setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\efeitoSangramento.png"));
		btnEfeitoAtaqueJogador.setBounds(240, 11, 18, 18);
		btnEfeitoAtaqueJogador.setVisible(false);
		PaneTelaJogo.add(btnEfeitoAtaqueJogador);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
				
		//Vetores auxiliares para atualizar os dados do jogador e dos oponentes na tela usando os componentes
		JLabel[] labelsJog = {lblPersonagem,lblNivelPersonagem,lblMPPersonagem,lblPocoes, lblImgPersonagem};
		JProgressBar[] progressJog = {progressBarVidaPersonagem, progressExpPersonagem};
		
		JLabel[] labelsInim = {lblAdversario, lblImgAdversario};
		JProgressBar[] progressInim = {progressVidaAdversario};
		JButton[] buttonsInim = {btnPocao1Adversario, btnEfeitoAtaqueJogador};
		
		//Vetor contendo opção de ataque básico ou especial e executar ação
		JRadioButton[] JRadiosAtaq = {rdbtnAtaqueBasico,rdbtnAtaqueEspecial} ;
		JButton[] JButtonsAtaq = {btnAtacar};
				
		//Vetor contendo dados do sentido de ataque: jogador ou adversário
		JLabel[] JLabelsAtaque = {lblBatalhaSentidoAtaque, lblBatalhaTipoAtaque, lblBatalhaDanoAtaque};   
		
		//Carrega dados do jogador. jog
		System.out.println("TELA - CARREGA DADOS DO JOGADOR");
		jog.atualizaTelaDadosJogador(labelsJog, progressJog, 1);
		
		//Inicio das batalhas com o jogador definido
		//1a Rodada
		while(lstElem.getListaInimigo1().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray = gerador.nextInt(lstElem.getListaInimigo1().size());
			Inimigo inimigoAtual = lstElem.getListaInimigo1().get(escolhaArray); 
			
			//Carrega dados do inimigo
			System.out.println("TELA - CARREGA DADOS DO INIMIGO");
			inimigoAtual.atualizaTelaDadosInimigo(labelsInim, progressInim, buttonsInim, 1);
						
			//Batalha entre o jogador e o inimigo atual e remoção do inimigo na lista se derrotado
			btlInim.batalha(jog, inimigoAtual, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
			lstElem.getListaInimigo1().remove(escolhaArray);
			
			//Atualiza dados jogador
			System.out.println("TELA - ATUALIZA DADOS DO JOGADOR APÓS BATALHA");
			jog.atualizaTelaDadosJogador(labelsJog, progressJog, 2);
		}
		if(jog.getPtsVida() > 0) {
			//Se o jogador ainda possui vida então carrega batalha entre o jogador e o primeiro chefão
			Chefao chefao1 = lstElem.getListaChefao().get(0);
			System.out.println("TELA - CARREGA DADOS DO CHEFAO1");
			chefao1.atualizaTelaDadosChefao(labelsInim, progressInim, buttonsInim, 1);
			btlChef.batalha(jog, chefao1, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
		}
		
		//2a Rodada
		while(lstElem.getListaInimigo2().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray2 = gerador.nextInt(lstElem.getListaInimigo2().size());
			Inimigo inimigo = lstElem.getListaInimigo2().get(escolhaArray2); 
			
			System.out.println("TELA - CARREGA DADOS DO INIMIGO");
			inimigo.atualizaTelaDadosInimigo(labelsInim, progressInim, buttonsInim, 1);
			
			btlInim.batalha(jog, inimigo, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
			lstElem.getListaInimigo2().remove(escolhaArray2);
			
			System.out.println("TELA - ATUALIZA DADOS DO JOGADOR APÓS BATALHA");
			jog.atualizaTelaDadosJogador(labelsJog, progressJog, 2);
		}
		if(jog.getPtsVida() > 0) {
			Chefao chefao2 = lstElem.getListaChefao().get(1);
			System.out.println("TELA - CARREGA DADOS DO CHEFAO2");
			chefao2.atualizaTelaDadosChefao(labelsInim, progressInim, buttonsInim, 1);
			btlChef.batalha(jog, chefao2, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
		}
		
		//3a Rodada
		while(lstElem.getListaInimigo3().size() > 0 && jog.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray3 = gerador.nextInt(lstElem.getListaInimigo3().size());
			Inimigo inimigo = lstElem.getListaInimigo3().get(escolhaArray3); 
			
			System.out.println("TELA - CARREGA DADOS DO INIMIGO");
			inimigo.atualizaTelaDadosInimigo(labelsInim, progressInim, buttonsInim, 1);
			
			btlInim.batalha(jog, inimigo, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
			lstElem.getListaInimigo3().remove(escolhaArray3);
			
			System.out.println("TELA - ATUALIZA DADOS DO JOGADOR APÓS BATALHA");
			jog.atualizaTelaDadosJogador(labelsJog, progressJog, 2);
		}
		
		if(jog.getPtsVida() > 0) {
			Chefao chefao3 = lstElem.getListaChefao().get(2);
			System.out.println("TELA - CARREGA DADOS DO CHEFAO3");
			chefao3.atualizaTelaDadosChefao(labelsInim, progressInim, buttonsInim, 1);
			btlChef.batalha(jog, chefao3, labelsJog, progressJog, labelsInim, progressInim, buttonsInim, JRadiosAtaq, JButtonsAtaq, JLabelsAtaque );
		}
		//Definição do final do jogo
		if(jog.getPtsVida() > 0) {
			System.out.println("TELA - PERSONAGEM TERMINOU O JOGO");
		}else {
			System.out.println("TELA - PERSONAGEM MORREU");
		}
		System.out.println("FIM DO JOGO");
		setVisible(false);
		dispose();
	}
}


