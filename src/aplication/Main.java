package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Carta;
import entities.CartaAtaque;
import entities.CartaDefesa;
import entities.Jogador;

public class Main {

	public static void main(String[] args) {
		List<Jogador> listaPlayers = new ArrayList<>();
		List<Carta> listaCards = new ArrayList<>();
		
		criarJogador(listaPlayers);
		cartasAtaque(listaCards);
		cartasDefesa(listaCards);
	}
	
	private static void criarJogador(List<Jogador> listaPlayers) {
		listaPlayers.add(new Jogador("Jogador1"));
		listaPlayers.add(new Jogador("Jogador2"));
	}
	
	private static void cartasAtaque(List<Carta> listaCards) {
		listaCards.add(new CartaAtaque("Soco Mortal",30));
		listaCards.add(new CartaAtaque("Ataque da Garça",10));
		listaCards.add(new CartaAtaque("Kamehameha",40));
		listaCards.add(new CartaAtaque("Chute Baixo",20));
		
	}
	
	private static void cartasDefesa(List<Carta> listaCards) {
		listaCards.add(new CartaDefesa("Casco de tartaruga",20));
		listaCards.add(new CartaDefesa("Toca da rapoza",15));
		listaCards.add(new CartaDefesa("Bloqueio Mortal",10));
	}

	
	
	
	
	
	
	
	
	
	

}