package pattern.strategy;

public class ICMS implements Imposto{
	
	public double realizaCalculo(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
