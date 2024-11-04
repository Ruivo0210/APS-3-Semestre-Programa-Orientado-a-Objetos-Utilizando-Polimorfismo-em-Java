package monteseupc;
import java.util.Scanner;
public class PlacaVideo extends Componente {
    //Atributos da placa de vídeo
    private int memoria;
    private String fabricante;

    public PlacaVideo(String marca, String modelo, double preco, int memoria, String fabricante) {
        super(marca, modelo, preco);
        this.memoria = memoria;
        this.fabricante = fabricante;
    }
    
    //métodos construtores que permite alterar valor
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
       this.fabricante = fabricante;
    }
    
    public static PlacaVideo escolherPlacaVideo() {
        System.out.println("Opcoes de Placa de Video:");
        System.out.println("1. NVIDIA GeForce GTX 1660 Super - R$ 1500.00");
        System.out.println("2. AMD Radeon RX 5700 XT - R$ 2000.00");
        System.out.print("Escolha uma opcao (1 ou 2): ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("--------------------------------------------------");

        switch (escolha) {
            case 1 -> {
                return new PlacaVideo("NVIDIA", "GeForce GTX 1660 Super", 1500.0, 6, "ASUS");
            }
            case 2 -> {
                return new PlacaVideo("AMD", "Radeon RX 5700 XT", 2000.0, 8, "Gigabyte");
            }
            default -> {
                System.out.println("Opcao invalida. Placa de Vídeo padrao selecionada.");
                return new PlacaVideo("NVIDIA", "GeForce GTX 1660 Super", 1500.0, 6, "ASUS");
            }
        }
    }

    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Placa de Video: "+ getMarca() + getModelo() + " | VRAM: " + getMemoria() + "GB | Tipo de Conexao: " + getFabricante();
        System.out.println(especificacoes);
        System.out.println("");
    }
}
