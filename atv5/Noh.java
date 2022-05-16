public class Noh {
    private Aluno info; //este exemplo armazena números inteiros
    private Noh prox;
    public Noh (Aluno info){
    this.info = info;
    this.prox = null;
    }
    public Aluno getInfo() { return this.info; }
    public Noh getProx() { return this.prox; }
    public void setProx(Noh n) { this.prox = n; }
    }