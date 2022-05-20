public class Main {
    public static void main(String args[]){

        Lista listaAlunos = new LDE();

        Aluno _12345 = new Aluno(2134123,"Joao", 19);
        Aluno _12346 = new Aluno(2134123,"Jose", 20);
        Aluno _12347 = new Aluno(7653453,"Maria", 17);
        Aluno _12348 = new Aluno(2654142,"Eduarda", 18);

        System.out.println(_12345.equals(_12346));

        System.out.println("\n");

        System.out.println(listaAlunos.estahVazia());

        System.out.println("\n");

        listaAlunos.insereInicio(_12345);
        listaAlunos.insereInicio(_12346);
        listaAlunos.insereFim(_12348);
        listaAlunos.insereFim(_12347);

        listaAlunos.listarcrescente();

        System.out.println("\n");

        listaAlunos.listardecrescente();

        System.out.println("\n");

        System.out.println(listaAlunos.tamanho());

        System.out.println("\n");

        listaAlunos.remove(_12346);

        System.out.println(listaAlunos.estahVazia());

        System.out.println("\n");

        System.out.println(listaAlunos.tamanho());

        System.out.println("\n");

        listaAlunos.listarcrescente();

        System.out.println("\n");

        listaAlunos.listardecrescente();

        System.out.println("\n");
    }
}
