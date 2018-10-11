package pattern.chain.of.responsibility;

public interface Desconto {
	
	double calcula(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
}
