package aula9ex2;

public class Principal {

    public static void main(String[] args) {
        
        Professor professor = new Professor("\nProfessor 1\n");
        System.out.println(professor);
        System.out.print("\n");
        
        Professor professorFisica = new Professor("\nProfessor 2\n", 300.0f);
        System.out.println(professorFisica);
        System.out.print("\n\n");
    }
    
}
