package br.com.aceleradev.domain;

public class DataLoader {
    String nome;
    String cpf;
    String login;

    //Aluno aluno = new Aluno(nome, login, cpf);
    Professor professor = new Professor(nome, login, cpf);
    //Disciplina disciplina = new Disciplina(nome);

    public void criaAluno() {
        Aluno aluno = new Aluno(nome, login, cpf);
    }

    public void criaProfessor() {
        Professor professor = new Professor(nome, login, cpf);
    }

    public void criaDisciplina(){
        Disciplina disciplina = new Disciplina(nome, professor);
    }



    /*

    public void criaDisciplina() {
        Disciplina disciplina = new Disciplina(nome, )

    }

     */

    /*
    public void criaProfessor(nome, login, cpf) {
        Professor professor = new Professor(nome, login, cpf);
    }

    public void criaDisciplina(nome, Professor) {
        Disciplina disciplina = new Disciplina(nome, professor);
    }
    */
}
