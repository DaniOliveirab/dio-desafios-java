import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class MainBootCapm {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHelena = new Dev();
        devHelena.setNome("Helena");
        devHelena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Helena:" + devHelena.getConteudosInscritos());
        devHelena.progredir();
        devHelena.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Helena:" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos HelenA:" + devHelena.getConteudosConcluidos());
        System.out.println("XP:" + devHelena.calcularTotalXp());

        System.out.println("__________________________");

        Dev devDanielly = new Dev();
        devDanielly.setNome("Danielly");
        devDanielly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Danielly:" + devDanielly.getConteudosInscritos());
        devDanielly.progredir();
        devDanielly.progredir();
        devDanielly.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Danielly:" + devDanielly.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Danielly:" + devDanielly.getConteudosConcluidos());
        System.out.println("XP:" + devDanielly.calcularTotalXp());

    }

}
