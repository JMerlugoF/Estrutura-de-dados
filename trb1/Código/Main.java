import Arquivos.*;
import Classes.*;
import Listas.*;
import Menus.*;

public class Main {
    public static void main(String args[]) throws Exception {

        Categorias.preencherLista();
        Veiculos.preencherLista();

        MenusPrincipal.menuPrincipal();

    }
}