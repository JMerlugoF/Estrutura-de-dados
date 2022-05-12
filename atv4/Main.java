public class Main{
    public static void main(String[] args) {
        
        Cadeira matematica = new Cadeira();
        Aluno _12345 = new Aluno("Joao", 19);
        Aluno _12346 = new Aluno("Jose", 20);
        Aluno _12347 = new Aluno("Maria", 17);
        Aluno _12348 = new Aluno("Eduarda", 18);

        matematica.adicionar(_12345);
        matematica.adicionar(_12346);
        matematica.adicionar(_12347);
        matematica.adicionar(_12348);

        System.out.println("\n"+matematica.tamanho());

        System.out.println("\n"+matematica.contem("Joao"));
        System.out.println("\n"+matematica.contem("Roberto"));

        System.out.println("\n"+matematica.cheio());

        matematica.remove("Jose");
        matematica.remove("Maria");

        matematica.listarVetor();
    }
}