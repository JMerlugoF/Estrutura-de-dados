import java.util.Random;

public class TADvetor{
    private int[] vetInt;
    private int indice = 0;
    public static float start;
    
    public TADvetor(int tamanho){
        this.vetInt = new int[tamanho];
    }
    
    public void add(int valor){
        vetInt[this.indice] = valor;
        indice++;
    }
    
    public int tamanho(){
        return indice;
    }
    
    public boolean contem(int element){
        for(int i = 0; i < indice; i++){
            if(element == this.vetInt[i]){
                return true;
            }
        }
    return false;
    }
    
    public void listarVetor(){
        for(int i = 0; i < this.indice; i++){
            System.out.println(this.vetInt[i]);
        }
    }

    public void preencherVetor(int quantidadeDeInts){
        Random random = new Random();
        for(int i = 0; i < quantidadeDeInts; i++){
            add(random.nextInt(2000));
        }
    }

    public void bubble_sort(){
        for (int i = 0; i < this.tamanho(); i++)
        for (int j = 0; j < this.tamanho()-1; j++)
        if (this.vetInt[j] > this.vetInt[j+1]) {
        int aux = this.vetInt[j];
        this.vetInt[j] = this.vetInt[j+1];
        this.vetInt[j+1] = aux;
        }
        }

    public void selection_sort(){
        for (int i = 0; i < tamanho(); i++) {
        int menor = i;
        for (int j = i+1; j < tamanho(); j++)
        if (this.vetInt[j] < this.vetInt[menor])
        menor = j;
        int aux = vetInt[i];
        this.vetInt[i] = this.vetInt[menor];
        this.vetInt[menor] = aux;
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < tamanho(); i++) {
        int chave = this.vetInt[i];
        int j = i - 1;
        while (j >= 0 && chave < this.vetInt[j]) {
        this.vetInt[j + 1] = this.vetInt[j];
        j--;
        }
        this.vetInt[j + 1] = chave;
        }
    }

    
}