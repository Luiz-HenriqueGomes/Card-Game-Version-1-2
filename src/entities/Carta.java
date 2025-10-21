package entities;

public abstract class Carta {
	
	protected String nomeCarta;
	protected double poder;
	protected static int cartasJogadas;
	
	public Carta(String nome, double poder) {
		this.nomeCarta = nome;
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
		return "Carta [nome=" + nomeCarta + ", poder=" + poder + "]";
	}
	
	public abstract void jogar(Jogador atacante, Jogador defensor);
}