package com.training.app;

import com.training.backend.Aluno;

public class AppTest{
	public static void main (String[] args) {
		Aluno al1 = new Aluno();
		al1.setNome("Pedro");
		al1.setN1(9.2);
		System.out.println("Nome: "+al1.getNome()+"\nNota: "+al1.getN1());
	}
}
