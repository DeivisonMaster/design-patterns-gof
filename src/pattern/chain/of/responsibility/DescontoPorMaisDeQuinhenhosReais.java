package pattern.chain.of.responsibility;

public class DescontoPorMaisDeQuinhenhosReais implements Desconto{
	private Desconto desconto;
	
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.07;
		}else {
			return this.desconto.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}
}
