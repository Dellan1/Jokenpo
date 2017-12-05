package jogo;

public class Controlador {
	
	private static final int FIM_DO_JOGO = 5;
	
	// Pedra
	// Papel
	// Tesoura
	
	public static void Comparar(Jogador j1, Jogador j2) {
		String opcaoJogador = j1.getJogadaAtual();
		String opcaoComputador = j2.getJogadaAtual();
		
		// Checa se sao iguais
		if(opcaoJogador.equals(opcaoComputador)) {
			System.out.println("Placar atual: "+j1.getPontuacao()+"x"+j2.getPontuacao());
			return;
		}
			
		
		// Caso nao forem iguais
		if(opcaoJogador.equals("pedra")) {
			if(opcaoComputador.equals("tesoura"))
				Pontuar(j1);
			else
				Pontuar(j2);	
		}
		else if(opcaoJogador.equals("tesoura")) {
			if(opcaoComputador.equals("papel"))
				Pontuar(j1);
			else
				Pontuar(j2);
		}
		else if(opcaoJogador.equals("papel")) {
			if(opcaoComputador.equals("pedra"))
				Pontuar(j1);
			else
				Pontuar(j2);
		}
		
		System.out.println("Placar atual: "+j1.getPontuacao()+"x"+j2.getPontuacao());
		ChecarFimDeJogo(j1, j2);
	}
	
	
	public static void Pontuar(Jogador j) {
		j.setPontuacao(j.getPontuacao()+1);
	}
	
	
	public static void ChecarFimDeJogo(Jogador j1, Jogador j2) {
		if(j1.getPontuacao() == FIM_DO_JOGO) {
			System.out.println(j1.getNome()+" venceu!");
			Jogo.finalizaJogo();
		}	
		else if(j2.getPontuacao() == FIM_DO_JOGO) {
			System.out.println(j2.getNome()+" venceu!");
			Jogo.finalizaJogo();
		}
	}

}
