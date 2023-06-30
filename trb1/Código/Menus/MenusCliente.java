package Menus;

import java.util.Scanner;
import Listas.Clientes;

public class MenusCliente {
    static Scanner lerEntrada = new Scanner(System.in);

    public static void menuClientes() {

        int op1;
        do {
            System.out.println("|====== MENU DE CLIENTES ======|\n\n");
            System.out.println("O que deseja fazer?");
            System.out.println("Listar Clientes == (1)");
            System.out.println("Editar um Cliente == (2)");
            System.out.println("Excluir um Cliente == (3)");
            System.out.println("Cadastrar um Cliente == (4)");
            System.out.println("Sair == (0)");
            op1 = lerEntrada.nextInt();
            lerEntrada.nextLine(); // limpa o buffer

            switch (op1) {
                case 1:
                    menuListarClientes();
                    break;
                case 2:
                    menuEditarCliente();
                    break;
                case 3:
                    menuExcluirCliente();
                    break;
                case 4:
                    menuCadastrarCliente();
                    break;
                case 0:
                    MenusPrincipal.menuPrincipal();
                    break;
                default:
                    System.out.println("\n=== Opcao invalida, tente novamente! ===\n");
                    break;
            }
        } while (op1 != 0);
    }

    public static void menuEditarCliente() {
        int CPF; 
        char op4;
        boolean verificaCPF;
        do {
            System.out.println("|========= EDITAR CLIENTES =========|");
            System.out.println("|== Digite o CPF do cliente que deseja Editar: ");
            CPF = lerEntrada.nextInt();
            lerEntrada.nextLine();
            verificaCPF = Clientes.clienteExiste(CPF);
            clearConsole();

            if (!verificaCPF) {
                System.out.println("\n ! ! !  CPF inválido  ! ! ! ");
                System.out.println("\n {{{ Digite Novamente }}}");
            }

        } while (!verificaCPF);

        do {
            System.out.println("|========= EDITAR CLIENTES =========|");
            System.out.println("|=== Qual campo deseja alterar? ====|");
            System.out.println("|= Alterar Nome == (1)              |");
            System.out.println("|= Alterar CPF == (2)               |");
            System.out.println("|= Alterar CNH == (3)               |");
            System.out.println("|= Alterar Telefone == (4)          |");
            System.out.println("|= Retornar == (0)                  |");
            System.out.println("|===================================|");
            op4 = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();

            switch (op4) {
                case '1':
                	alteraCliente(op4, CPF);
                    break;
                case '2':
                	alteraCliente(op4, CPF);
                    break;
                case '3':
                	alteraCliente(op4, CPF);
                    break;
                case '4':
                    alteraCliente(op4, CPF);
                    break;
                case '0':
                    System.out.println("\nRetornando ao menu!");
                    break;
                default:
                    opInvalida();
                    break;
            }


        } while (op4 != '0');
    }

    public static void alteraCliente(char op4, int CPF) {
        String campo = null;
        String info;
        int x = 0;

        switch (op4) {
            case '1':
                campo = "Nome:";
                x = 1;
                break;
            case '2':
                campo = "CPF:";
                x = 2;
                break;
            case '3':
                campo = "CNH:";
                x = 3;
                break;
            case '4':
                campo = "Telefone:";
                x = 4;
                break;
        }

        System.out.println("|========= EDITAR CLIENTE =========|");
        System.out.println("|= Digite o(a) novo(a) " + campo);
        info = lerEntrada.next();
        lerEntrada.nextLine();

        if (Listas.Clientes.alteraInfoCliente(CPF, x, info)) {
            System.out.println("|========= EDITAR VEICULOS =========|");
            System.out.println("|= " + campo + " alterado(a) com Sucesso!!");
        } else {
            System.out.println("|= ERRO, nao foi possivel alterar o " + campo + " deste cliente!\n");
        }
        ;
    }

    public static void menuCadastrarCliente() {
        // int repetidor = 0;
        // do{
        System.out.println("\n=== Cadastro de Clientes ===\n");
        System.out.println("Preencha as informacoes:");
        System.out.println("Informe o CNH:");
        int cnh = lerEntrada.nextInt();
        lerEntrada.nextLine();
        System.out.println("Informe o Nome:");
        String nome = lerEntrada.next();
        lerEntrada.nextLine();
        System.out.println("Informe o CPF:");
        int cpf = lerEntrada.nextInt();
        lerEntrada.nextLine();
        System.out.println("Informe o Telefone:");
        int telefone = lerEntrada.nextInt();
        lerEntrada.nextLine();

        if (Listas.Clientes.cadastrarCliente(cnh, nome, telefone, cpf)) {
            System.out.println("\n|====== CADASTRO DE CLIENTE =====|");
            System.out.println("|= Cliente cadastrado com Sucesso!!\n");
        } else {
            System.out.println("\n ! ! !  Este cliente ja foi cadastrado  ! ! ! ");
            System.out.println("\n {{{ Digite Novamente }}}");
        }
        // } while(repetidor == 0);
    }

    public static void menuExcluirCliente() {
        char op3;

        System.out.println("=== Excluir Cliente ===\n");
        System.out.println("\nInforme o CPF: \n"); // pede o cpf pra buscar e excluir o cliente.
        int CPF = lerEntrada.nextInt();
        lerEntrada.nextLine();

        do {
            System.out.println("\nTem certeza que deseja excluir o cliente com o CPF: " + CPF + " ?\n");
            Listas.Clientes.getCliente(CPF); // pega o cliente com aquele cpf
            System.out.println("\n|= SIM == (1)\n|= NAO == (0)");
            op3 = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();

            switch (op3) {
                case '1':
                    if (Listas.Clientes.excluirCliente(CPF)) {
                        System.out.println("|========= EXCLUIR CLIENTE =========|\n");
                        System.out.println("|= Cliente excluído com Sucesso!!\n\n");
                    };
                    break;
                case '0':
                    System.out.println("\nRetornando para o menu!\n\n");
                    break;
                default:
                    opInvalida();
                    break;
            }
        } while (op3 != '0' && op3 !='1');
    }

    public static void menuListarClientes() {
        int opp;
        do {
            System.out.println("|======= LISTAR CLIENTES =======|");
            System.out.println("|= Como deseja ordenar a lista? |");
            System.out.println("|                               |");
            System.out.println("|= Ordem crescente == (1)       |");
            System.out.println("|= Ordem decrescente == (2)     |");
            System.out.println("|= Retornar == (0)              |");
            System.out.println("|                               |");
            System.out.println("|===============================|");
            opp = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();

            switch (opp) {
                case '1':
                    Clientes.listarCrescente();
                    break;
                case '2':
                    Clientes.listarDecrescente();
                    break;
                case '0':
                    // menuVeiculos();
                    System.out.println("\nRedirecionando para o menu!\n");
                    break;
                default:
                    opInvalida();
                    break;
            }
        } while (opp != '0');
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
        System.out.println("\n ! ! !  Opçao inválida  ! ! ! ");
        System.out.println("\n {{{ Digite Novamente }}}");
    }
}

