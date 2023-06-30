package Menus;

import java.util.Scanner;

import Listas.*;

public class MenusCategoria {
	static Scanner lerEntrada = new Scanner(System.in);
	
	public static void menuCategoria() {
    	char op;
    	do {
        	System.out.println("|====== MENU DE CATEGORIA ======|");
            System.out.println("|===== O que deseja fazer? =====|");
            System.out.println("|= Incluir Categoria == (1)     |");
            System.out.println("|= Editar Categoria == (2)      |");
            System.out.println("|= Excluir Categoria == (3)     |");
            System.out.println("|= Listar Categorias == (4)     |");
            System.out.println("|= Retornar == (0)              |");
            System.out.println("|                               |");
            System.out.println("|===============================|");
            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();

            switch(op) {
                case '1': 
                    menuIncluirCategoria();
                    break;
                case '2':
                    menuEditarCategoria();
                    break;
                case '3':
                    menuExcluirCategoria();
                    break;
                case '4':
                    menuListarCategoria();
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
    
    public static void menuIncluirCategoria(){
    	char op = '0';
    	String nome;
    	int identificador;
    	
        do {
        	System.out.println("|====== INCLUIR CATEGORIAS =====|");
        	System.out.println("|=== Preencha as informacoes ===|");
            System.out.println("|= Informe o Identificador:     |");
            System.out.println("|===============================|");
            identificador = lerEntrada.nextInt();
        	
        	System.out.println("|====== INCLUIR CATEGORIAS =====|");
            System.out.println("|= Informe o nome:              |");
            System.out.println("|===============================|");
            nome = lerEntrada.next();
            lerEntrada.nextLine(); //limpa o buffer
            
            if(Categorias.cadastrar(identificador, nome)) {
            	System.out.println("|====== INCLUIR CATEGORIAS =====|");
            	System.out.println("|= Categoria cadastrada com Sucesso!!");
            	return;
            }else {
            	System.out.println("\n ! ! ! Nao foi possivel incluir ! ! ! ");
                System.out.println("\n {{{ Categoria já Existe }}}");
            }
        }while(op!='0');
    }
    
    public static void menuEditarCategoria() {
    	char op;
    	int identificador;
    	int x;
    	String info;
    	
    	do {
    		System.out.println("|======== EDITAR CATEGORIAS ========|");
        	System.out.println("| =Digite o identificador da categoria que deseja Editar: ");
            identificador = lerEntrada.nextInt();
            if(Categorias.getCategoria(identificador)==null) {
            	System.out.println("\n ! ! !  Identificador invalido  ! ! ! ");
                System.out.println("\n {{{ Digite Novamente }}}");
            }
            
    	}while(Categorias.getCategoria(identificador)==null);
    	
    	do {
    		System.out.println("|======== EDITAR CATEGORIAS ========|");
            System.out.println("|=== Qual campo deseja alterar? ====|");
            System.out.println("|						            |");
            System.out.println("|= Alterar Identificador == (1)     |");
            System.out.println("|= Alterar Nome == (2) 	            |");
            System.out.println("|= Retornar == (0)                  |");
            System.out.println("|=                                  |");
            System.out.println("|===================================|");
            op = lerEntrada.next().charAt(0);
            lerEntrada.nextLine();
            clearConsole();
            
            switch(op) {
            case '1': 
            	System.out.println("|======== EDITAR CATEGORIAS ========|");
            	System.out.println("|= Digite o novo Identificador:");
            	info = lerEntrada.next();
            	lerEntrada.nextLine();
            	x=1;
            	if(Categorias.alteraInfo(identificador, x, info)) {
            		System.out.println("|======== EDITAR CATEGORIAS ========|");
                	System.out.println("|= Identificador alterado com Sucesso!");
            	}else{
            		System.out.println("|= erro");
            	};
            	break;
            case '2':
            	System.out.println("|======== EDITAR CATEGORIAS ========|");
            	System.out.println("|= Digite o novo Nome:");
            	info = lerEntrada.next();
            	lerEntrada.nextLine();
            	x=2;
            	if(Categorias.alteraInfo(identificador, x, info)) {
            		System.out.println("|======== EDITAR CATEGORIAS ========|");
                	System.out.println("|= Nome alterado com Sucesso!!");
            	}else{
            		System.out.println("|= erro");
            	};
            	break;
            case '0':
            	menuCategoria();
            	break;
            default:
                opInvalida();
                break;
	        }
            
    	}while(op!='0');
    }
    
    public static void menuExcluirCategoria() {
    	char op;
    	System.out.println("|========= EXCLUIR CATEGORIAS =========|");
        System.out.println("|= Digite o identificador da categoria que deseja Excluir: ");
        int identificador = lerEntrada.nextInt();
        if(Categorias.getCategoria(identificador)!=null) {
	        System.out.println("\n|= Deseja mesmo excluir essa categoria?");
	        System.out.println("\n|= "+Categorias.getCategoria(identificador));
	        System.out.println("\n|= SIM == (1)\n|= NAO == (0)");
	        op = lerEntrada.next().charAt(0);
	        lerEntrada.nextLine();
	        switch (op){
	            case '1':
	                if(Categorias.excluir(identificador)) {
	                	System.out.println("|========= EXCLUIR CATEGORIAS =========|");
	                	System.out.println("|= Categoria excluida com Sucesso!!");
	                }else{
	                	System.out.println("\n ! ! !  A categoria não pode ser excluida ! ! ! ");
	                    System.out.println("\n {{{ Verifique se existem veiculos desta categoria }}}");
	                };
	            case '0':
	            	menuCategoria();
	            	break;
	            default:
	            	opInvalida();
	                break;
	        }
        }else {
        	System.out.println("\n ! ! !  Identificador invalido  ! ! ! \n");
        }
    }
    
    public static void menuListarCategoria() {
    	char op;
    	do {
        	System.out.println("|====== LISTAR CATEGORIAS ======|");
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
                Categorias.listarCrescente();
                break;
            case '2':
                Categorias.listarDecrescente();
                break;
            case '0':
            	menuCategoria();
            	break;
            default:
                opInvalida();
                break;
	        }
        }while(op!='0');
    }
    
    public static void opInvalida() {
    	System.out.println("\n ! ! !  Opção inválida  ! ! ! ");
        System.out.println("\n {{{ Digite Novamente }}}");
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
}
