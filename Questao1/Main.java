package Questao1;

public class Main {
    public static void main(String[] args) {
        // Criando a universidade
        Universidade universidade = new Universidade("UFPA");

        // Criando departamentos
        Departamento dep1 = new Departamento("Departamento de Ciência da Computação");
        Departamento dep2 = new Departamento("Departamento de Matemática");
        Departamento dep3 = new Departamento("Departamento de Física");

        // Adicionando departamentos à universidade
        universidade.adicionarDepartamento(dep1);
        universidade.adicionarDepartamento(dep2);
        universidade.adicionarDepartamento(dep3);

        // Criando pessoas e associando aos departamentos
        Pessoa pessoa1Dep1 = new Pessoa("Maria", "maria@gmail.com", "123456789");
        Pessoa pessoa2Dep1 = new Pessoa("joão", "joao@gmail.com", "987654321");
        dep1.adicionarPessoa(pessoa1Dep1);
        dep1.adicionarPessoa(pessoa2Dep1);

        Pessoa pessoa1Dep2 = new Pessoa("Carlos", "carlos@gmail.com", "456123789");
        Pessoa pessoa2Dep2 = new Pessoa("Diana", "diana@gmail.com", "789123456");
        dep2.adicionarPessoa(pessoa1Dep2);
        dep2.adicionarPessoa(pessoa2Dep2);

        Pessoa pessoa1Dep3 = new Pessoa("Eva", "eva@gmail.com", "159753456");
        Pessoa pessoa2Dep3 = new Pessoa("Frank", "frank@gmail.com", "753951852");
        dep3.adicionarPessoa(pessoa1Dep3);
        dep3.adicionarPessoa(pessoa2Dep3);

        // Exibindo informações da universidade e departamentos
        System.out.println("Universidade: " + universidade.getNome());
        System.out.println("\nDepartamentos e Pessoas:");
        for (Departamento departamento : universidade.getDepartamentos()) {
            System.out.println("Departamento: " + departamento.getNome());
            for (Pessoa pessoa : departamento.getPessoas()) {
                System.out.println(" - " + pessoa.getNome());
            }
        }
    }
}