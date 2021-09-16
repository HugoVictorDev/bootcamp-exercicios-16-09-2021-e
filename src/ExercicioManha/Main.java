package ExercicioManha;

import ExercicioManha.model.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Instanciando pessoas
        Pessoa pessoa1 = new Pessoa("Hugo", "Rua carlos bigatti", "11958915403", 28, 1.87);
        Pessoa pessoa2 = new Pessoa("Jessica", "Rua inelzir jauer", "12958924523", 20, 1.86);
        Pessoa pessoa3 = new Pessoa("Carlos", "Rua bertoli maures", "13958915404", 45, 1.85);
        Pessoa pessoa4 = new Pessoa("Roberto", "Rua partio zerar", "13958914303", 22, 1.84);
        Pessoa pessoa5 = new Pessoa("Vagner", "Rua kain corses", "15958915403", 23, 1.83);
        Pessoa pessoa6 = new Pessoa("Marcos", "Rua paulo cezar", "48958915405", 24, 1.82);
        Pessoa pessoa7 = new Pessoa("Patricia", "Rua mario soiuza", "1195891546", 23, 1.81);
        Pessoa pessoa8 = new Pessoa("Mauri", "Rua meireless jose", "11958915405", 26, 1.70);
        Pessoa pessoa9 = new Pessoa("Kaue", "Rua bauer bigatti", "11958915405", 27, 1.71);
        Pessoa pessoa10 = new Pessoa("Aarol", "Rua kuses bigatti", "11958915433", 30, 1.72);

        //Lista de pessoas
       List<Pessoa> listaDePessoas2 = new ArrayList<>();

        //Instanciando agenda e adicionando pessoas na lista de pessoas na agenda
        Agenda agenda = new Agenda(listaDePessoas2);
        agenda.armazenarPessoa(pessoa1);
        agenda.armazenarPessoa(pessoa2);
        agenda.armazenarPessoa(pessoa3);
        agenda.armazenarPessoa(pessoa4);
        agenda.armazenarPessoa(pessoa5);
        agenda.armazenarPessoa(pessoa6);
        agenda.armazenarPessoa(pessoa7);
        agenda.armazenarPessoa(pessoa8);
        agenda.armazenarPessoa(pessoa9);
        agenda.armazenarPessoa(pessoa10);


        //remover pessoa
        agenda.removerPessoa(pessoa1);

        //Busque a pessoa pelo nome
        System.out.println("------Buscando pessoa pelo Nome----------"+"\n");
        agenda.busqueUmaPessoaPeloNome("Carlos");


        //Apresenta todas as pessoas da agenda
        System.out.println("\n"+"------Mostrando todas as pessoas da agenda------"+"\n");
        agenda.mostrarTodasPessoasDaAgenda();


        //Busque uma pessoa em especifico
        System.out.println("\n"+"------Buscando pessoa em especifico------"+"\n");
        agenda.busqueUmaPessoaEmEspecifico(pessoa2);

        //Ordenando agenda por nome
        System.out.println("\n"+"------Ordenando lista por nome------"+"\n");
        agenda.ordenarAgendaPorNome();

            // Ordenando agenda por ordem alfabetica
        System.out.println("\n"+"------Ordenando lista por ordem albatica de endereco------"+"\n");
        agenda.ordenarAgendaPorEndereco();

        System.out.println("\n"+"------Ordenando lista por Idade------"+"\n");
        agenda.ordenarAgendaPorIdadeDecrecente();


    }
}
