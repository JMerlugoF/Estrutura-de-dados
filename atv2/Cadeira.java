public class Cadeira {

    private Aluno[] alunos;
    private int totalAlunos;

    public Cadeira() {
        this.alunos = new Aluno[30];
    }

    public void adicionar(Aluno aluno){
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }
    
    public int tamanho(){
        return totalAlunos;
    }
    
    public boolean contem(String nome){
        for(int i = 0; i < totalAlunos; i++){
            if(nome == this.alunos[i].getNome()){
                return true;
            }
        
    }
        return false;
    }





}
