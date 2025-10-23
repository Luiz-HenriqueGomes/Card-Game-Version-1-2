package entities;

public class Jogador implements iJogavel {

	private String nome;
	private int vida;
	private int defesa;

	public Jogador(String nome) {
		this.nome = nome;
		this.vida = 2;
		this.defesa = 50;
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
	public void atacar(int poder) {
		this.defesa = this.defesa - poder;
		if (this.defesa < 0) {
			this.vida -= 1;
			this.defesa += 50;
		}
	}

	@Override
	public void defender(int poder) {
		this.defesa += poder;
	}

	@Override
	public boolean estaVivo() {
		if (this.vida > 0 || this.defesa > 0) {
			return true;
		}
		return false;
	}

}