public class Main
{
	public static void main(String[] args) {
	    int tamanho10 = 10;
        int tamanho100 = 100;
        int tamanho1000 = 1000;
        int tamanho10000 = 10000;

	    TADvetor vetor10 = new TADvetor(10);
	    TADvetor vetor100 = new TADvetor(100);
        TADvetor vetor1000 = new TADvetor(1000);
        TADvetor vetor10000 = new TADvetor(10000);
        
        vetor10.preencherVetor(tamanho10);
        vetor100.preencherVetor(tamanho100);
        vetor1000.preencherVetor(tamanho1000);
        vetor10000.preencherVetor(tamanho10000);

        vetor10.bubble_sort();
        vetor10.selection_sort();
        vetor10.insertion_sort();

        vetor100.bubble_sort();
        vetor100.selection_sort();
        vetor100.insertion_sort();

        vetor1000.bubble_sort();
        vetor1000.selection_sort();
        vetor1000.insertion_sort();
	
        vetor10000.bubble_sort();
        vetor10000.selection_sort();
        vetor10000.insertion_sort();

        vetor10.listarVetor();
        System.out.println("\n");
        vetor100.listarVetor();
        System.out.println("\n");
        vetor1000.listarVetor();
        System.out.println("\n");
        vetor10000.listarVetor();
    
    }
}