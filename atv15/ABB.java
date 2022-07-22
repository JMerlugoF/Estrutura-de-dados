package atv15;

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

    public boolean buscaRec(int info){
        Noh node = this.raiz;
        return buscaRecMethod(info, node);
    }

    private boolean buscaRecMethod(int info, Noh node){
        if (node.valor == info) {
            return true;
        }
        if (node.dir == null && node.esq == null) {
            return false;
        }
        if (info > node.valor) {
            return buscaRecMethod(info, node.dir);
        } else {
            return buscaRecMethod(info, node.esq);
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
}