public class Aluno {
    private String nome;
    private int idade;
    private float notas[];
    private int totalNotas = 0;
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.notas = new float[3];
    }
    
    public String getNome(){
        return this.nome;
    }


    public void adicionarNotas(float nota){
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
}
