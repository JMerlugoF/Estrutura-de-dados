package atv15;
public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();
        arvore.add(13);
        arvore.add(40);
        arvore.add(53);
        arvore.add(03);
        arvore.add(13);
        System.out.println(arvore.buscaRec(111));
        System.out.println(arvore.buscaRec(40));
        System.out.println(arvore.buscaRec(13));
        System.out.println(arvore.buscaRec(2));
    }
}