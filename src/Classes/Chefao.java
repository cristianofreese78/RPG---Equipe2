//Classe responsável pelos atributos e métodos dos chefoes herdando todas os demais atributos em comum das classes
//Elementos e AtaqueEspecial.
package Classes;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Chefao extends AtaqueEspecial{
	
	public Chefao(String nmElementos, int ptsVida, int dnAtaqueBasico, String tpAtaqueEspecial, int dnAtaqueEspecial, String img) {
		super();
		this.setNome(nmElementos);
		this.setPtsVida(ptsVida);
		this.setDnAtaqueBasico(dnAtaqueBasico);
		this.setTpAtaqueEspecial(tpAtaqueEspecial);
		this.setDnAtaqueEspecial(dnAtaqueEspecial);
		this.setImagem(img);
	}
	
	@Override
	public String toString() {
		//Formata os dados do objeto em um buffer String
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nNome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append("\nPontos de Vida: ");
		stringBuffer.append(this.getPtsVida());
		stringBuffer.append("\nDano Ataque Básico: ");
		stringBuffer.append(this.getDnAtaqueBasico());
		stringBuffer.append("\nDano Ataque Especial: ");
		stringBuffer.append(this.getDnAtaqueEspecial());
		stringBuffer.append("\nTipo Ataque Especial: ");
		stringBuffer.append(this.getTpAtaqueEspecial());
		return stringBuffer.toString();
	}
	
	//Atualiza (2) ou exibe (1) inicialmente na tela do jogo os dados do chefao atual.
	public void atualizaTelaDadosChefao(JLabel[] lbl, JProgressBar[] pgr, JButton[] btnImg, int opcao) {
		switch(opcao) {
			case 1: {
				lbl[0].setText(this.getNome());								//lblAdversario
				lbl[1].setIcon(new ImageIcon(this.getImagem()));			//lblImgAdversario
				lbl[1].setToolTipText(this.getNome().toUpperCase());		//lblImgAdversario
				pgr[0].setMaximum(this.getPtsVida());						//progressVidaAdversario
				pgr[0].setValue(this.getPtsVida());							//progressVidaAdversario
				btnImg[0].setVisible(false);								//btnPocao1Adversario
				btnImg[1].setVisible(false);								//btnPocao2Adversario
			}
			case 2: {
				pgr[0].setValue(this.getPtsVida());							//progressVidaAdversario
			}
		}
	}
}


