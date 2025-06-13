package com.training.app;

import javax.swing.*;

import com.training.backend.Aluno;

public class App {
	public static void main(String[] args) {
		Aluno al1 = new Aluno();
		
		al1.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N1: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N2: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N3: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota N4: "));
		al1.setN1(n1);
		al1.setN1(n2);
		al1.setN1(n3);
		al1.setN1(n4);
		al1.somar(n1, n2, n3, n4);		
		
		boolean auxVetor = true;
		if(Double.isNaN(al1.getN1()) || Double.isNaN(al1.getN2()) || Double.isNaN(al1.getN3()) 
				|| Double.isNaN(al1.getN4())) {
			auxVetor = false;
		}
		
			if(al1.getNome() == null || al1.getNome().isEmpty() || auxVetor == false) {
				JOptionPane.showMessageDialog(null, "Não pode deixar o campo vazio!"
						, "Preencha a caixa de texto", JOptionPane.WARNING_MESSAGE);
			}else {			
				JOptionPane.showMessageDialog(null, "Nome: "+al1.getNome()+"\nMédia: "+al1.mediaDoAluno()
				, "Resultado", (al1.mediaDoAluno() < 7) ? JOptionPane.WARNING_MESSAGE : 
					JOptionPane.INFORMATION_MESSAGE);
				
				if(al1.mediaDoAluno() < 0 || al1.somar(n1, n2, n3, n4) <= 0) {
					JOptionPane.showMessageDialog(null, "\nMédia zero ou menor: "+al1.mediaDoAluno()
					, "Reprovado", JOptionPane.ERROR_MESSAGE);
				}else if(al1.mediaDoAluno() >= 7){
					JOptionPane.showMessageDialog(null, "\nAluno aprovado! Média: "
					+al1.mediaDoAluno()
					, "Aprovado", JOptionPane.INFORMATION_MESSAGE);
				}else if(al1.mediaDoAluno() < 5){
					JOptionPane.showMessageDialog(null, "\nAluno reprovado! Média < 5: "
					+al1.mediaDoAluno()
					, "Reprovado", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "\nPor quanto fazer a final: "
							+al1.porQuantoFazerFinal()
							, "Na Final", JOptionPane.WARNING_MESSAGE);
				}
			}
	}
}
