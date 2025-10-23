package entities;

public class CartaAtaque extends Carta {

	public CartaAtaque(String nomeCarta, int poder) {
		super(nomeCarta, poder);
	}

	@Override
	public void jogar(Jogador atacante, Jogador inimigo) {
		Carta.cartasJogadas++;
		inimigo.atacar(this.poder);
		
		
	}

}