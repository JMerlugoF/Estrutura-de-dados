package Classes;

import java.util.Date;
import Arquivos.*;

public class Locacoes {
    private int cnhDoLocador;
    private String placaDoVeiculoLocado;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;

    public Locacoes(int cnhDoLocador, String placaDoVeiculoLocado, Date dataRetirada, Date dataDevolucao, float valorLocacao) {
        this.cnhDoLocador = cnhDoLocador;
        this.placaDoVeiculoLocado = placaDoVeiculoLocado;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
    }


}
