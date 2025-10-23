package entities;

public class CartaDefesa extends Carta {

	public CartaDefesa(String nomeCarta, int poder) {
		super(nomeCarta, poder);
	}

	@Override
	public void jogar(Jogador atacante, Jogador inimigo) {
		Carta.cartasJogadas++;
		atacante.defender(poder);
	
		
	}
		
}