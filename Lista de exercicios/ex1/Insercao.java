public class Insercao{
    
    public static void insercao(TADvetor vet1, TADvetor vet2, TADvetor vetJ){
        
        for(int i = 0; i < vet1.tamanho(); i++){
            for(int j = 0; j < vet2.tamanho(); j++){
                if(vet1.buscaElement(i) == vet2.buscaElement(j)){
                    vetJ.add(vet1.buscaElement(i));
                }
            }
        }
        
    }
    
}