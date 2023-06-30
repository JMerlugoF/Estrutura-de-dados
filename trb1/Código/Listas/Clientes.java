package Listas;

import Classes.*;

public class Clientes {
    public static LDE clientes = new LDE();
	
	public static int getCNH(int CPF) {
        Object obj;
        for(int i = 0; i < clientes.tamanho(); i++){ //laco percorrer todos os clientes
            obj = clientes.getObject(i);
            if (((Cliente) obj).getCPF() == CPF) {
                return ((Cliente) obj).getCNH();
            }
        }
        return 0;
    }

    public static boolean clienteExiste(int CPF) {

        Object obj;
		for(int i = 0; i < clientes.tamanho(); i++){ //laco percorrer todos os clientes
			obj = clientes.getObject(i);
			if (((Cliente) obj).getCPF() == CPF) {
				return true; //se existir
			}
		}
		return false; //se nao existir
	}

    public static Cliente getCliente(int CPF) {

        Object obj;
		for(int i = 0; i < clientes.tamanho(); i++){
			obj = clientes.getObject(i);
			if (((Cliente) obj).getCPF() == CPF) { //busca o CPF
				return (Cliente)obj;
			}
		}
		return null;
	}

    public static boolean excluirCliente(int CPF) {

        int guardaConteudo = Clientes.getCNH(CPF);
        boolean delete;

        if(ListaLocacoes.cnhExiste(guardaConteudo)) {
            delete = false;
			System.out.println("\nNão é possivel porque este cliente esta atrelado a uma locacao\n");
        }else {
            Cliente c = getCliente(CPF);
            delete = clientes.remove(c);
        }
        return delete;
    }

    public static boolean alteraInfoCliente(int CPF, int x, String info) {
		Cliente cliente = getCliente(CPF);
		Cliente vAnt = cliente;
		int conversor;
		
		switch(x) {
	        case 1: 
                cliente.setNome(info);
	            break;
	        case 2:
                conversor = Integer.parseInt(info);
                cliente.setCPF(conversor);
	            break;
	        case 3:
                conversor = Integer.parseInt(info);
                cliente.setCNH(conversor);
	        	break;
	        case 4:
                conversor = Integer.parseInt(info);
	            cliente.setTelefone(conversor);
	            break;
        }
		
		for(int i = 0; i < clientes.tamanho(); i++){
			clientes.setObject(vAnt, cliente);
			return true;
		}
		return false;
	}

    public static boolean cadastrarCliente(int cnh, String nome, int telefone, int cpf) {

        Cliente cliente = new Cliente(cnh, nome, telefone, cpf); //cria um novo cliente
        if(!clienteExiste(cpf)) {
            clientes.insereFim(cliente); return true; //retorna true e insere o cliente na lista
        }
        return false; //retorna false, pois o cliente ja existe
    }
    
    public static void listarCrescente() {
		clientes.listarCrescente();
	}
	
	public static void listarDecrescente() {
		clientes.listarDecrescente();
	}
    

}