public class LSE implements Lista {//TAD Lista simplesmente encadeada
    private Noh inicio;
    public LSE (){
    this.inicio = null;
    }
    public void insereInicio(Object aluno) { 

        
        Noh novo = new Noh((Aluno)aluno);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
        
    }
    public void insereFim(Object aluno) { 

        Noh novo = new Noh((Aluno) aluno);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for(Noh i=inicio; i != null; i=i.getProx())
                ultimo = i;
                ultimo.setProx(novo);
        }

    }

    public boolean estahVazia() { 
        if(this.inicio == null){
            return true;
        }
        return false;
    }

    public boolean remove(Object aluno) {

        Noh ant = null, p;
        p = inicio;
        while (p!=null && p.getInfo() != (Aluno)aluno){ //busca
            ant = p;
            p = p.getProx();
        }
        if (p==null) // não achou, então não faz nada e retorna false
            return false;
        if (ant==null) //retira info do início
            inicio = p.getProx();
        else
            ant.setProx(p.getProx());
            return true;

    }

    public int tamanho() { 
        
        Noh p = inicio;
        int cont = 0;

        while (p != null){ //busca
            p = p.getProx();
            cont++;
        }
        return  cont;

     }

    public void listar(){

        Noh p = this.inicio;
        while (p!=null){ 
            System.out.println(""+p.getInfo().getNome()+" /"+"/ "+p.getInfo().getIdade()+"");
            p = p.getProx();
        }

    }


    }