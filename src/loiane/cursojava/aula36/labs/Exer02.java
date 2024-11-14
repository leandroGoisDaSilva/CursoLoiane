package loiane.cursojava.aula36.labs;

public class Exer02 {
    public static void main(String[] args) {

        Curso curso = new Curso();
        System.out.println("Nome do Curso: ");
        curso.setNome("Java");
        System.out.println(curso.getNome());//Mostra no console
        curso.setHorario("13h às 17h");
        System.out.println(curso.getHorario() + "\n");//Mostra no console


        Professor professor = new Professor();
        professor.setNome("Samuca");
        System.out.println(professor.getNome());
        professor.setDepartamento("Infraestrutura");
        System.out.println(professor.getDepartamento());
        professor.setEmail("samuca@samuel.java.com");
        System.out.println(professor.getEmail());

        curso.setProfessor(professor);

        System.out.println("**************************");
        System.out.println("=====ALUNOS======");

        Aluno[] alunos = new Aluno[5];






    }
}
