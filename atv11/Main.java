package atv11;

public class Main {
	public static void main(String[] args) {
		
	FilaLista listaAlunos = new FilaLista();
	Aluno a1 = new Aluno(1233, "joao");
	Aluno a2 = new Aluno(1234, "maria");
	Aluno a3 = new Aluno(1235, "jose");
	Aluno a4 = new Aluno(1236, "eduarda");
	Aluno a5 = new Aluno(1237, "leticia");

	listaAlunos.add(a1);
	listaAlunos.add(a2);
	listaAlunos.add(a3);
	listaAlunos.add(a4);
	listaAlunos.remove();
	listaAlunos.remove();
	listaAlunos.add(a5);
	listaAlunos.imprimeList();	
	}
}
