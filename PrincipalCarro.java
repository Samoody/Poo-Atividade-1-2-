// PrincipalCarro.java
public class PrincipalCarro {
    public static void main(String[] args) {
        // Criando dois carros
        Carro carro1 = new Carro("Fusca", "Azul", 1980);
        Carro carro2 = new Carro("Civic", "Preto", 2022);

        // Exibindo informações
        System.out.println("Informações iniciais:");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        // Operações no carro1
        carro1.ligar();
        carro1.exibirInformacoes();

        carro1.desligar();
        carro1.exibirInformacoes();
    }
}
