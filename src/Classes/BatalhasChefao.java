//Classe reponsável pelos metodos e atributos relacionados as batalhas como inimigos
//O metodo principal batalha, recebe como parâmetro todos os componentes da tela do jogo para as atualizações dinâmicas
package Classes;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class BatalhasChefao {
	private boolean encerrouTurno;
	
	public boolean isEncerrouTurno() {
		return encerrouTurno;
	}
	public void setEncerrouTurno(boolean encerrouTurno) {
		this.encerrouTurno = encerrouTurno;
	}
	
	public static  int calcularChance() {
		Random gerador = new Random();
		int numeroEscolhido = gerador.nextInt(100);
		return numeroEscolhido;
	}
	
	public static int gerador() {
		Random gerador = new Random();
		return gerador.nextInt(2) + 1;
	}
	public static int numeroClima() {
		Random gerador = new Random();
		int numeroClima = gerador.nextInt(3)+1;
		return numeroClima;
	}

	public static String eventoClimatico(int numeroClima, Jogador jogador, Inimigo inimigo) {
		if (numeroClima == 1 ) {
			System.out.println("Clima: Manhã\nO "+jogador.getNome()+" ganhou + 10 de vida!");
			jogador.setPtsVida(jogador.getPtsVida()+10);
			System.out.println("A vida do jogador foi para: "+jogador.getPtsVida());
		}else if (numeroClima == 2) {
			System.out.println("Clima: Tarde");
		}else if (numeroClima == 3) {
			System.out.println("Clima: Noite de lua cheia\nO inimigo "+inimigo.getNome()+" ganhou + 10 de vida!");
			inimigo.setPtsVida(inimigo.getPtsVida()+10);
			System.out.println("A vida do inimigo foi para: "+inimigo.getPtsVida());
		}
		return null;
	}
	public static String passivaReiEsqueleto(Chefao chefao) {
		if(chefao.getNome() == "Rei Esqueleto") {
			chefao.setDnAtaqueBasico(chefao.getDnAtaqueBasico()*(int)1.10);
			chefao.setDnAtaqueEspecial((int) ((int)chefao.getDnAtaqueEspecial()*1.1));
			//System.out.println("Passiva: Furia do Rei");
			//System.out.println("O Rei Esqueleto aumentou o seu dano em 10%!");
			JOptionPane.showMessageDialog(null, "Passiva(Fúria do Rei): Rei Esqueleto reforçou o dano em 10%", null,1);
		}
		return null;
	}
	
	public static int passivas(Jogador jogador, Chefao chefao, int numeroEscolhido, int atordoamento,int critico) {
		int vida = jogador.getPtsVida();
		int vidaInimigo = chefao.getPtsVida();
		if(jogador.getNome() == "Cavaleiro") {
			//System.out.println("Efeito passivo: Sangramento");
			//System.out.println("O chefão perdeu 5 de vida");
			jogador.setSangramento(1);
			return vidaInimigo -= jogador.getDnAtaqueEspecial();
		}else if(jogador.getNome() == "Samurai") {
			if(numeroEscolhido <= 25) {
			//System.out.println("O Samurai acertou um ataque crítico ! ");
			//System.out.println("Dano: "+jogador.getDnAtaqueEspecial()*2);
			jogador.setCritico(1);
			return critico = 1;
			}else{
				return critico = 0;
			}
		}else if(jogador.getNome() == "Monge"){
			if(numeroEscolhido <= 25) {
			//System.out.println("O Monge acertou um atordoamento !");
			//System.out.println("O Chefão não atacará na próxima rodada");
			jogador.setAtordoamento(1);
			return atordoamento;
			}else {
				return atordoamento;
			}
		}else {
			jogador.setSedento(1);
			//System.out.println("Efeito passivo: Sedento por luta");
			//System.out.println("O Caçador recupera 10% do dano causado")
			return vida += (jogador.getDnAtaqueEspecial()*0.20);
			
		}
		
	}
	
	public void batalha(Jogador jogador, Chefao chefao, JLabel[] lblJog, JProgressBar[] pgrJog, JLabel[] lblInim, JProgressBar[] pgrInim, JButton[] btnImgInim, JRadioButton[] JRadAtaq, JButton[] JButtonsAtaq, JLabel[] lblAtaq) {
		//lblJog[0] lblPersonagem, lblJog[1] lblNivelPersonagem, lblJog[2] lblMPPersonagem, lblJog[3] lblPocoes, lblJog[4] lblImgPersonagem
		//pgrJog[0] progressBarVidaPersonagem, pgrJog[1] progressExpPersonagem
				
		//lblInim[0] lblAdversario, lblInim[1] lblImgAdversario
		//pgrInim[0] progressVidaAdversario
		//btnImgInim[0] btnPocao1Adversario, btnImg[1] btnPocao2Adversario
		
		//JRadAtaq[0] rdbtnAtaqueBasico, JRadAtaq[1] rdbtnAtaqueEspecial
		//JButtonsAtaq[0] btnAtacar
				
		//lblAtaq[0] lblBatalhaSentidoAtaque, lblAtaq[1] lblBatalhaTipoAtaque, lblAtaq[2] lblBatalhaDanoAtaque
		
		setEncerrouTurno(false);
		int delay = 100;   		// Thread timer - tempo de espera antes da 1ª execução da tarefa.
		int interval = 1000;  	// Thread timer - intervalo no qual a tarefa será executada.
		Timer threadAtaquePersonagem = new Timer();
		
		threadAtaquePersonagem.scheduleAtFixedRate(new TimerTask() {
			Scanner scan = new Scanner(System.in);
			int vida = jogador.getPtsVida();
			int mpAtual = jogador.getMpJogador();
			int exp = jogador.getPtsExperiencia();
			int nivel = jogador.getNvlJogador();
			int qtdPocao = jogador.getPocao();
			int vidaChefao = chefao.getPtsVida();
			int expParaNivel = (int) Math.floor(100 * Math.pow(nivel, 1.5));
			int numeroEscolhido = calcularChance();
			
			int eventos = numeroClima();
			int ataqueChefao = gerador();
			
			int mpGasto = 0;
			int danoSofrido = 0;
			int critico = 0;
			boolean flag = true;
			
			int escolherAtaque = 3;
			boolean escolheu = false;
			
			public void run() {
				while((vida > 0 && vidaChefao > 0 && jogador.getPtsVida()>0) && (!isEncerrouTurno())) {
					jogador.setAtacou(false);
					chefao.setAtacou(false);
					jogador.setAtordoamento(0);
					jogador.setCritico(0);
					jogador.setSangramento(0);
					jogador.setSedento(0);
					jogador.setMpJogador(mpAtual);
					
					//Loop de escolha do tipo de ataque do personagem
					while (!escolheu) {
						//escolherAtaque = Integer.parseInt(JButtonsAtaq[0].getText());
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						escolherAtaque = jogador.getOpcaoAtaque();
						//System.out.println(escolherAtaque);
						if ((escolherAtaque == 1) || (escolherAtaque == 2)) escolheu = true;
					}
					System.out.println("TELA - ATAQUE DO PERSONAGEM");
					JButtonsAtaq[0].setEnabled(false);
					btnImgInim[0].setVisible(false);
															
					switch(escolherAtaque) {
						//Ataque básico
						case 1: {
							//System.out.println("Ataque Básico da Thread");
							lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaDireitaIcon2.jpg"));
							
							vidaChefao -= jogador.getDnAtaqueBasico();
							chefao.setPtsVida(vidaChefao);
							//System.out.println("Você atacou com: Ataque Básico\nDano: "+ jogador.getDnAtaqueBasico());
							lblAtaq[1].setText("Ataque Básico");
							lblAtaq[2].setText(Integer.toString(jogador.getDnAtaqueBasico()));
							if (vidaChefao < 0) {
								vidaChefao = 0;
							}
							//System.out.println("Vida do inimigo: "+ vidaInimigo);
							pgrInim[0].setValue(vidaChefao);
							flag = true;
							jogador.setAtordoamento(0);
							jogador.setAtacou(true);
							break;
						}
						//Ataque especial
						case 2: {
							//System.out.println("Ataque Especial da Thread");
							lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaDireitaIcon2.jpg"));
							
							if(jogador.getMpJogador() > 0) {
								
								vidaChefao -= jogador.getDnAtaqueEspecial(); 
								mpAtual -= 1;
								//System.out.println("Você atacou com: Ataque Especial\nDano: "+ jogador.getDnAtaqueEspecial());
								lblAtaq[1].setText("Ataque Especial");
								lblAtaq[2].setText(Integer.toString(jogador.getDnAtaqueEspecial()));
								numeroEscolhido = calcularChance();
								int passiva = passivas(jogador,chefao,numeroEscolhido,jogador.getAtordoamento(),critico);
								//System.out.println("MP: " +mpAtual);
								lblJog[2].setText(Integer.toString(mpAtual));
								jogador.setMpJogador(mpAtual);
								if (jogador.getCritico() == 1) {
									vidaChefao -= jogador.getDnAtaqueEspecial();
									btnImgInim[1].setVisible(true);
									btnImgInim[1].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\efeitoCritico.png"));
									btnImgInim[1].setToolTipText("Crítico - Inimigo sofreu dano duplo");
								}
								if (jogador.getSangramento() == 1) {
									vidaChefao -= 5;
									btnImgInim[1].setVisible(true);
									btnImgInim[1].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\efeitoSangramento.png"));
									btnImgInim[1].setToolTipText("Sangramento - Inimigo sofreu 5 de dano");
								}
								if (jogador.getSedento() == 1) {
									vida += (jogador.getDnAtaqueEspecial()*0.1);
									btnImgInim[1].setVisible(true);
									btnImgInim[1].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\efeitoSedento.png"));
									btnImgInim[1].setToolTipText("Sedento - Caçador recupera 10% do dano");
								}
								if(jogador.getAtordoamento() == 1) {
									btnImgInim[1].setVisible(true);
									btnImgInim[1].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\efeitoAtordoamento.png"));
									btnImgInim[1].setToolTipText("Atordoamento - Inimigo sem ação na próxima rodada");
								}
								if (vidaChefao < 0) {
									vidaChefao = 0;
								}
								//System.out.println("Vida do inimigo: "+ vidaInimigo);
								pgrInim[0].setValue(vidaChefao);
								mpGasto += 1;
								flag = true;
								jogador.setAtacou(true);
							
							}	else {
									//System.out.println("Você não tem MP suficiente!");
									lblJog[2].setText("0");
									lblJog[2].setForeground(Color.RED);
									flag = false;
									jogador.setAtacou(false);
									escolheu = false;
									//JButtonsAtaq[0].setText("3");
									jogador.setOpcaoAtaque(3);
									lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\aguardaAtaque.png"));
									lblAtaq[1].setText("-");
									lblAtaq[2].setText("-");
								}
							
							break;	
						}	//Fim case2
					}	//Fim switch
					
					//Se o personagem atacou, então aguarda 3s e executa ataque do inimigo
					if (jogador.isAtacou()) {
						//JButtonsAtaq[0].setText("3");
						jogador.setOpcaoAtaque(3);
						escolheu = false;
						chefao.setAtacou(false);
						try {
							TimeUnit.SECONDS.sleep(3);
							System.out.println("TELA - ATAQUE DO CHEFAO");
							btnImgInim[1].setVisible(false);
							JButtonsAtaq[0].setEnabled(true);
								
							//Ataque do inimigo
							if (vidaChefao > 0 && flag == true && jogador.getAtordoamento() == 0) {
								switch(ataqueChefao) {  
									case 1: {
										//System.out.println("O inimigo atacou com um ataque básico");
										lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaEsquerdaIcon2.jpg"));
										vida -= chefao.getDnAtaqueBasico();
										danoSofrido += chefao.getDnAtaqueBasico();
										lblAtaq[1].setText("Ataque Básico");
										lblAtaq[2].setText(Integer.toString(danoSofrido));
										//System.out.println("Vida do jogador: "+vida);
										pgrJog[0].setValue(vida);
										if(chefao.getNome() == "Rei Esqueleto") {
											String passivarei = passivaReiEsqueleto(chefao);
										}
										break;
									}
									case 2: {
										//System.out.println("O Chefão atacou com um ataque especial");
										lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\setaEsquerdaIcon2.jpg"));
										vida -= chefao.getDnAtaqueEspecial();
										danoSofrido += chefao.getDnAtaqueEspecial();
										lblAtaq[1].setText("Ataque Especial");
										lblAtaq[2].setText(Integer.toString(danoSofrido));
										//System.out.println("Vida do jogador: "+vida);
										pgrJog[0].setValue(vida);
										if(chefao.getNome() == "Rei Esqueleto") {
											String passivarei = passivaReiEsqueleto(chefao);
										}
										break;
									}
								}
							}
							//Controles gerais para impedir que o botão de ataque do personagem não seja considerado 
							//até finalizar o ataque do inimigo
							chefao.setAtacou(true);
							//JButtonsAtaq[0].setText("3");
							jogador.setOpcaoAtaque(3);
						}	//	Fim try
							catch (InterruptedException e) {
								e.printStackTrace();
							}	//Fim catch
					}	//Fim if
				}	//Fim while
				
				//Rotinas após escolha de ataque do personagem e ataque inimigo
				if(vida>0) {
					mpAtual -= mpGasto;
					exp += 50;
					//System.out.println("O dano sofrido foi de: "+danoSofrido);
					//System.out.println("Sua Experiência após a batalha: "+exp);
					//System.out.println("Você gastou: "+mpGasto+" MP nesta batalha");
					jogador.setPtsVida(vida);
					pgrJog[0].setValue(vida);
					jogador.setPtsExperiencia(exp);
					pgrJog[1].setValue(exp);
					numeroEscolhido = calcularChance();
					if(numeroEscolhido <= 20) {
						//System.out.println("Você ganhou uma poção de cura!");
						qtdPocao += 1;
						jogador.setPocao(qtdPocao);
						lblJog[3].setText(Integer.toString(qtdPocao));
						btnImgInim[0].setVisible(true);
					}
					if (eventos == 1) {
						jogador.setPtsVida(jogador.getPtsVida()-10);
					}
					if(exp >= expParaNivel) {
						//System.out.println("Parabéns você evoluiu de nível !");
						nivel += 1;
						jogador.setPtsVida((int) (jogador.getPtsVida()* 1.1 + (nivel*1.5)));
						jogador.setMpJogador(jogador.getMpJogador()+2);
						jogador.setDnAtaqueBasico((int)(jogador.getDnAtaqueBasico()* 1.1 + (nivel*1.5)));
						jogador.setDnAtaqueEspecial((int)(jogador.getDnAtaqueEspecial()* 1.1 + (nivel*1.5)));
						//System.out.println("Nível: "+nivel);
						jogador.setNvlJogador(nivel);
						lblJog[1].setText(Integer.toString(nivel));
					}
					//flag = false;
					/*
					while(flag == false && qtdPocao > 0) {
						
						btnImgInim[0].setVisible(true);
						
						Object[] opcoes = { "Sim", "Não" };
					    int escolherPocao = (JOptionPane.showOptionDialog(null,
					    				"Usar poção de cura?",
					    				"Você ganhou uma poção de cura", JOptionPane.YES_NO_OPTION,
					    				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0])) + 1;
					    //System.out.println("Deseja utilizar uma poção de cura? Recupera 20 de vida\n1 para sim e 2 para não");
						//int escolherPocao = scan.nextInt();
						switch(escolherPocao) {
							case 1:{
								//System.out.println("Você escolheu utilizar uma poção");
								vida += 20;
								//System.out.println("Vida do jogador: "+vida);
								jogador.setPtsVida(vida);
								pgrJog[0].setValue(vida);
								qtdPocao -= 1;
								jogador.setPocao(qtdPocao);
								lblJog[3].setText(Integer.toString(qtdPocao));
								flag = true;
								break;
							}
							case 2:{
								//System.out.println("Você escolheu não utilizar uma poção");
								flag = true;
								break;
							}
						}	//Fim case
						
						btnImgInim[0].setVisible(false);
					}	//Fim while
					*/
				}	//Fim if
				if(vida<=0) {
					jogador.setPtsVida(vida);
					pgrJog[0].setValue(vida);
					//System.out.println("Você morreu na batalha!");
				}
				setEncerrouTurno(true);
				threadAtaquePersonagem.cancel();
			}	//	Fim run
		}, delay, interval);
		
		do {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(!isEncerrouTurno());
		//System.out.println("Saindo do metodo");
		//Limpa visualização de status de ataque de pesonagem ou adversário
		lblAtaq[0].setIcon(new ImageIcon("C:\\RPG---Equipe2\\src\\Img\\aguardaAtaque.png"));
		lblAtaq[1].setText("-");
		lblAtaq[2].setText("-");
	}	//Fim método batalha	
}	//Fim classe Batalha Chefão	
