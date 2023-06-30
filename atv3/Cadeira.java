public class Cadeira implements Controller{
    
    private Aluno[] alunos;
    private int totalAlunos = 0;

    public Cadeira() {
        this.alunos = new Aluno[30];
    }

    public void adicionar(Object aluno){
        if(aluno instanceof Aluno){
        this.alunos[totalAlunos] =(Aluno)aluno;
        totalAlunos++;
    }
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

    public boolean cheio() {
        if(totalAlunos == this.alunos.length)
            return true;
        return false;
    }

    public boolean remove(String nome) {
        int indice = -1;
        for(int i = 0; i < this.alunos.length; i++){
                if(nome == alunos[i].getNome()){
                    indice = i;
                    break;
                }

        }
        if(indice != -1){
            for(int i = indice; i < this.alunos.length-1; i++)
            this.alunos[i] = this.alunos[i +1];
            totalAlunos--;
            return true;
        }

        
        return false;
    }

}