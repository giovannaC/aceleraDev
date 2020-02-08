package aula2;

public class Elevador {
	private int andarAtual;
	private int andarTotal;
	private int capacidadeTotal;
	private int pessoasAtual;
	
	public Elevador (int andarAtual, int andarTotal, int capacidadeTotal, int pessoasAtual) {
		this.andarAtual = andarAtual;
		this.andarTotal = andarTotal;
		this.capacidadeTotal = capacidadeTotal;
		this.pessoasAtual = pessoasAtual;
	}
	
	public void entra() {
		if(this.pessoasAtual+1 > this.capacidadeTotal) {
			System.out.println("O elevador já atingiu sua capacidade total!");
		}else {
			System.out.println("Entrou no elevador.");
			this.pessoasAtual += 1;
		}
	}
	
	public void sair() {
		if(this.pessoasAtual == 0) {
			System.out.println("Amadah? Não tem ninguém para sair do elevador.");
		}else {
			System.out.println("Saiu do elevador.");
			this.pessoasAtual -= 1;
		}
	}
	
	public void sobe() {
		if(this.andarAtual == this.andarTotal) {
			System.out.println("Já estamos no último andar.");
		}else {
			System.out.println("Subindo.");
			this.andarAtual += 1;
		}
	}
	
	public void desce() {
		if(this.andarAtual == 0) {
			System.out.println("Já estamos no térreo e não tem subsolo.");
		}else {
			System.out.println("Descendo.");
			this.andarAtual -= 1;
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndarTotal() {
		return andarTotal;
	}

	public void setAndarTotal(int andarTotal) {
		this.andarTotal = andarTotal;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getPessoasAtual() {
		return pessoasAtual;
	}

	public void setPessoasAtual(int pessoasAtual) {
		this.pessoasAtual = pessoasAtual;
	}
	
	
	
}
