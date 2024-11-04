package monteseupc;
public class MonteseuPc {
    public static void main(String[] args) {
        Computador computador = new Computador();
        
        System.out.println("--------------------------------------------------");
        System.out.println("           Bora montar seu computador!?           ");
        System.out.println("         Rapido e Pratico, sem enrolacao!         ");
        System.out.println("--------------------------------------------------");
        
        //Componentes do computador:
        Processador processador = Processador.escolherProcessador();
        computador.adicionarComponente(processador);
        
        PlacaMae placamae = PlacaMae.escolherPlacaMae();
        computador.adicionarComponente(placamae);
        
        PlacaVideo placavideo = PlacaVideo.escolherPlacaVideo();
        computador.adicionarComponente(placavideo);

        MemoriaRam memoriaRam = MemoriaRam.escolherMemoriaRam();
        computador.adicionarComponente(memoriaRam);
        
        Fonte fonte = Fonte.escolherFonte();
        computador.adicionarComponente(fonte);
        
        Armazenamento hd = Armazenamento.escolherArmazenamento();
        computador.adicionarComponente(hd);
        
        //Exibir as especificações do computador
        computador.exibirEspecificacoes();

        // Calcular o preço total do computador
        double precoTotal = computador.calcularTotal();
        System.out.println("Preco Total: R$ " + precoTotal);
    }
}

