package monteseupc;
import java.util.Scanner;
public class MemoriaRam extends Componente {
    //Atributos da Memoria Ram
    private int capacidade;
    private String tipo;

    public MemoriaRam(String marca, String modelo, double preco, int capacidade, String tipo) {
        super(marca, modelo, preco);
        this.capacidade = capacidade;
        this.tipo = tipo;
    }
    
    //métodos construtores que permite alterar valor
    public int getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
     public String gettipo(){
        return tipo;
    }
    
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    
    //Opção de escolha para usuario
    public static MemoriaRam escolherMemoriaRam() {
        System.out.println("Opcoes de Memoria RAM:");
        System.out.println("1. Corsair Vengeance 8GB - R$ 300.00");
        System.out.println("2. Kingston HyperX 16GB - R$ 500.00");
        System.out.print("Escolha uma opcao (1 ou 2): ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("--------------------------------------------------");

        switch (escolha) {
            case 1 -> {
                return new MemoriaRam("Corsair", "Vengeance", 300.0, 8, "DDR4");
            }
            case 2 -> {
                return new MemoriaRam("Kingston", "HyperX", 500.0, 16, "DDR4");
            }
            default -> {
                System.out.println("Opcao invalida. Memoria RAM padrao selecionada.");
                return new MemoriaRam("Corsair", "Vengeance", 300.0, 8, "DDR4");
            }
        }
    }

    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Memoria RAM: " + getMarca() + getModelo() + " | Capacidade: " + getCapacidade() + "GB | Frequencia: " + gettipo();
        System.out.println(especificacoes);
        System.out.println("");
    }
}

