package entities;

public class CartaAtaque extends Carta {

	public CartaAtaque(String nome, double poder) {
		super(nome, poder);

	}

	@Override
	public void jogar(Jogador atacante, Jogador inimigo) {
		Carta.cartasJogadas++;
		atacante.atacar(poder);
		
		
	}

}