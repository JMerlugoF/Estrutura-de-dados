package Listas;

public interface Lista {
    public void insereInicio(Object element);
    public void insereFim(Object element);
    public boolean estahVazia();
    public boolean remove(Object element);
    public int tamanho();
    public void listarCrescente();
    public void listarDecrescente();
    public Object getObject(int x);
}