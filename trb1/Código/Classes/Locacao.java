package Classes;

import java.text.SimpleDateFormat;
import Arquivos.*;
import Listas.*;

public class Locacao { // Essa classe contém os atributos de uma locacao
    private int cnhDoLocador;
    private String placaDoVeiculoLocado;
    private String dataRetirada;
    private String dataDevolucao;
    private float valorLocacao;

    public Locacao(int cnhDoLocador, String placaDoVeiculoLocado, String dataRetirada) {
        this.cnhDoLocador = cnhDoLocador;
        this.placaDoVeiculoLocado = placaDoVeiculoLocado;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = null;
        this.valorLocacao = 0;
    }

    public int getCnhDoLocador() {
        return cnhDoLocador;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public String getPlacaDoVeiculoLocado() {
        return placaDoVeiculoLocado;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setCnhDoLocador(int cnhDoLocador) {
        this.cnhDoLocador = cnhDoLocador;
    }
    
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public void setPlacaDoVeiculoLocado(String placaDoVeiculoLocado) {
        this.placaDoVeiculoLocado = placaDoVeiculoLocado;
    }

    public String toString() {
        return " CNH : " + this.cnhDoLocador + " Placa : " + this.placaDoVeiculoLocado + " Data de Retirada: "
                + this.dataRetirada + " Data de Devolucao: " + this.dataDevolucao + " Valor da Locacao: "
                + this.valorLocacao + "";
    }

}
