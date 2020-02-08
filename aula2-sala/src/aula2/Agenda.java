package aula2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	int tamanho;
	List<Contato> contato = new ArrayList<>();

	public Agenda(int tamanho) {
		this.tamanho = tamanho;
	}

	public void armazenaPessoa(String nome, int idade, float altura) {
		if (controle()) {
			this.contato.add(new Contato(nome, idade, altura));
		} else {
			System.out.println("Agenda cheia! :( ");
		}
	}

	public void removePessoa(String nome) {
		int indexPessoa = buscaPessoa(nome);
		if(indexPessoa >= 0) {
			this.contato.remove(indexPessoa);
		}else {
			System.out.println("Pessoa não encontrada!");
		}
	}
	
	private int buscaPessoa(String nome) {
		for(int i = 0; i < this.contato.size(); i++) {
			if(contato.get(i).getNome() == nome) {
				return i;
			}
		}
		return -1;
	}
	
	private Contato buscaPessoa(int index) {
		if(index > this.tamanho) {
			return null;
		}
		Contato pessoa = this.contato.get(index);
		if(pessoa != null) {
			return pessoa;
		}
		return null;
	}
	
	public void imprimeAgenda() {
		this.contato.forEach(x -> {
			x.print("Nome", x.getNome());
			x.print("Idade", String.valueOf(x.getIdade()));
			x.print("Altura", String.valueOf(x.getAltura()));
		});
	}
	
	public void imprimePessoa(int index) {
		Contato pessoa = new Contato();
		pessoa = buscaPessoa(index);
		if(pessoa != null) {
			pessoa.print("Nome", pessoa.getNome());
			pessoa.print("Idade", String.valueOf(pessoa.getIdade()));
			pessoa.print("Altura", String.valueOf(pessoa.getAltura()));		}
	}
	
	

	public boolean controle() {
		if (this.contato.size() == this.tamanho) {
			return false;
		} else {
			return true;
		}
	}
}
