// Carro.java
public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado;

    // Construtor
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false; // Por padrão, começa desligado
    }

    // Métodos
    public void ligar() {
        this.ligado = true;
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O carro está desligado.");
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("-----------------------");
    }
}
