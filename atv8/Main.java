public class Main
{
	public static void main(String[] args) {
	    int tamanho = 1000;
	    TADvetor vetor = new TADvetor(tamanho);
	    vetor.preencherVetor(tamanho);
        vetor.ordenarVetor();
        vetor.listarVetor();
        System.out.println("\n\n");
        System.out.println(vetor.buscaBinariaIterativa(567));
        System.out.println(vetor.buscaBinariaRecursiva(0, 567, vetor.tamanho()));
	}
}