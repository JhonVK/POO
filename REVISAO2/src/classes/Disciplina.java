package classes;

import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private int maxAlunos;
    private String nomeDisciplina;

    public Disciplina(Professor professor, int max, String nome){
        this.professor=professor;
        this.maxAlunos=max;
        this.nomeDisciplina=nome;
        this.alunos= new ArrayList<>(max);

    }
}
