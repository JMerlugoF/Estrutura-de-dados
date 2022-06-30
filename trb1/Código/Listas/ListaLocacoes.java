package Listas;

import javax.sound.sampled.SourceDataLine;

import Classes.Locacao;
import Classes.Veiculo;

public class ListaLocacoes {
    public static Lista listaLocacoes = new LDE();

    public static boolean cnhExiste(int CNH) {
        Object obj;
        for (int i = 0; i < listaLocacoes.tamanho(); i++) {
            obj = listaLocacoes.getObject(i);
            if (((Locacao) obj).getCnhDoLocador() == CNH) {
                return true;
            }
        }
        return false;
    }

    public static boolean placaExiste(String placa) {
        Object obj;
        for (int i = 0; i < listaLocacoes.tamanho(); i++) {
            obj = listaLocacoes.getObject(i);
            if (((Locacao) obj).getPlacaDoVeiculoLocado().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public static void criarLocacao(int cnhLocacao, String placaLocacao, String dataRetirada) {

        Locacao novaLocacao = new Locacao(cnhLocacao, placaLocacao, dataRetirada);
        listaLocacoes.insereFim(novaLocacao);

    }

    public static void devolverVeiculo(String placa, String data, Float valor) {
        Object obj;
        for (int i = 0; i < listaLocacoes.tamanho(); i++) {

            obj = ListaLocacoes.listaLocacoes.getObject(i);
            if (((Locacao) obj).getPlacaDoVeiculoLocado().equals(placa)) {
                ((Locacao) obj).setDataDevolucao(data);
                ((Locacao) obj).setValorLocacao(valor);
                listaLocacoes.remove(obj);
                break;
            }

        }
    }

    // errado daqui pra baixo
    public static void listarNaoLocadosCrescente(String tipoFiltro, String filtro) {
        Object obj;

        if (filtro == null) {
            for (int i = 0; i < Veiculos.veiculos.tamanho(); i++) {

                obj = Veiculos.veiculos.getObject(i);
                if (listaLocacoes.estahVazia() == true) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca())&& ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("Categoria")) {
            for (int i = 0; i < Veiculos.veiculos.tamanho(); i++) {

                obj = Veiculos.veiculos.getObject(i);
                if (listaLocacoes.estahVazia() == true && filtro.equals(((Veiculo) obj).getCategoria().getNome())) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca())&& filtro.equals(((Veiculo) obj).getCategoria().getNome())&& ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("Potencia")) {
            for (int i = 0; i < Veiculos.veiculos.tamanho(); i++) {

                obj = Veiculos.veiculos.getObject(i);
                if (listaLocacoes.estahVazia() == true && Integer.parseInt(filtro) >= ((Veiculo) obj).getPotencia()) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca()) && Integer.parseInt(filtro) >= ((Veiculo) obj).getPotencia() && ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("nLugares")) {
            for (int i = 0; i < Veiculos.veiculos.tamanho(); i++) {

                obj = Veiculos.veiculos.getObject(i);
                if (listaLocacoes.estahVazia() == true && Integer.parseInt(filtro) >= ((Veiculo) obj).getnLugares()) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca()) && Integer.parseInt(filtro) >= ((Veiculo) obj).getnLugares() && ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        }
    }

    public static void listarNaoLocadosDecrescente(String tipoFiltro, String filtro) {
        Object obj;

        if (filtro == null) {
            for (int i = Veiculos.veiculos.tamanho() - 1; i >= 0; i--) {

                obj = Veiculos.veiculos.getObject(i);

                if (listaLocacoes.estahVazia() == true) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca())&& ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("Categoria")) {
            for (int i = Veiculos.veiculos.tamanho() - 1; i >= 0; i--) {

                obj = Veiculos.veiculos.getObject(i);

                if (listaLocacoes.estahVazia() == true && filtro.equals(((Veiculo) obj).getCategoria().getNome())) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca())&& filtro.equals(((Veiculo) obj).getCategoria().getNome())&& ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("Potencia")) {
            for (int i = Veiculos.veiculos.tamanho() - 1; i >= 0; i--) {

                obj = Veiculos.veiculos.getObject(i);

                if (listaLocacoes.estahVazia() == true && Integer.parseInt(filtro) >= ((Veiculo) obj).getPotencia()) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca()) && Integer.parseInt(filtro) >= ((Veiculo) obj).getPotencia() && ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        } else if (tipoFiltro.equals("nLugares")) {
            for (int i = Veiculos.veiculos.tamanho() - 1; i >= 0; i--) {

                obj = Veiculos.veiculos.getObject(i);

               // System.out.println(listaLocacoes.estahVazia());
                if (listaLocacoes.estahVazia() == true && Integer.parseInt(filtro) >= ((Veiculo) obj).getnLugares()) {
                    System.out.println(obj.toString());
                }
                for (int j = 0; j < listaLocacoes.tamanho(); j++) {
                    Object obj1 = listaLocacoes.getObject(j);

                    if (!((Locacao) obj1).getPlacaDoVeiculoLocado().equals(((Veiculo) obj).getPlaca()) && Integer.parseInt(filtro) >= ((Veiculo) obj).getnLugares() && ((Locacao) obj1).getDataDevolucao() == null) {
                        System.out.println(obj.toString());
                    }
                }
            }
        }
    }
}