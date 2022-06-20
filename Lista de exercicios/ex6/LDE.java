public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object element) {

        Noh novo = new Noh(element);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }

    }

    public void add_ordenado(int element){
        Noh novo = new Noh(element);
        Noh p = this.inicio;
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            {
            if((int)novo.getInfo() >= (int)p.getInfo()){
                p = p.getProx();
            } else {
                novo.setProx(novo);
            }
            }
        }
    }

    public void insereFim(Object element) {

        Noh novo = new Noh(element);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }


    public boolean estahVazia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public boolean remove(Object element) {

        Noh p = inicio;
        while (p != null && p.getInfo() != element) //busca
            p = p.getProx();
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (p.getAnt() == null) { //info estah no inicio
            inicio = p.getProx();
            inicio.setAnt(null);
        } else if (p.getProx() == null) { //info estah no fim
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else { //info estah no meio
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;

    }

    public int tamanho() {

        Noh p = inicio;
        int cont = 0;

        while (p != null) { //busca
            p = p.getProx();
            cont++;
        }
        return cont;

    }

    public void listarcrescente() {

        Noh p = this.inicio;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProx();
        }

    }

    public void listardecrescente() {

        Noh p = this.fim;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnt();
        }

    }

    public int nroPares(){
        Noh p = this.inicio;
        int cont = 0;
        for(int i = 1; i <= tamanho(); i++){
            if((int)p.getInfo()%2 == 0){
                cont++;
            }
            p = p.getProx();
        }
        return cont;
    }

}