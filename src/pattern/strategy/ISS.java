package pattern.strategy;

public class ISS implements Imposto{
	
	public double realizaCalculo(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
