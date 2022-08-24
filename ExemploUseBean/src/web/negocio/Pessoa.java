package web.negocio;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 8134174359605436243L;
	
	private String nome;
	private int idade;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
