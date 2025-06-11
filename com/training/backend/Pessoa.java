package com.training.backend;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;
	private String loginAluno;
	private String loginProfessor;
	private String senha;
	private int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	public String getLoginAluno() {
		return loginAluno;
	}
	public void setLoginAluno(String loginAluno) {
		this.loginAluno = loginAluno;
	}
	public String getLoginProfessor() {
		return loginProfessor;
	}
	public void setLoginProfessor(String loginProfessor) {
		this.loginProfessor = loginProfessor;
	}
	public String getSenha() {
		return senha;
	}	
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
