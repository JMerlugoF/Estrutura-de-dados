package Listas;

import Arquivos.*;
import Classes.*;
import Listas.*;

public class Categorias { // Essa classe representa uma lista de categorias
	static LDE categorias = new LDE();

	public static void preencherLista() throws Exception {
		// LDE categorias = new LDE();
		String cat[] = Arquivo.getLinhas("Categorias.csv");
		for (int i = 0; i < cat.length - 1; i++) {
			String[] info = cat[i].split(";");
			Categoria c = new Categoria(Integer.parseInt(info[0]), info[1]);
			categorias.insereFim(c);
		}
	}

	public static Categoria getCategoria(int identificador) {

		Object obj;
		for (int i = 0; i < categorias.tamanho(); i++) {
			obj = categorias.getObject(i);
			if (((Categoria) obj).getIdentificador() == identificador) {
				return (Categoria) obj;
			}
		}
		return null;
	}
	
	public static boolean cadastrar(int ident, String nome) {
		if(getCategoria(ident)==null) {
			Categoria c = new Categoria(ident, nome);
			categorias.insereFim(c);
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean alteraInfo(int ident, int x, String info) {
		Categoria c = getCategoria(ident);
		Categoria cAnt = c;
		
		switch(x) {
        	case 1: 
        		c.setIdentificador(Integer.parseInt(info));
        		break;
        	case 2:
        		c.setNome(info);
        		break;
		}
		for(int i=0; i<categorias.tamanho(); i++){
			categorias.setObject(cAnt, c);
			return true;
		}
		return false;
	}
	
	public static boolean excluir(int ident) {
		boolean l;
		Categoria c = getCategoria(ident);
		if(Veiculos.categoriaExite(c)) {
			return false;
		}
		categorias.remove(c);
		return true;
	}
	
	public static void listarCrescente() {
		categorias.listarCrescente();
	}
	
	public static void listarDecrescente() {
		categorias.listarDecrescente();
	}
	
}