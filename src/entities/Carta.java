package entities;

public abstract class Carta {
	
	protected String nomeCarta;
	protected int poder;
	protected static int cartasJogadas = 0;
	
	public Carta(String nomeCarta, int poder) {
		this.nomeCarta = nomeCarta;
		this.poder = poder;
	}

	public String getNome() {
		return nomeCarta;
	}

	public double getPoder() {
		return poder;
	}

	public static int getCartasJogadas() {
		return cartasJogadas;
	}

	@Override
	public String toString() {
		return "Nome da carta" + nomeCarta + "| Poder: " + poder;
	}
	
	public abstract void jogar(Jogador atacante, Jogador defensor);
}