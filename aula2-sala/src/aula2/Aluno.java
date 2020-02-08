package aula2;

public class Aluno extends PessoaFisica{

	private String nome;
	private String matricula;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno() {

	}

	public Aluno salvar(Aluno aluno) {
		
		aluno.setMatricula("1234567");
		aluno.setNome(null);

		
		return null;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
