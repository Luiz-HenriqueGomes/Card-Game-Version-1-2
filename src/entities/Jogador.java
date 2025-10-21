package entities;

public class Jogador implements iJogavel{
	
	private String nome;
	private int vida = 2;
	private int defesa = 50;
	
	public Jogador(String nome, int vida, int defesa) {
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}


	public int getVida() {
		return vida;
	}

	public int getDefesa() {
		return defesa;
	}
	
	@Override
	public void atacar(Carta poder) {
		this.atacar(poder);;
	}
	@Override
	public void defender(Carta defesa) {
		this.defender(defesa); 
	}

	@Override
	public boolean estaVivo() {
		if(this.vida >= 0) {
		return true;
		}
		return false;
	}

	public void atacar(double poder) {
		
		
	}
}