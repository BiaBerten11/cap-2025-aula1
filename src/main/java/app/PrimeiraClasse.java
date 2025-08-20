package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Gradle!!!");

        Aluno al = new Aluno();
        al.setId(1);
        al.setNome("Perereco");
        al.setIdade(141);

        System.out.println(al.getNome());
    }
}