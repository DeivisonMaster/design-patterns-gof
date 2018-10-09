package pattern.strategy;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ICMS();

		Orcamento orcamento = new Orcamento(500);
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, icms);
	}
}
