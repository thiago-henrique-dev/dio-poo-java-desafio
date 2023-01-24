import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Orange Tech Back End");
        bootcamp.setDescricao("Descricao Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Thiago" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        System.out.println("Conteudos incritos Thiago" + devThiago.getConteudosInscritos());
        System.out.println("Conteudos concluidos Thiago" + devThiago.getConteudosConcluidos());
        System.out.println("XP:" + devThiago.calcularTotalXp());



        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteudos incritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos concluidos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());



    }
}