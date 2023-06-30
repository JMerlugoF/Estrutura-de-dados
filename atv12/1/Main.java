import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = entrada.next();

        PilhaVet pilha = new PilhaVet(palavra.length());
        System.out.println(pilha.palindromo(palavra));

        entrada.close();
    }
}
