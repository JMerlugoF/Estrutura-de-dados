public class TADvetor {
    private int vet[];
    private int indice = 0;
    
    public TADvetor(int tamanho){
        this.vet = new int[tamanho];
    }
    
    public void add(int element){
        this.vet[indice] = element;
        indice++;
    }
    
    public int tamanho(){
        return indice;
    }
    
    public int buscaElement(int indice){
                return vet[indice];
    }
    
    public void listarVetor(){
        for(int i = 0; i < tamanho(); i++){
            System.out.println("posição"+i+": "+vet[i]);
        }
    }
    
    public boolean contem(int element){
        for(int i = 0; i < indice; i++){
            if(element == this.vet[i]){
                return true;
            }
        
    }
        return false;
    }
}