public class Main {
    public static void main(String[] args) {
        LSE listaInteiros = new LSE();
        Noh novo = new Noh(listaInteiros);
        listaInteiros.insereInicio(1);
        listaInteiros.insereInicio(5);
        listaInteiros.insereInicio(14);
        listaInteiros.insereInicio(234);
        listaInteiros.insereInicio(34);
        listaInteiros.imprime_rec(novo);
    }
}
