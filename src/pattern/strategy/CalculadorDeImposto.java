package pattern.strategy;

public class CalculadorDeImposto {
	
	public void realizaCalcula(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println(valorImposto);
	}
}
