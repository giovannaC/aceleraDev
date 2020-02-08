package aula2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contato {
	
	private String nome;
	private int idade;
	private float altura;
	
	public Contato (String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Contato () {
		
	}
	
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void print(String attr, String valor) {
		System.out.println(attr + ": " + valor);
	}
	
	
	
}
