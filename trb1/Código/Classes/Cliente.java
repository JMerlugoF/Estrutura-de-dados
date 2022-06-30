package Classes;

import Listas.LDE;
import Listas.Lista;

public class Cliente { //Essa classe contém os atributos de um cliente
	static Lista clientes = new LDE();
    private int CNH;
    private String nome;
    private int telefone;
    private  int CPF;

    public Cliente(int CNH, String nome, int telefone, int CPF){

        this.CNH = CNH;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;

    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public String toString() {
        return "Clientes [Nome = " + nome + ", CPF = " + CPF + ", CNH = " + CNH + "e Telefone = " + telefone + "]";
    }

}
