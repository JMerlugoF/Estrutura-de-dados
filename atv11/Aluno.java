package atv11;

public class Aluno {

	private int matricula;
	private String nome;
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}
	
}
