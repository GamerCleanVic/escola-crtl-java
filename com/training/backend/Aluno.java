package com.training.backend;

public class Aluno extends Pessoa implements NotasInteface{
	private double trabalho;
	private double tarefa;
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double soma;
	private double media;
	private double faltandoPraFinal;
	private double finalNota;
	private double rehDaReh;		
	
	@Override
	public double getTrabalho() {
		return trabalho;
	}
	@Override
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	@Override
	public double getTarefa() {
		return tarefa;
	}
	@Override
	public void setTarefa(double tarefa) {
		this.tarefa = tarefa;
	}
	
	@Override
	public double getN1() {
		return n1;
	}
	@Override
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	@Override
	public double getN2() {
		return n2;
	}
	@Override
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	@Override
	public double getN3() {
		return n3;
	}
	@Override
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	@Override
	public double getN4() {
		return n4;
	}
	@Override
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	@Override
	public double getMedia() {
		return media;
	}
	@Override
	public void setMedia(double media) {
		this.media = media;
	}	
	
	@Override
	public double getFinalNota() {
		return finalNota;
	}
	@Override
	public void setFinalNota(double finalNota) {
		this.finalNota = finalNota;
	}
	
	@Override
	public double getRehDaReh() {
		return rehDaReh;
	}
	@Override
	public void setRehDaReh(double rehDaReh) {
		this.rehDaReh = rehDaReh;
	}
	
	@Override
	public double somar(double n1, double n2, double n3, double n4){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		return (this.n1 + this.n2 + this.n3 + this.n4);
	}
	
	@Override
	public double mediaDoAluno() {
		this.soma = somar(this.n1, this.n2, this.n3, this.n4) + (this.trabalho + this.tarefa);
		double auxMedia = this.soma / 4;
		setMedia(auxMedia);
		return getMedia();
	}
	
	@Override
	public double porQuantoFazerFinal() {		
		faltandoPraFinal = ((-getMedia())+10.0);
		return faltandoPraFinal;
	}
}