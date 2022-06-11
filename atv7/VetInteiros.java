import java.util.Random;

public class VetInteiros{
    private int[] vetInt;
    private int indice = 0;
    public static float start;
    
    public VetInteiros(int tamanho){
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

    //método iterativo para achar o maior numero
    public int buscarOmaiorIterativo(){
        int maior = 0;
        for(int i = 0; i < tamanho(); i++){
            if(vetInt[i] > maior){
                maior = vetInt[i];
            }
        }
        return maior;
    }

    // método recursivo pra achar o maior numero
    public int buscarOmaiorRecursivo(int maior, int i){
        if(i >= tamanho()-1){
            return maior;
        } else {
            if(vetInt[i] >= maior){
                maior = vetInt[i];
            }
            return buscarOmaiorRecursivo(maior, i + 1);
        }
    }

    public void preencherVetor(int quantidadeDeInts){
        Random random = new Random();
        for(int i = 0; i < quantidadeDeInts; i++){
            add(random.nextInt(2000));
        }
    }

}