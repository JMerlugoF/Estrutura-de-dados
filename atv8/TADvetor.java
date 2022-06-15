import java.util.Arrays;
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
            System.out.println(i+"  |  "+this.vetInt[i]);
        }
    }

    public void ordenarVetor(){
        Arrays.sort(vetInt);
    }

    public int buscaBinariaIterativa(int element){
        int inicio = 0;
        int fim = tamanho(), meio;
        while(inicio <= fim ){
            meio = (inicio + fim) / 2;
            if(vetInt[meio] == element){
                return meio;
            } else if(vetInt[meio] > element){
                fim = meio - 1;
            } else{
                inicio = meio + 1;
            }
        }
        return 0;

    }

    public int buscaBinariaRecursiva(int inicio, int element, int fim){
        if(inicio >= fim)
        return 0;
        
        int meio = (fim - inicio)/2;
        if(vetInt[meio] < element){
            return buscaBinariaRecursiva(meio + 1, element, fim);
        } else if(vetInt[meio] > element){
            return buscaBinariaRecursiva(inicio, element, meio - 1);
        } else{ 
            return meio;
        }
    }

    public void preencherVetor(int quantidadeDeInts){
        Random random = new Random();
        for(int i = 0; i < quantidadeDeInts; i++){
            add(random.nextInt(2000));
        }
    }

}