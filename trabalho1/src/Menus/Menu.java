package Menus;
import Listas.*;
import Classes.*;
import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public static void menu1(){
        int opcao;
        Scanner lerEntrada = new Scanner(System.in);

        System.out.println("\n====== BEM VINDO ======");
        System.out.println("\n=== O que deseja fazer? ===");
        System.out.println("\nMenu Veiculos == (1)");
        System.out.println("\nMenu Clientes == (2)");
        System.out.println("\nRealizar Locacão == (3)");
        System.out.println("\nSair == (0)");
        opcao = lerEntrada.nextInt();

        do {
            switch (opcao) {
                case 1:
                    //menuVeiculos();
                    break;
                case 2:
                    //menuClientes():
                case 3:
                    //menuLocacao();
                    break;
                case 0:
                    System.out.println("\n======= Até Logo ======");
                    break;
                default:
                    System.out.println("\n ! ! !  Caractére invalido  ! ! ! ");
                    System.out.println("\n {{{ Digite Novamente }}}");
            }
        }while(opcao != 0);

    }

    public void menuVeiculos(){

        System.out.println("\n ====== MENU DE VEICULOS ======");
        System.out.println("\n Listar Veiculos == (1)");
        System.out.println("\n Editar Veiculo == (2)");
        System.out.println("\n Excluir um Veiculo == (3)");
        System.out.println("\n Cadastrar um Veiculo == (4)");
        System.out.println("\n Sair == (0)");


    }

    public void menuListarVeiculos(){

        System.out.println();

    }

}
