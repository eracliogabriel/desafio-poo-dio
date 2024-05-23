import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Atividades relacionados a Java Web");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica de Programação");
        curso2.setDescricao("Projetos com Algoritmos");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java Web");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

		/*
		 * Dev devCamila = new Dev(); devCamila.setNome("Camila");
		 * devCamila.inscreverBootcamp(bootcamp);
		 * System.out.println("Conteúdos Inscritos Camila:" +
		 * devCamila.getConteudosInscritos()); devCamila.progredir();
		 * devCamila.progredir(); System.out.println("-");
		 * System.out.println("Conteúdos Inscritos Camila:" +
		 * devCamila.getConteudosInscritos());
		 * System.out.println("Conteúdos Concluídos Camila:" +
		 * devCamila.getConteudosConcluidos()); System.out.println("XP:" +
		 * devCamila.calcularTotalXp());
		 * 
		 * System.out.println("******************** FIM **********************");
		 * 
		 * Dev devJoao = new Dev(); devJoao.setNome("Joao");
		 * devJoao.inscreverBootcamp(bootcamp);
		 * System.out.println("Conteúdos Inscritos João:" +
		 * devJoao.getConteudosInscritos()); devJoao.progredir(); devJoao.progredir();
		 * devJoao.progredir(); System.out.println("-");
		 * System.out.println("Conteúdos Inscritos João:" +
		 * devJoao.getConteudosInscritos());
		 * System.out.println("Conteúdos Concluidos João:" +
		 * devJoao.getConteudosConcluidos()); System.out.println("XP:" +
		 * devJoao.calcularTotalXp());
		 * 
		 * 
		 * System.out.println("******************** FIM **********************");
		 */
        
        Dev EraclioDev = new Dev();
        EraclioDev.setNome("Eraclio");
        EraclioDev.inscreverBootcamp(bootcamp);
        System.out.println(String.format("Desenvolvedor: %s", EraclioDev.getNome()));
        System.out.println("Conteúdos Inscritos:" + EraclioDev.getConteudosInscritos());
        System.out.println(EraclioDev.getConteudosConcluidos());
        System.out.println("XP:" + EraclioDev.calcularTotalXp());
        System.out.println("-----------------");
        EraclioDev.progredir();
        System.out.println(EraclioDev.getConteudosConcluidos());
        System.out.println("XP Atual:" + EraclioDev.calcularTotalXp());
        System.out.println("-----------------");
        System.out.println("Conteúdos Restantes:" + EraclioDev.getConteudosInscritos());
        System.out.println("-----------------");
        EraclioDev.progredir();
        System.out.println(EraclioDev.getConteudosConcluidos());
        System.out.println("XP Atual:" + EraclioDev.calcularTotalXp());
        System.out.println("-----------------");
        System.out.println("Conteúdos Restantes:" + EraclioDev.getConteudosInscritos());
        System.out.println("-----------------");
        EraclioDev.progredir();
        System.out.println(EraclioDev.getConteudosConcluidos());
        System.out.println("XP Atual:" + EraclioDev.calcularTotalXp());
        System.out.println("-----------------");
    }

}
