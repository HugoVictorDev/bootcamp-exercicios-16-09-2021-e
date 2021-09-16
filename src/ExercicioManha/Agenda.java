package ExercicioManha;

import ExercicioManha.model.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda{

    private List<Pessoa> listaDePessoas;


    public Agenda(List<Pessoa> listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }

    //metodo adicionar pessoa na lista
    public void armazenarPessoa(Pessoa pessoa){
        listaDePessoas.add(pessoa);

    }

    //metódo remover pessoa da lista
    public void removerPessoa(String nome){
        Pessoa p = listaDePessoas.stream()
                .filter(pegarNome -> pegarNome.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .get();
        listaDePessoas.remove(p);
    }

    //metodo busque uma pessoa pelo nome
    public void busqueUmaPessoaPeloNome(String nome){
                 listaDePessoas.stream()
                .filter(porNome -> porNome.getNome().equalsIgnoreCase(nome))
                .forEach(System.out::println);

    }

    //metodo mostrar todas pessoas em um arraylist
    public void mostrarTodasPessoasDaAgenda(){
        listaDePessoas.stream()
                .forEach(System.out::println);
    }


    public void busqueUmaPessoaEmEspecifico(Pessoa pessoa){
                listaDePessoas.stream()
                .filter(consulta -> consulta == (pessoa))
                .forEach(System.out::println);
    }

    public void ordenarAgendaPorNome(){
                listaDePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }


    public void ordenarAgendaPorEndereco(){
                listaDePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getEndereco))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }


    public void ordenarAgendaPorIdadeDecrecente(){
                listaDePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
