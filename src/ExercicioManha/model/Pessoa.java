package ExercicioManha.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Pessoa {

    String nome;
    String endereco;
    String telefone;
    Integer idade;
    Double altura;



public Pessoa(String nome, String endereco, String telefone, Integer idade, Double altura){

    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
    this.altura = altura;

}

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

}