package aula11_10_22;

import java.util.ArrayList;

public class PlayHinos implements IPlay {

	private ArrayList<Hino> listaHino;
	private int indice;
	
	public PlayHinos() {
		this.listaHino = new ArrayList<Hino>();
		indice = 0;
	}
	
	public void addHino(Hino h) {
		listaHino.add(h);
	}
	
	@Override
	public void start() {
		System.out.println("Tocando o hino do" + listaHino.get(indice).getNomeTime());
	}

	@Override
	public void stop() {
		System.out.println("Hino pausado.");
	}

	@Override
	public void next(int quantidade) {
		System.out.println("Passando para o próximo hino...");
		indice++;
	}

	@Override
	public void back(int quantidade) {
		System.out.println("Voltando para o hino anterior...");
		indice--;
	}

	@Override
	public void pause() {
		System.out.println("Reprodução de hinos interrompida.");
		indice=0;
	}

	@Override
	public String fabricante() {
		return "Gabriel Silveira";
	}

}
