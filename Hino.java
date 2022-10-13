package aula11_10_22;

public class Hino {

	private String nometime;
	private int duracao;

	public Hino(String nometime) {
		this.nometime = nometime;
	}

	public String getNomeTime() {
		return this.nometime;
	}
	
	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		if (duracao >= 0)
			this.duracao = duracao;
	}
}
