package monteseupc;
import java.util.ArrayList; //Importação de uma função para listas
public class Computador {
    //Atributos do computador 
    private ArrayList<Componente> componentes; //Lista que irá armazenar os componentes do computador
    private double precoTotal; //Variável que irá somar o preço de todos os componentes

    public Computador() {
        componentes = new ArrayList<>();
        precoTotal = 0.0;
    }
    
    //Método para adicionar o componente a lista e também realizar a soma do produto para o valor total
    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
        precoTotal += componente.getPreco();
    }
    
    //Método para exibir as informações do computador escolhido pelo usuário
    public void exibirEspecificacoes() {
        System.out.println("           Configuracao do Computador             ");
        System.out.println("--------------------------------------------------");
        for (Componente componente : componentes) {
            componente.exibirEspecificacoes();
        }
    }
    
    //Método para retornar o valor total
    public double calcularTotal() {
        return precoTotal;
    }
}
