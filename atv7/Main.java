public class Main
{
	public static void main(String[] args) {
	    int tamanho = 1000;
	    VetInteiros vetor = new VetInteiros(tamanho);
	    vetor.preencherVetor(tamanho);
		//vetor.listarVetor();
		//System.out.println("\n\n");
		float start = System.nanoTime();
		System.out.println(vetor.buscarOmaiorRecursivo(0,0));
		float end = System.nanoTime();
		System.out.println((start-end)/1000);
		
	}


}
