package Listas;

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
        while (p != null && p.getInfo() != element) // busca
            p = p.getProx();
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (p.getAnt() == null&&p.getProx() == null) {
        	inicio=null;
        	fim=null;
        }else if (p.getAnt() == null) { //info estah no inicio
            inicio = p.getProx();
            inicio.setAnt(null);
        } else if (p.getProx() == null) { // info estah no fim
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else { // info estah no meio
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;

    }

    public int tamanho() {

        Noh p = inicio;
        int cont = 0;

        while (p != null) { // busca
            p = p.getProx();
            cont++;
        }
        return cont;

    }

    public void listarCrescente() {

        Noh p = this.inicio;
        while (p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getProx();
        }

    }

    public void listarDecrescente() {

        Noh p = this.fim;
        while (p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getAnt();
        }

    }

    public Object getObject(int x) {

        Noh p = this.inicio;

        for (int i = 0; i < x; i++) {
            p = p.getProx();
        }
        return p.getInfo();
    }

    public boolean setObject(Object element, Object novoElement) {

        Noh p = inicio;
        Noh novo = new Noh(novoElement);

        while (p != null && p.getInfo() != element) // busca
            p = p.getProx();
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (p.getAnt() == null&&p.getProx() == null) {
        	inicio=null;
        	fim=null;
        	insereInicio(novoElement);
        }else if (p.getAnt() == null) { //info estah no inicio
        	novo.setProx(p.getProx());
            p.getProx().setAnt(novo);
            inicio = novo;
            inicio.setAnt(null);
        } else if (p.getProx() == null) { // info estah no fim
            p.getAnt().setProx(novo);
            novo.setAnt(p.getAnt());
            novo.setProx(null);
            fim = novo;
        } else { // info estah no meio
            p.getAnt().setProx(novo);
            novo.setAnt(p.getAnt());
            p.getProx().setAnt(novo);
            novo.setProx(p.getProx());
        }
        return true;

    }
}