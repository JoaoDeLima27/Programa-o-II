package Questao1;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (departamentos.size() < 10) {
            departamentos.add(departamento);
        } else {
            throw new IllegalArgumentException("Uma universidade pode ter no máximo 10 departamentos.");
        }
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
