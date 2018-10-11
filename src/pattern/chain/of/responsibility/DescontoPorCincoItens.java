package pattern.chain.of.responsibility;

public class DescontoPorCincoItens implements Desconto{
	private Desconto desconto;

	public double calcula(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}else {
			return this.desconto.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}
}
