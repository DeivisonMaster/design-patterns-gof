package pattern.chain.of.responsibility;

public class TestDesconto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600);
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		
		orcamento.adicionaItem(new Item("pencil", 2.50));
		orcamento.adicionaItem(new Item("pen", 1.50));
		
		double calc = calculadorDeDesconto.calcula(orcamento);
		
		System.out.println(calc);
	}
}
