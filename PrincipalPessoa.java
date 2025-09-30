// PrincipalPessoa.java
public class PrincipalPessoa {
    public static void main(String[] args) {
        // Criando objeto Pessoa
        Pessoa p1 = new Pessoa("João", 20);

        // Exibindo atributos
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        // Atualizando atributos
        p1.setNome("Maria");
        p1.setIdade(25);

        System.out.println("\nApós atualização:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        // Fazendo aniversário
        p1.fazerAniversario();
        System.out.println("\nDepois do aniversário:");
        System.out.println("Idade: " + p1.getIdade());
    }
}
