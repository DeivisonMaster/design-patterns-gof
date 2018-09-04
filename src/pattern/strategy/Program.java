package pattern.strategy;

public class Program {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss  = new ISS();
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		Orcamento orcamento = new Orcamento(500.0);
		
		calculador.realizaCalcula(orcamento, iss);
		calculador.realizaCalcula(orcamento, icms);
	}
}	
