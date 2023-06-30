public class PilhaLista implements IPilha {
    private Noh topo;
    private int numElement;

    public PilhaLista (){ //construtor
    this.topo = null;
    }

    public boolean Push(Object info){ //empilha
        Noh novo = new Noh(info);
        if (this.isEmpty())
        topo = novo;
        else {
        novo.setProx(topo);
        topo = novo;
        }
        numElement++;
        return true;
    }

    public Object top(){
        return this.topo;
    }

    public Object Pop(){ //desempilha
        Object info = null;
        if (!this.isEmpty()){
        info = topo.getInfo();
        topo = topo.getProx();
        }
        numElement--;
        return info;
    }

    public boolean isEmpty(){
        if(topo == null){
            return true;
        }
        return false;
    }

    public int size(){
        return this.numElement;
    }
}