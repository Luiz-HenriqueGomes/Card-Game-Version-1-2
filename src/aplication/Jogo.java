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

	public Jogo() {
		this.jogador1 = new Jogador("Jogador 1");
		this.jogador2 = new Jogador("Jogador 2");
		
		this.monteDeCartas = new ArrayList<>();

		monteDeCartas.add(new CartaAtaque("Soco Mortal", 30));
		monteDeCartas.add(new CartaAtaque("Ataque da Garça", 10));
		monteDeCartas.add(new CartaAtaque("Kamehameha", 40));
		monteDeCartas.add(new CartaAtaque("Chute Baixo", 20));

		monteDeCartas.add(new CartaDefesa("Casco de tartaruga", 20));
		monteDeCartas.add(new CartaDefesa("Toca da rapoza", 15));
		monteDeCartas.add(new CartaDefesa("Bloqueio Mortal", 10));
	}

	public void iniciarPartida() {
		Random sorteador = new Random();

		while (jogador1.estaVivo() && jogador2.estaVivo() && Carta.getCartasJogadas() <= 30) {

			// EXIBIR O STATUS INICIAL DA RODADA
			exibirStatusJogadores();

			Carta cartaJ1 = monteDeCartas.get(sorteador.nextInt(monteDeCartas.size()));

			String tipoCartaJ1;
			if (cartaJ1 instanceof CartaAtaque) {
				tipoCartaJ1 = "Ataque";
			} else {
				tipoCartaJ1 = "Defesa";
			}

			cartaJ1.jogar(this.jogador1, this.jogador2);
			System.out.println(this.jogador1.getNome() + " jogou (" + cartaJ1.getNome() + ") que vale "
					+ cartaJ1.getPoder() + " em " + this.jogador2.getNome() + ". [Tipo: " + tipoCartaJ1 + "]");
			if (this.jogador2.estaVivo()) {

				// EXIBIR O STATUS ATUALIZADO
				exibirStatusJogadores();

				// JOGADA DO JOGADOR 2
				Carta cartaJ2 = monteDeCartas.get(sorteador.nextInt(monteDeCartas.size()));

				String tipoCartaJ2;
				if (cartaJ2 instanceof CartaAtaque) {
					tipoCartaJ2 = "Ataque";
				} else {
					tipoCartaJ2 = "Defesa";
				}

				cartaJ2.jogar(this.jogador2, this.jogador1);
				System.out.println(this.jogador2.getNome() + " jogou (" + cartaJ2.getNome() + ") que vale "
						+ cartaJ2.getPoder() + " em " + this.jogador1.getNome() + ". [Tipo: " + tipoCartaJ2 + "]");
			}
		}

	}

	private void exibirStatusJogadores() {

		System.out.println();
		System.out.println("--- STATUS DOS JOGADORES ---");
		System.out.println(this.jogador1.getNome() + " -> Vida: " + this.jogador1.getVida() + " | Defesa: "
				+ this.jogador1.getDefesa());
		System.out.println(this.jogador2.getNome() + " -> Vida: " + this.jogador2.getVida() + " | Defesa: "
				+ this.jogador2.getDefesa());
		System.out.println("-------------------------------");
		System.out.println();

	}

}
