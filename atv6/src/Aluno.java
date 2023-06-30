public class Aluno {

    private String nome;
    private int idade;
    private float notas[];
    private int totalNotas = 5;
    private int matricula;

    public Aluno(int matricula, String nome, int idade){
        this .matricula = matricula;
        this.setNome(nome);
        this.setIdade(idade);
        this.notas = new float[totalNotas];
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNotas(int nNota){
        return notas[nNota];
    }

    public  void adicionar(float nota){
        this.notas[totalNotas] = nota;
        totalNotas++;
    }

    public int tamanho(){
        return totalNotas;
    }

    public boolean contem(float nota){
        for(int i = 0; i < totalNotas; i++){
            if(nota != this.notas[i]){
                return true;
            }

        }
        return false;
    }

    public String toString() {

        return this.nome+" | "+this.idade;

    }

    public boolean equals(Aluno aluno) {

        if(this.matricula == aluno.matricula)
            return true;
        return false;

    }

}
