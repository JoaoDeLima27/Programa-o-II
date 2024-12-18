package Questao1;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Pessoa> pessoas;

    public Departamento(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

}
