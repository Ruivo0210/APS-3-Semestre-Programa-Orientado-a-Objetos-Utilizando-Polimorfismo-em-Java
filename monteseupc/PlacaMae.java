package monteseupc;
import java.util.Scanner;
public class PlacaMae extends Componente {
    //Atributos da placa mãe
    private String formato;
    private int slotsMemoria;

    public PlacaMae(String marca, String modelo, double preco, String formato, int slotsMemoria) {
        super(marca, modelo, preco);
        this.formato = formato;
        this.slotsMemoria = slotsMemoria;
    }
    
    //métodos construtores que permite alterar valor
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getSlotsMemoria() {
        return slotsMemoria;
    }
    
    public void setSlotsMemoria(int slots) {
       this.slotsMemoria = slots;
    }

    public static PlacaMae escolherPlacaMae() {
        System.out.println("Opcoes de Placa Mae:");
        System.out.println("1. ASUS PRIME B450M-GAMING/BR - R$ 500.00");
        System.out.println("2. Gigabyte B550 AORUS ELITE - R$ 800.00");
        System.out.print("Escolha uma opcao (1 ou 2): ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("--------------------------------------------------");
        
        switch (escolha) {
            case 1 -> {
                return new PlacaMae("ASUS", "PRIME B450M-GAMING/BR", 500.0, "Micro ATX", 4);
            }
            case 2 -> {
                return new PlacaMae("Gigabyte", "B550 AORUS ELITE", 800.0, "ATX", 4);
            }
            default -> {
                System.out.println("Opcao invalida. Placa Mae padrao selecionada.");
                return new PlacaMae("ASUS", "PRIME B450M-GAMING/BR", 500.0, "Micro ATX", 4);
            }
        }
    }

    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Placa Mae: " + getMarca() + getModelo() + " | Slots de Memoria: " + getSlotsMemoria();
        System.out.println(especificacoes);
        System.out.println("");
    }
}
