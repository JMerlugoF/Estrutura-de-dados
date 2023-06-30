public class Main{
    public static void main(String[] args) {
        FilaLista fila = new FilaLista();
        PilhaLista pilha = new PilhaLista();
        Aluno a1 = new Aluno(1, "joao", 11);
        Aluno a2 = new Aluno(2, "eduarda", 12);
        Aluno a3 = new Aluno(3, "leandro", 16);
        Aluno a4 = new Aluno(4, "romeu", 14);
        Aluno a5 = new Aluno(5, "jessica", 12);

        fila.add(a1);
        fila.add(a2);
        fila.add(a3);
        fila.add(a4);
        fila.add(a5);

        
        for(int i = 0; i < fila.size(); i++){
            pilha.Push(fila.getObject(i));
        }
        
        int tamFilaAgr = fila.size();
        
        for(int i = 0; i < tamFilaAgr; i++){
            fila.remove();
            fila.add(pilha.top());
            pilha.Pop();
        }
    }
}