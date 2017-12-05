package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	
	private static boolean gameOver = false;
	private static Jogador j1;
	private static Jogador j2;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {	
		prepararJogo();
	}
	
	
	public static void finalizaJogo() {
		gameOver = true;
	}

	public static void prepararJogo() {
		System.out.println("Digite o nome do primeiro jogador: ");
		String nomeJogador = scan.nextLine();
		System.out.println("Digite o nome do segundo jogador: ");
		String nomeComputador = scan.nextLine();
		
		j1 = new Jogador(nomeJogador);
		j2 = new Jogador(nomeComputador);
		
		iniciarJogo();
	}
	
	public static void iniciarJogo() {
		Random rand = new Random(System.currentTimeMillis());

		while(!gameOver) {
			boolean escolhaValida = false;
			String opcao = "";
			while(!escolhaValida) {
				System.out.println("Digite a sua opção: ");
				opcao = scan.nextLine();
				if(opcao.equals("pedra") || opcao.equals("papel") || opcao.equals("tesoura"))
					escolhaValida = true;
				else
					System.out.println("Opção inválida, tente de novo!");
			}
			
			j1.setJogadaAtual(opcao);
			
			int escolhaPC = rand.nextInt(3);
			if(escolhaPC == 0)
				j2.setJogadaAtual("pedra");
			else if(escolhaPC == 1)
				j2.setJogadaAtual("papel");
			else
				j2.setJogadaAtual("tesoura");
			
			
			System.out.println(j1.getNome()+" selecionou: "+j1.getJogadaAtual());
			System.out.println(j2.getNome()+" selecionou: "+j2.getJogadaAtual());
			Controlador.Comparar(j1, j2);
		}
	
	
	}
}
