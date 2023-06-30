package Menus;

import java.util.Scanner;
import Classes.*;
import Listas.Veiculos;

public class MenusPrincipal {
    static Scanner lerEntrada = new Scanner(System.in);
    
    public static void limparBuffer(){
    MenusPrincipal.lerEntrada.nextLine();
    }

    public static void menuPrincipal() {
        char op;
        do {
            System.out.println("|========== BEM VINDO ==========|\n");
            System.out.println("O que deseja fazer?");
            System.out.println("Menu Veiculos == (1)");
            System.out.println("Menu Clientes == (2)");
            System.out.println("Realizar Locação == (3)");
            System.out.println("Menu Categorias == (4)");
            System.out.println("Sair == (0)");

            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();
            switch (op) {
                case '1':
                    MenusVeiculo.menuVeiculos();
                    break;
                case '2':
                    MenusCliente.menuClientes();
                    break;
                case '3':
                    MenusLocacao.menuLocacao();
                    break;
                case '4':
                    MenusCategoria.menuCategoria();
                    break;
                case '0':
                    System.out.println("\n|=========== Até Logo ==========|");
                    System.exit(1); // sai do programa
                    break;
                default:
                    opInvalida();
                    break;
            }
        } while (op != '0');

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");

            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Tratar Exceptions
        }
    }

    public static void opInvalida() {
        System.out.println("\n ! ! !  Opcçao inválida  ! ! ! ");
        System.out.println("\n {{{ Digite Novamente }}}");
    }
}