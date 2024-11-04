package monteseupc;
import java.util.Scanner;
public class Fonte extends Componente {
    //Atributos da fonte
    private int potencia;
    private String certificacao;

    public Fonte (String marca, String modelo, double preco, int potencia, String certificacao) {
        super(marca, modelo, preco);
        this.potencia = potencia;
        this.certificacao = certificacao;
    }
    
    //métodos construtores que permite alterar valor
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCertificacao() {
        return certificacao;
    }
    
    public void setCertificacao(String certificacao) {
       this.certificacao = certificacao;
    }
    
    public static Fonte escolherFonte() {
        System.out.println("Opcoes de Fonte de Energia:");
        System.out.println("1. Corsair CX550M 550W - R$ 300.00");
        System.out.println("2. EVGA SuperNOVA 750 G3 750W - R$ 500.00");
        System.out.print("Escolha uma opcao (1 ou 2): ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("--------------------------------------------------");

        switch (escolha) {
            case 1 -> {
                return new Fonte("Corsair", "CX550M", 300.0, 550, "80 Plus Bronze");
            }
            case 2 -> {
                return new Fonte("EVGA", "SuperNOVA 750 G3", 500.0, 750, "80 Plus Gold");
            }
            default -> {
                System.out.println("Opcao invalida. Fonte de Energia padrao selecionada.");
                return new Fonte("Corsair", "CX550M", 300.0, 550, "80 Plus Bronze");
            }
        }
    }

    @Override
    public void exibirEspecificacoes() {
        String especificacoes = "Fonte de Energia: " + getMarca() + getModelo() + " | Potencia: " + getPotencia() + "W | Eficiencia: " + getCertificacao();
        System.out.println(especificacoes);
        System.out.println("");
    }
}

