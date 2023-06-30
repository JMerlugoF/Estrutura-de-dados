package atv16;

public class Noh {
    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    Noh(int v) {
        this.valor = v;
    }

    public boolean ehFolha() {
        return this.esq == null && this.dir == null;
    }

    public boolean filhosSoNaDireita() {
        return (this.esq == null && this.dir != null);
    }
    
    public boolean filhosSoNaEsquerda() {
        return (this.esq != null && this.dir == null);
    }
}