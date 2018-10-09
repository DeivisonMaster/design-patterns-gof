package pattern.strategy;

public class CalculadorDeImposto {

	/**
	 * @author Deivison
	 * @description: calculate tax (orcamento) on the value of the budget
	 */
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double impostos = imposto.realizaCalculo(orcamento);
		System.out.println(imposto);
	}
}
