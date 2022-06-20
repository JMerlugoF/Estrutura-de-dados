public class Main{
    public static void main(String args[]){
        TADvetor vetor1 = new TADvetor(5);
        TADvetor vetor2 = new TADvetor(5);
        vetor2.add(2);
        vetor2.add(3);
        vetor2.add(7);
        vetor2.add(8);
        vetor2.add(6);
        vetor1.add(2);
        vetor1.add(4);
        vetor1.add(5);
        vetor1.add(6);
        vetor1.add(7);
        TADvetor vetJ = new TADvetor(vetor1.tamanho()+vetor2.tamanho());
        
        vetor1.listarVetor();
        System.out.println("\n");
        vetor2.listarVetor();
        System.out.println("\n");
        vetJ.listarVetor();
        
        Insercao.insercao(vetor1, vetor2, vetJ);
        
        vetJ.listarVetor();
    }
}