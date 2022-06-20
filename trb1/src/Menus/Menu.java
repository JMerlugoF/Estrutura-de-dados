package Menus;
import java.util.Scanner;

public class Menu {
    static Scanner lerEntrada = new Scanner(System.in);

    public Menu() {
    }

    public static void menuPrincipal(){
        int opcao;

        do {
        System.out.println("\n====== BEM VINDO ======");
        System.out.println("\n=== O que deseja fazer? ===");
        System.out.println("\nMenu Veiculos == (1)");
        System.out.println("\nMenu Clientes == (2)");
        System.out.println("\nRealizar Locacão == (3)");
        System.out.println("\nSair == (0)");
        opcao = lerEntrada.nextInt();


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

        int op;
        System.out.println("\n ====== MENU DE VEICULOS ======");
        System.out.println("\n Listar Veiculos == (1)");
        System.out.println("\n Editar Veiculo == (2)");
        System.out.println("\n Excluir um Veiculo == (3)");
        System.out.println("\n Cadastrar um Veiculo == (4)");
        System.out.println("\n Sair == (0)");
        op = lerEntrada.nextInt();
        switch (op){
            case 1:
                //menuListarVeiculos();
            case 2:
                //menuEditarVeiculo();
            case 3:

        }


    }

    public void menuListarVeiculos(){
        int op;
        System.out.println("\nOrdem decrescente == (1)");
        System.out.println("\nOrdem crescente == (2)");

    }

    public void menuEditarVeiculo(){

        System.out.println("\nAlterar Placa == (1)");
        System.out.println("\nAlterar Modelo == (2)");
        System.out.println("\nAlterar Marca == (3)");
        System.out.println("\nAlterar Ano == (4)");
        System.out.println("\nAlterar Potencia == (5)");
        System.out.println("\nAlterar numero de Lugares == (6)");
        System.out.println("\nAlterar Categoria == (7)");
        System.out.println("\nSair == (0)");

    }

    public void menuExcluirVeiculo(){
        int opcao;
        System.out.println("\nDigite a placa do Veiculo que deseja Excluir: ");
        String placa = lerEntrada.nextLine();
        System.out.println("\nDeseja mesmo excluir esse Veiculo?");
        System.out.println("\nSIM == (1)\nNAO == (0)");
        opcao = lerEntrada.nextInt();
        switch (opcao){

            case 1:
                //ExcluirVeiculo()
            case 0:
                System.out.println("\nAté Logo!");
            default:
                System.out.println("\nCaractére Invalido!");

        }

    }

}
