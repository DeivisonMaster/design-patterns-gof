package pattern.chain.of.responsibility;

public class Program {
	public static void main(String[] args) {
		CalculadorDeDesconto calculadora = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("caneta", 250.0));
		orcamento.adicionaItem(new Item("lapis", 250.0));
		
		double descontoFinal = calculadora.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
