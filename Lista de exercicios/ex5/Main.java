public class Main {
    public static void main(String[] args) {
        LDE listaInteiros = new LDE();
            listaInteiros.insereInicio(1);
            listaInteiros.insereInicio(6);
            listaInteiros.insereInicio(2);
            listaInteiros.insereInicio(18);
            listaInteiros.insereInicio(4);
            listaInteiros.insereInicio(224);
            System.out.println(listaInteiros.nroPares());
    }
}
