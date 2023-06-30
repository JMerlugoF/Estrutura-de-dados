package Listas;

import Arquivos.*;
import Classes.*;
import Listas.*;

public class Veiculos { // Essa classe representa uma lista de veiculos
	public static LDE veiculos = new LDE();

	public static void preencherLista() throws Exception {

		String vei[] = Arquivo.getLinhas("Veiculos.csv");
		for (int i = 0; i < vei.length - 1; i++) {
			String[] info = vei[i].split(";");
			Categoria c = Categorias.getCategoria(Integer.parseInt(info[6]));

			Veiculo v = new Veiculo(info[0], info[1], info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]),
					Integer.parseInt(info[5]), c);
			veiculos.insereFim(v);
		}
	}
	
	public static void listarCrescente() {
		veiculos.listarCrescente();
	}
	
	public static void listarDecrescente() {
		veiculos.listarDecrescente();
	}
	
	public static boolean placaExiste(String placa) {
		Object obj;
		for (int i = 0; i < veiculos.tamanho(); i++) {
			obj = (Veiculo)veiculos.getObject(i);
			if (((Veiculo) obj).getPlaca().equals(placa)) {
				return true;
			}
		}
		return false;
	}
	
	public static Veiculo getVeiculo(String placa) {
		Object obj;

		for (int i = 0; i < veiculos.tamanho(); i++) {
			obj = veiculos.getObject(i);
			if (((Veiculo) obj).getPlaca().equals(placa)) {
				return (Veiculo) obj;
			}
		}
		return null;
	}
	
	public static boolean categoriaExite(Categoria cat) {
		Object obj;
		
		for(int i=0; i<veiculos.tamanho(); i++){
			obj = veiculos.getObject(i);
			if (((Veiculo) obj).getCategoria().equals(cat)) {
				return true;
			}
		}
		return false;
	}

	public static boolean alteraInfo(String placa, int x, String info) {
		Veiculo v = getVeiculo(placa);
		Veiculo vAnt = v;
		int n;
		
		switch(x) {
	        case 1: 
	            v.setPlaca(info);
	            //if (placaExiste(info)) {
	            //	return false;
	            //}
	            break;
	        case 2:
	            v.setModelo(info);
	            break;
	        case 3:
	        	v.setMarca(info);
	        	break;
	        case 4:
	        	n=Integer.parseInt(info);
	            v.setAno(n);
	            break;
	        case 5:
	        	n=Integer.parseInt(info);
	            v.setPotencia(n);
	            break;
	        case 6:
	        	n=Integer.parseInt(info);
	        	v.setnLugares(n);
	        	break;
	        case 7:
	        	n=Integer.parseInt(info);
	        	Categoria c = Categorias.getCategoria(n);
	        	v.setCategoria(c);
	        	if(Categorias.getCategoria(c.getIdentificador()) == null) {
	        		return false;
	        	}
	        	
        }
		
		for(int i=0; i<veiculos.tamanho(); i++){
			veiculos.setObject(vAnt, v);
			return true;
		}
		return false;
	}

	public static boolean excluir(String placa) {
		boolean l;
		if(ListaLocacoes.placaExiste(placa)) {
			l = false;
		}else {
			Veiculo v = getVeiculo(placa);
			l=veiculos.remove(v);
		}
		return l;
	}

	public static boolean cadastrar(String plc, String modelo, String marca, int ano, int potencia, int nroLug,
			int cat) {
		Categoria c = Categorias.getCategoria(cat);
		Veiculo v = new Veiculo(plc, modelo, marca, ano, potencia, nroLug, c);

		if(!placaExiste(plc)&&c!=null) {
			veiculos.insereFim(v);
			return true;
		} else {
			return false;
		}
	}

}