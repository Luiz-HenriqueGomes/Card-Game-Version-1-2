package entities;

public class CartaDefesa extends Carta {

	public CartaDefesa(String nome, double poder) {
		super(nome, poder);
	
	}

	@Override
	public void jogar(Jogador atacante, Jogador inimigo) {
		Carta.cartasJogadas++;
		inimigo.defender(poder);
	
		
	}
		
}