//Classe responsável pelos atributos do inimigo herdando os atributos comuns da classe elementos
package Classes;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Inimigo extends Elementos{
	
	public Inimigo(String nmElementos, int ptsVida, int dnAtaqueBasico, String img) {
		super();
		this.setNome(nmElementos);
		this.setPtsVida(ptsVida);
		this.setDnAtaqueBasico(dnAtaqueBasico);
		this.setImagem(img);
	}
	
	public Inimigo() {
		super();
	}
	
	@Override
	//Formata os dados do objeto em um buffer String
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nNome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append("\nPontos de Vida: ");
		stringBuffer.append(this.getPtsVida());
		stringBuffer.append("\nDano Ataque Básico: ");
		stringBuffer.append(this.getDnAtaqueBasico());
		return stringBuffer.toString();
	}
	
	//Atualiza (2) ou exibe (1) inicialmente na tela do jogo os dados do inimigo atual.
	public void atualizaTelaDadosInimigo(JLabel[] lbl, JProgressBar[] pgr, JButton[] btnImg, int opcao) {
		switch(opcao) {
			case 1: {
				lbl[0].setText(this.getNome());								//lblAdversario
				lbl[1].setIcon(new ImageIcon(this.getImagem()));			//lblImgAdversario
				lbl[1].setToolTipText(this.getNome().toUpperCase());		//lblImgAdversario
				pgr[0].setMaximum(this.getPtsVida());						//progressVidaAdversario
				pgr[0].setValue(this.getPtsVida());							//progressVidaAdversario
			}
			case 2: {
				pgr[0].setValue(this.getPtsVida());							//progressVidaAdversario
			}
		}
	}
}
