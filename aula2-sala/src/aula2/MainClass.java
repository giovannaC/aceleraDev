package aula2;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
//		Aluno aluno = new Aluno("Giovanna");
//		Aluno aluno2 = new Aluno();
//
//		aluno.salvar(aluno2);
//		aluno.setCpf("31939439439");
//		
//		aluno.salvar();
		//exercicio1();
		//exercicio2(3);
		exercicio3(0, 5, 3, 0);
		
	}
	
	public static void exercicio1() {
		String dataNascimento = "10/01/2013";

		String nome = "Olaf";
		
		float altura = 1.62F;
		
		Pessoa olaf = new Pessoa(nome, dataNascimento, altura);
		
		olaf.showPessoa();
		
		System.out.println("Idade dnv: "+ olaf.getIdade());

	}
	
	public static void exercicio2(int tamanho) {
		Agenda agenda = new Agenda(tamanho);
		
		agenda.armazenaPessoa("Giovanna", 25, 1.61F);
		agenda.armazenaPessoa("Manuella", 25, 1.63F);
		agenda.armazenaPessoa("Amanda", 30, 1.65F);
		
		agenda.imprimeAgenda();

		System.out.println("Remover eu: ");
		agenda.removePessoa("Giovanna");
		agenda.imprimeAgenda();
		
		System.out.println("Adiciona Marta: ");
		agenda.armazenaPessoa("Marta", 60, 1.65F);
		agenda.imprimeAgenda();
		
		System.out.println("Tenta me adicionar denovo: ");
		agenda.armazenaPessoa("Giovanna", 25, 1.61F);
		
		agenda.imprimeAgenda();
	}
	
	public static void exercicio3(int andarAtual, int totalAndar, int capacidadeTotal, int pessoasAtual) {
		Elevador elevador = new Elevador(andarAtual, totalAndar, capacidadeTotal, pessoasAtual);
		System.out.println("'A' tenta entrar no elevador.");
		elevador.entra();
		System.out.println("'B' tenta entrar no elevador.");
		elevador.entra();
		System.out.println("'C' tenta entrar no elevador.");
		elevador.entra();
		System.out.println("'D' tenta entrar no elevador.");
		elevador.entra();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		System.out.println("'A' saiu do elevador.");
		elevador.sair();
		System.out.println("'B' saiu do elevador.");
		elevador.sair();
		System.out.println("'C' saiu do elevador.");
		elevador.sair();
		System.out.println("'D' saiu do elevador.");
		elevador.sair();
		System.out.println("'D' tenta entrar no elevador na vdd: ");
		elevador.entra();
		
	}

}