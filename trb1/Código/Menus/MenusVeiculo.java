package Menus;

import java.util.Scanner;
import Listas.Clientes;
import Listas.Veiculos;

public class MenusVeiculo {
    static Scanner lerEntrada = new Scanner(System.in);

    public static void menuVeiculos() {
        char op;
        do {
            System.out.println("|====== MENU DE VEICULOS =======|");
            System.out.println("|===== O que deseja fazer? =====|");
            System.out.println("|= Listar Veiculos == (1)       |");
            System.out.println("|= Editar Veiculo == (2)        |");
            System.out.println("|= Excluir um Veiculo == (3)    |");
            System.out.println("|= Cadastrar um Veiculo == (4)  |");
            System.out.println("|= Retornar == (0)              |");
            System.out.println("|                               |");
            System.out.println("|===============================|");
            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();

            switch (op) {
                case '1':
                    menuListarVeiculos();
                    break;
                case '2':
                    menuEditarVeiculo();
                    break;
                case '3':
                    menuExcluirVeiculo();
                    break;
                case '4':
                    menuCadastrarVeiculo();
                    break;
                case '0':
                	  MenusPrincipal.menuPrincipal();
                    break;
                default:
                	opInvalida();
                    break;     
            }
        } while(op != '0');
    }


    public static void menuListarVeiculos() {
        char op;
        do {
            System.out.println("|======= LISTAR VEICULOS =======|");
            System.out.println("|= Como deseja ordenar a lista? |");
            System.out.println("|                               |");
            System.out.println("|= Ordem crescente == (1)       |");
            System.out.println("|= Ordem decrescente == (2)     |");
            System.out.println("|= Retornar == (0)              |");
            System.out.println("|                               |");
            System.out.println("|===============================|");
            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();
            switch(op) {
              case '1': 
                  Veiculos.listarCrescente();
                  break;
              case '2':
                  Veiculos.listarDecrescente();
                  break;
              case '0':
                menuVeiculos();
                break;
              default:
                  opInvalida();
                  break;
            }
          }while(op!='0');
      }

    public static void menuEditarVeiculo() {
        String placa;
        String info;
        int x;
        boolean verificaPlaca;
        char op;
        do {
            System.out.println("|========= EDITAR VEICULOS =========|");
            System.out.println("| =Digite a placa do Veiculo que deseja Editar: ");
            placa = lerEntrada.next();
            lerEntrada.nextLine();
            verificaPlaca = Veiculos.placaExiste(placa);
            clearConsole();
            if (!verificaPlaca) {
                System.out.println("\n ! ! !  Placa inválida  ! ! ! ");
                System.out.println("\n {{{ Digite Novamente }}}");
            }

        } while (!verificaPlaca);

        do {
            System.out.println("|========= EDITAR VEICULOS =========|");
            System.out.println("|=== Qual campo deseja alterar? ====|");
            System.out.println("|= Alterar Placa == (1)             |");
            System.out.println("|= Alterar Modelo == (2)            |");
            System.out.println("|= Alterar Marca == (3)             |");
            System.out.println("|= Alterar Ano == (4)               |");
            System.out.println("|= Alterar Potencia == (5)          |");
            System.out.println("|= Alterar numero de Lugares == (6) |");
            System.out.println("|= Alterar Categoria == (7)         |");
            System.out.println("|= Retornar == (0)                  |");
            System.out.println("|===================================|");
            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();

            switch(op) {
            case '1': case '2': case '3': case '4': case '5': case '6': case '7':
            	alteraVeiculo(op, placa);
            	break;
            case '0':
            	menuVeiculos();
            	break;
            default:
                opInvalida();
                break;
	        }
            
    	}while(op!='0');

    }

    public static void menuExcluirVeiculo(){
    	char op;
    	System.out.println("|========= EXCLUIR VEICULOS =========|");
        System.out.println("|= Digite a placa do Veiculo que deseja Excluir: ");
        String placa = lerEntrada.nextLine();
        do {
	        System.out.println("\n|= Deseja mesmo excluir esse Veiculo?");
	        System.out.println("\n|= "+Veiculos.getVeiculo(placa));
	        System.out.println("\n|= SIM == (1)\n|= NAO == (0)");
	        op = lerEntrada.next().charAt(0);
	        lerEntrada.nextLine();
	        switch (op){
	            case '1':
	                if(Veiculos.excluir(placa)) {
	                	System.out.println("|========= EXCLUIR VEICULOS =========|");
	                	System.out.println("|= Veiculo excluído com Sucesso!!");
	                }else{
	                	System.out.println("\n ! ! ! O veiculo não pode ser excluido ! ! ! ");
	                    System.out.println("\n {{{ Verifique se o veiculo esta locado }}}");
	                };
	                break;
	            case '0':
	            	System.out.println("\nRetornando para o menu!\n\n");
	            	break;
	            default:
	            	opInvalida();
	                break;
	        }
        }while(op!='0' && op!='1');

    }

    public static void menuCadastrarVeiculo(){
    	char op=0;
    	String placa, modelo, marca;
    	int ano, potencia, nroLugares, cat;
    	
        do {
        	System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|=== Preencha as informacoes ===|");
            System.out.println("|= Informe a Placa:             |");
            System.out.println("|===============================|");
            placa = lerEntrada.next();
            lerEntrada.nextLine(); //limpa o buffer

            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe o Modelo:            |");
            System.out.println("|===============================|");
            modelo = lerEntrada.next();
            lerEntrada.nextLine(); //limpa o buffer
            
            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe a Marca:             |");
            System.out.println("|===============================|");
            marca = lerEntrada.next();
            lerEntrada.nextLine(); //limpa o buffer

            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe o Ano:               |");
            System.out.println("|===============================|");
            ano = lerEntrada.nextInt();

            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe o Potencia:          |");
            System.out.println("|===============================|");
            potencia = lerEntrada.nextInt();

            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe o Número de Lugares: |");
            System.out.println("|===============================|");
            nroLugares = lerEntrada.nextInt();

            System.out.println("|====== CADASTRAR VEICULOS =====|");
            System.out.println("|= Informe a Categoria:         |");
            System.out.println("|===============================|");
            cat = lerEntrada.nextInt();

            if(Veiculos.cadastrar(placa, modelo, marca, ano, potencia, nroLugares, cat)) {
            	System.out.println("|====== CADASTRAR VEICULOS =====|");
            	System.out.println("|= Veiculo cadastrado com Sucesso!!");
            	return;
            }else {
            	System.out.println("\n ! ! ! Nao foi possivel cadastrar o veiculo ! ! ! ");
                System.out.println("\n {{{ Digite Novamente }}}");
            }
        }while(op!='0');
    }

    public static void alteraVeiculo(char op, String placa) {
        String campo = null;
        String info;
        int x = 0;

        switch (op) {
            case '1':
                campo = "Placa:";
                x = 1;
                break;
            case '2':
                campo = "Modelo:";
                x = 2;
                break;
            case '3':
                campo = "Marca:";
                x = 3;
                break;
            case '4':
                campo = "Ano:";
                x = 4;
                break;
            case '5':
                campo = "Potência:";
                x = 5;
                break;
            case '6':
                campo = "Número de lugares:";
                x = 6;
                break;
            case '7':
                campo = "Categoria:";
                x = 7;
                break;
        }

        System.out.println("|========= EDITAR VEICULOS =========|");
        System.out.println("|= Digite o(a) novo(a) " + campo);
        info = lerEntrada.next();
        lerEntrada.nextLine();
        if (Veiculos.alteraInfo(placa, x, info)) {
            System.out.println("|========= EDITAR VEICULOS =========|");
            System.out.println("|= " + campo + " alterado(a) com Sucesso!!");
        } else {
            System.out.println("|= erro");
        }
        ;

    }

    public final static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");

            }else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        //  Tratar Exceptions
        }
    }

    public static void opInvalida() {
    	System.out.println("\n ! ! !  Opçao inválida  ! ! ! ");
        System.out.println("\n {{{ Digite Novamente }}}");
    }
}
