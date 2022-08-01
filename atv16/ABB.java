package atv16;

public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public void recursiveAdd(int element) {
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }

    public Object buscaRec(int info){
        Noh node = this.raiz;
        return buscaRecMethod(info, node);
    }

    private Noh buscaRecMethod(int info, Noh node){
        if (node.valor == info) {
            return node;
        }
        if (node.dir == null && node.esq == null) {
            return null;
        }
        if (info > node.valor) {
            return buscaRecMethod(info, node.dir);
        } else {
            return buscaRecMethod(info, node.esq);
        }
    }

    public void emOrdem(){
        emOrdemImprime(this.raiz);
    }

    private void emOrdemImprime(Noh node){
        if(node != null){
            if(node.esq != null)
                emOrdemImprime(node.esq);
            System.out.println(node.valor);
            if(node.dir != null)
                emOrdemImprime(node.dir);
        }
    }

    public void preOrdem(){
        preOrdemImprime(this.raiz);
    }

    private void preOrdemImprime(Noh node){
        if (node != null) {
            System.out.println(node.valor);
            preOrdemImprime(node.esq);
            preOrdemImprime(node.dir);
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.esq);
            posOrdem(node.dir);
            System.out.println(node.valor);
        }
    }

    public void remove(int element){
        removeElement((Noh)buscaRec(element));
    }

    private void removeElement(Noh element){
        if (element.ehFolha()) {
            if (element == this.raiz)
                this.raiz = null;
            else {
                if (element.valor < element.pai.valor)
                    element.pai.esq = null;
                else
                    element.pai.dir = null;
            }
        } else if (element.filhosSoNaEsquerda()) {
            if (element == this.raiz)  {
                this.raiz = element.esq;
                this.raiz.pai = null;
            } else {
                element.pai.esq = element.esq;
            }
        } else if (element.filhosSoNaDireita()) {
            if (element == this.raiz) {
                this.raiz = element.dir;
                this.raiz.pai = null;
            } else {
                element.pai.dir = element.dir;
            }
        } else {
            if(element != null){
                Noh sucessor = sucessor(element);
                element.valor = sucessor.valor;
                removeElement(sucessor);
            }
        }
    }

    public Noh sucessor(Noh element) {
        if (element.dir != null)
            return maxEsq(element.dir);
        else {
            Noh aux = element.pai;

            while (aux != null && aux.valor < element.valor)
                aux = aux.pai;

            return aux;
        }
    }

    private Noh maxEsq(Noh noh) {
        if (noh.esq == null) return noh;
        else return maxEsq(noh.esq);
    }
}