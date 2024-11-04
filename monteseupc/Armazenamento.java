package monteseupc;
import java.util.Scanner;
public class Armazenamento extends Componente {
    //Atributos do HD de armazenamento
    private int capacidade;
    private String tipo;
    
    public Armazenamento(String marca, String modelo, double preco, int capacidade, String tipo) {
        super(marca, modelo, preco);
        this.capacidade = capacidade;
        this.tipo = tipo;
    }
    
    //métodos construtores que permite alterar valor
    public int getcapacidade(){
        return capacidade;
    }
    
    public void setcapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
     public String gettipo(){
        return tipo;
    }
    
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    
    //Opção de escolha para usuario
    public static Armazenamento escolherArmazenamento() {
        System.out.println("Opcoes de Armazenamento:");
        System.out.println("1. Samsung SSD 500GB - R$ 400.00");
        System.out.println("2. Western Digital HDD 1TB - R$ 200.00");
        System.out.print("Escolha uma opcao (1 ou 2): ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("--------------------------------------------------");

        switch (escolha) {
            case 1 -> {
                return new Armazenamento("Samsung", "SSD", 400.0, 500, "SSD");
            }
            case 2 -> {
                return new Armazenamento("Western Digital", "HDD", 200.0, 1000, "HDD");
            }
            default -> {
                System.out.println("Opcao invalida. Armazenamento padrao selecionado.");
                return new Armazenamento("Samsung", "SSD", 400.0, 500, "SSD");
            }
        }
    }

    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Armazenamento: " + getMarca() + getModelo() + " | Capacidade: " + getcapacidade() + "GB | Tipo: " + gettipo();
        System.out.println(especificacoes);
        System.out.println("");
    }
}

