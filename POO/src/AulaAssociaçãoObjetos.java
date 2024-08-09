class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Curso {
    private String nome;
    private Professor professor; // tipo professor. Isso representa uma associação entre 'Curso' e 'Professor'.

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }    

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void mostraDetalhes() {
        System.out.println("Curso " + nome);
        System.out.println("Professor: " + professor.getNome());
    }
}

public class AulaAssociaçãoObjetos {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. João");
        Curso curso = new Curso("Engenharia de Software", professor);

        curso.mostraDetalhes();
    }
}