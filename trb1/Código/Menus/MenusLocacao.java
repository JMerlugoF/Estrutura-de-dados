package Menus;

import Menus.MenusPrincipal;
import Classes.Locacao;
import Listas.ListaLocacoes;
import Listas.Veiculos;

public class MenusLocacao {

    public static void menuLocacao() {
        int op;
        do {
            System.out.println("\n=== Menu Locacao ===\n");
            System.out.println("\nLocar Veiculo == (1)");
            System.out.println("\nDevolver Veiculo == (2)");
            System.out.println("\nListar Locacoes == (3)");
            System.out.println("\nSair == (0)");
            op = MenusPrincipal.lerEntrada.nextInt();
            MenusPrincipal.limparBuffer();
            switch (op) {
                case 1:
                    MenusLocacao.menuLocarVeiculo();
                    break;
                case 2:
                    menuDevolverVeiculo();
                    break;
                case 3:
                    ListaLocacoes.listaLocacoes.listarCrescente();
                    break;
                case 0:
                    MenusPrincipal.menuPrincipal();
                    break;
                default:
                    MenusPrincipal.opInvalida();
                    break;
            }
        } while (op != 0);
    }

    public static void menuLocarVeiculo() {
        char op;
        String filtro = null, tipoFiltro = null;
        do{
        System.out.println("\nExibir Lista de Veiculos não locados[Decrescente] == (1)");
        System.out.println("Exibir Lista de Veiculos não locados[Crescente] == (2)");
        System.out.println("Ativar algum filtro == (3)");
        System.out.println("Continuar com a Locacao == (4)");
        System.out.println("Sair == (0)");
        op = MenusPrincipal.lerEntrada.next().charAt(0);

        switch(op){
            case '1':
                ListaLocacoes.listarNaoLocadosDecrescente(tipoFiltro, filtro);
                break;
            case '2':
                ListaLocacoes.listarNaoLocadosCrescente(tipoFiltro, filtro);
                break;
            case '3':
                menuFiltro();
                break;
            case '4':
                menuFinalLocarVeiculo();
                break;
            case '0':
                menuLocacao();
                break;
        }
    }while(op != '0');
    }

    public static void menuFiltro(){
        int op, op2;
        String tipoFiltro = null, filtro = null;
        System.out.println("Qual tipo de filtro deseja: ");
        System.out.println("\nCategoria == (1)");
        System.out.println("Potencia == (2)");
        System.out.println("nLugares == (3)");
        op = MenusPrincipal.lerEntrada.nextInt();
        switch(op){
            case 1:
                System.out.println("qual a categoria desejada?");
                System.out.println("esportivo == (1)\nsedan comptacto == (2)\nsedan medio == (3)\nSUV compacto  == (4)\n SUV  == (5)\ncaminhonete  == (6)\nhatch == (7)\n");
                op2 = MenusPrincipal.lerEntrada.nextInt();
                switch(op2){
                    case 1:
                        filtro = "esportivo";
                        break;
                    case 2:
                        filtro = "sedan comptacto";
                        break;
                    case 3:
                        filtro = "sedan medio";
                        break;
                    case 4:
                        filtro = "SUV compacto";
                        break;
                    case 5:
                        filtro = "SUV";
                        break;
                    case 6:
                        filtro = "caminhonete";
                        break;
                    case 7:
                        filtro = "hatch";
                        break;
                }
                tipoFiltro = "Categoria";
                break;
            case 2:
                System.out.println("Qual valor desejado?");
                filtro = MenusPrincipal.lerEntrada.next();
                tipoFiltro = "Potencia";
                break;
            case 3:
                System.out.println("Qual valor desejado?");
                filtro = MenusPrincipal.lerEntrada.next();
                tipoFiltro = "nLugares";
                break;
        }
        do{
        System.out.println("deseja listar de que forma:\nCrescente == (1)\nDescrescente == (2)");
        op2 = MenusPrincipal.lerEntrada.nextInt();
        if(op2 == 1){
        ListaLocacoes.listarNaoLocadosCrescente(tipoFiltro, filtro);
        } else if(op2 == 2){
            ListaLocacoes.listarNaoLocadosDecrescente(tipoFiltro, filtro);
        } else {
            System.out.println("Caractere invalido");
        } 
        }while(op2 != 1 && op2 != 2);

    }


    public static void menuFinalLocarVeiculo(){

        int op;
        System.out.println("\nDigite sua CNH:");
        int cnhLocador = MenusPrincipal.lerEntrada.nextInt();
        MenusPrincipal.limparBuffer();
        System.out.println("\nDigite a placa do Veiculo:");
        String placaLocacao = MenusPrincipal.lerEntrada.next();
        MenusPrincipal.limparBuffer();
        System.out.println("\nDigite a data de Retirada:");
        String dataRetirada = MenusPrincipal.lerEntrada.next();
        MenusPrincipal.limparBuffer();
        do {
            System.out.println("\n\nDeseja realmente locar o este Veiculo?");
            System.out.println("\nSim == (1)");
            System.out.println("\nNao == (0)");
            op = MenusPrincipal.lerEntrada.nextInt();
            MenusPrincipal.limparBuffer();
            switch (op) {
                case 1:
                    ListaLocacoes.criarLocacao(cnhLocador, placaLocacao, dataRetirada);
                    break;
                case 0:
                    menuLocacao();
                    break;
                default:
                    MenusPrincipal.opInvalida();
                    break;
            }
        } while (op != 0 && op != 1);

    }

    public static void menuDevolverVeiculo(){

        int op;
        System.out.println("Qual a Placa do Veiculo que Deseja devolver: ");
        String placa = MenusPrincipal.lerEntrada.next();
        MenusPrincipal.limparBuffer();
        if(ListaLocacoes.placaExiste(placa) == true){
            System.out.println("\nQual a data da devolucao: ");
            String datadevolucao = MenusPrincipal.lerEntrada.next();
            MenusPrincipal.limparBuffer();
            System.out.println("\nQual o valor a ser pago: ");
            float valor = MenusPrincipal.lerEntrada.nextFloat();
            MenusPrincipal.limparBuffer();
            do{
            System.out.println("\nDeseja mesmo Devolver este Veiculo: ");
            System.out.println("\nSim == (1)");
            System.out.println("\nNao == (0)");
            op = MenusPrincipal.lerEntrada.nextInt();
            MenusPrincipal.limparBuffer();
            switch(op){

                case 1:
                    ListaLocacoes.devolverVeiculo(placa, datadevolucao, valor);
                    System.out.println("\nDevolucao a teve sucesso!");
                    break;
                case 0:
                    menuLocacao();
                    break;
                default:
                    MenusPrincipal.opInvalida();
                    break;
            }
        }while(op != 1 && op != 0);

        }

    }

}