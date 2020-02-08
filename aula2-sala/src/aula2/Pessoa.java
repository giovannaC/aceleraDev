package aula2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private float altura;
	
	public Pessoa (String nome, String dataNascimento, float altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
	
	public Pessoa () {
		
	}
	
	public void showPessoa() {
		print("Nome", this.nome);
		print("Data de Nascimento", this.dataNascimento.toString());
		print("Altura",String.valueOf(this.altura));
		print("Idade", String.valueOf(getIdade()));
	}
	
	public int getIdade() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date hoje = new Date();
		Date dataNascimentoAux;
		int idade = 0;
		try {
		
			dataNascimentoAux = formato.parse(dataNascimento);
		
			idade = hoje.getYear() - dataNascimentoAux.getYear();
			if(dataNascimentoAux.getMonth() + 1 > hoje.getMonth() + 1) {
				idade = idade - 1;
			}else if(dataNascimentoAux.getMonth() == hoje.getMonth()) {
				if(dataNascimentoAux.getDate() > hoje.getDate()) {
					idade = idade - 1;
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	private void print(String attr, String valor) {
		System.out.println(attr + ": " + valor);
	}
	
	
	
}
