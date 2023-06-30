package Classes;

public class Categoria { //Essa classe contém os atributos de uma categoria
    private int identificador;
    private String nome;

    public Categoria(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Categoria{" +
                "identificador=" + identificador +
                ", nome='" + nome + '\'' +
                '}';
    }
}

