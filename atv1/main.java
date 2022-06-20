import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Scanner e = new Scanner(System.in);

        planoCartesiano plano = new planoCartesiano(100, 200);

        System.out.print("de a posição de A respectivamente sendo X e Y:");
        float aX = e.nextFloat();
        float aY = e.nextFloat();
        System.out.print("de a posição de B respectivamente sendo X e Y:");
        float bX = e.nextFloat();
        float bY = e.nextFloat();

        plano.calcularDistancia(aX, aY, bX, bY);

    }
}