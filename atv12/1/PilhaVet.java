public class PilhaVet implements IPilha{
    private Object[] pilha;
    private int numElem;

    public PilhaVet (int tamanhoVetor){
    this.pilha = new Object[tamanhoVetor];
    this.numElem = 0;
    }

    public boolean Push(Object info){ //empilha
        if (this.numElem == pilha.length){
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object Pop(){ //desempilha
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public boolean isEmpty(){
        if(numElem-1 == this.pilha.length)
            return true;
        return false;
    }

    public int size(){
        return numElem;
    }

    public boolean palindromo(String palavra){
        String palavraInversa = "";
        for(int i = 0; i < pilha.length; i++){
            Push(palavra.charAt(i));
        }
        for(int j = pilha.length-1; j >= 0; j--){
            palavraInversa += pilha[j];
        }

        if(palavra.equals(palavraInversa)){
            return true;
        } else {
            return false;
        }
    }

    public void listar(int i) {
            System.out.println(pilha[i]);
    }
}