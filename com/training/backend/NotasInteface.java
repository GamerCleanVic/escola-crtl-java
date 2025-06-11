package com.training.backend;

public interface NotasInteface {
	public double trabalho = 0;
	public double tarefa = 0;
	public double n1 = 0;
	public double n2 = 0;
	public double n3 = 0;
	public double n4 = 0;
	public double soma = 0;
	public double media = 0;
	public double faltandoPraFinal = 0;
	public double finalNota = 0;
	public double rehDaReh = 0;
	
	public void setTrabalho(double trabalho);
	public double getTrabalho();
	
	public void setTarefa(double tarefa);
	public double getTarefa();
	
	public void setN1(double n1);
	public double getN1();
	
	public void setN2(double n2);
	public double getN2();
	
	public void setN3(double n3);
	public double getN3();
	
	public void setN4(double n4);
	public double getN4();
	
	public double somar(double n1, double n2, double n3, double n4);
	
	public void setMedia(double media);
	public double getMedia();
	
	public double mediaDoAluno();
	
	public double porQuantoFazerFinal();	
	
	public void setFinalNota(double finalNota);
	public double getFinalNota();
	
	public void setRehDaReh(double rehDaReh);
	public double getRehDaReh();
}
