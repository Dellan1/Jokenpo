package jogo;

public class Jogador {
	
	private String nome;
	private String opcao;
	private int pontuacao;
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	
	public void setJogadaAtual(String opcao) {
		this.opcao = opcao;
	}
	
	public String getJogadaAtual() {
		return opcao;
	}

}
