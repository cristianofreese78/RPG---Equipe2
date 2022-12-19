package Classes;

public class Elementos{
	private String nome;
	private int ptsVida;
	private int dnAtaqueBasico;
	private String imagem;
	private boolean atacou;
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public boolean isAtacou() {
		return atacou;
	}
	public void setAtacou(boolean atacou) {
		this.atacou = atacou;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPtsVida() {
		return ptsVida;
	}
	public void setPtsVida(int ptsVida) {
		this.ptsVida = ptsVida;
	}
	public int getDnAtaqueBasico() {
		return dnAtaqueBasico;
	}
	public void setDnAtaqueBasico(int dnAtaqueBasico) {
		this.dnAtaqueBasico = dnAtaqueBasico;
	}
	
	//Atualiza os atribuitos baseado no dano que o inimigo levou
	//O operador op define se os valor será incrementado ou decrementado
		public boolean atualizaDados(int dnTurno, char opDnTur) {
					
		if (opDnTur == 'd') this.setPtsVida(this.getPtsVida()-dnTurno);
		else this.setPtsVida(this.getPtsVida()+dnTurno);
		
		if (this.getPtsVida() > 0) return true;
		else return false;
	}
}
