package app;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Gradle!!!");

        Aluno al = new Aluno();
        al.setId(1);
        al.setNome("Perereco");
        al.setIdade(141);

        System.out.println(al.getNome());



        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Estrutura de Dados");
        t1.setConcluido(true);

        Tarefa t2 = t1;
        t2.setDescricao("Exemplo de tarefa");

        System.out.println(t1.getDescricao());
        System.out.println(t2.getDescricao());

        List <Atividade> agenda = new ArrayList<Atividade>();
        agenda.add(t1);
        Compromisso c1 = new Compromisso();
        agenda.add(c1);

        System.out.println(t1);
    }
}