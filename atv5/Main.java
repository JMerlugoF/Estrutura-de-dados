public class Main{
    public static void main(String[] args) {
        
        Lista listaNotas = new LSE();

        Aluno _12345 = new Aluno("Joao", 19);
        Aluno _12346 = new Aluno("Jose", 20);
        Aluno _12347 = new Aluno("Maria", 17);
        Aluno _12348 = new Aluno("Eduarda", 18);

        System.out.println(listaNotas.estahVazia());

        System.out.println("\n");

        listaNotas.insereInicio(_12345);
        listaNotas.insereInicio(_12346);
        listaNotas.insereFim(_12348);

        listaNotas.listar();

        System.out.println("\n");

        System.out.println(listaNotas.tamanho());

        System.out.println("\n");

        listaNotas.remove(_12346);

        System.out.println(listaNotas.estahVazia());

        System.out.println("\n");
        
        System.out.println(listaNotas.tamanho());

        System.out.println("\n");

        listaNotas.listar();
    }
}