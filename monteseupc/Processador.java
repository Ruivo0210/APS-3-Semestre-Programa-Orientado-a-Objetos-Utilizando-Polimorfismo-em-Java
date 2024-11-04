package monteseupc;
import java.util.Scanner;
public class Processador extends Componente {
    //Atributos do processador
    private double frequencia;
    private int nucleos;
    
    public Processador(String marca, String modelo, double preco, double frequencia, int nucleos) {
        super(marca, modelo, preco);
        this.frequencia = frequencia;
        this.nucleos = nucleos;
    }
    
    //métodos construtores que permite alterar valor
    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    
    //Opção de escolha para usuario
    public static Processador escolherProcessador() {
    System.out.println("Opcoes de Processadores:");
    System.out.println("1. Intel Core i5 - R$ 1000.00");
    System.out.println("2. AMD Ryzen 7 - R$ 1500.00");
    System.out.print("Escolha uma opcao (1 ou 2): ");
    Scanner scanner = new Scanner(System.in);
    int escolha = scanner.nextInt();
    scanner.nextLine(); // Consumir a quebra de linha pendente
    
    System.out.println("--------------------------------------------------");

    switch (escolha) {
        case 1 -> {
            return new Processador("Intel", "Core i5", 1000.0, 3.2, 6);
            }
        case 2 -> {
            return new Processador("AMD", "Ryzen 7", 1500.0, 3.8, 8);
            }
        default -> {
            System.out.println("Opcao invalida. Processador padrao selecionado.");
            return new Processador("Intel", "Core i3", 800.0, 3.0, 4);
            }
        }
    
 }
    
    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Processador: " + getMarca() + getModelo() + " | Frequencia: " + getFrequencia() + " GHz | Nucleos: " + getNucleos();
        System.out.println(especificacoes);
        System.out.println("");
    }
}
