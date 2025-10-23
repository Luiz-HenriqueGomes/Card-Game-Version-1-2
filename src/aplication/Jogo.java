package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.Carta;
import entities.CartaAtaque;
import entities.CartaDefesa;
import entities.Jogador;

public class Jogo {
	
	private Jogador jogador1;
	private Jogador jogador2;
	private List<Carta> monteDeCartas;
	
	public Jogo(Jogador jogador1, Jogador jogador2, List<Carta> monteDeCartas) {
		this.jogador1 = new Jogador("Jogador 1");
		this.jogador2 = new Jogador("Jogador 2");;
		this.monteDeCartas = new ArrayList<>();
		
		monteDeCartas.add(new CartaAtaque("Soco Mortal", 30));
		monteDeCartas.add(new CartaAtaque("Ataque da Garça",10));
		monteDeCartas.add(new CartaAtaque("Kamehameha", 40));
		monteDeCartas.add(new CartaAtaque("Chute Baixo", 20));
		
		monteDeCartas.add(new CartaDefesa("Casco de tartaruga", 20));
        monteDeCartas.add(new CartaDefesa("Toca da rapoza", 15));
        monteDeCartas.add(new CartaDefesa("Bloqueio Mortal", 10));
	}
	
	public void iniciarPartida() {
		Random sorteador = new Random(7);
		
		while(jogador1.estaVivo() && jogador2.estaVivo() && Carta.getCartasJogadas() <= 30) {
			int indiceSorteador = sorteador.nextInt(monteDeCartas.size());
			Carta cartaSorteada = monteDeCartas.get(indiceSorteador);
			
			cartaSorteada.jogar(jogador1, jogador2); //POLIMORFISMO ROLANDO AQUI!!!
			if(jogador2.estaVivo()) {
				indiceSorteador = sorteador.nextInt(monteDeCartas.size()); //GARANTE AQUI NESSAS 
				cartaSorteada = monteDeCartas.get(indiceSorteador); // 2 LINHAS QUE O JOGADOR 2 IRÁ JOGAR COM CARTAS DIFERENTES
				cartaSorteada.jogar(jogador2, jogador1);
			}
			exibirStatusRodada(cartaSorteada, cartaSorteada);
		}
	}
	
	private void exibirStatusRodada(Carta cartaDoJ1, Carta cartaDoJ2) {
		if(cartaDoJ1 instanceof CartaAtaque) {
			System.out.println("Carta do player 1: ATAQUE ");
		}
		else {
			System.out.println("Cartado player 1: DEFESA ");
		}
		
		if(cartaDoJ2 instanceof CartaAtaque) {
			System.out.println("Carta do player 2: ATAQUE ");
		}
		else {
			System.out.println("Carta do player 2: DEFESA ");
		
		}
	}
	
	
}
