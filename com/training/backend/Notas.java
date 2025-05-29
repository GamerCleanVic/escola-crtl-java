package com.training.backend;

public class Notas {
	private double trabalho;
	private double tarefa;
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double soma;
	private double media;
	private double finalNota;
	private double rehDaReh;
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double mediaDoAluno(double media) {
		soma = n1 + n2 + n3 + n4 + trabalho + tarefa;
		this.media = soma / 4.0;
		setMedia(this.media);
		return getMedia();
	}
}
