package atv16;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();
        Random random = new Random();
        arvore.add(13);
        arvore.add(40);
        arvore.add(53);
        for (int i = 0; i < 50; i++) {
            arvore.add(random.nextInt(10000));
        }
        arvore.add(03);
        arvore.add(13);
        arvore.emOrdem();
        System.out.println();
        arvore.remove(40);
        arvore.remove(03);
        arvore.emOrdem();

    }
}
