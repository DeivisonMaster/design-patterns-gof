package pattern.chain.of.responsibility;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		DescontoPorCincoItens descontoPorCincoItens = new DescontoPorCincoItens();
		DescontoPorMaisDeQuinhentosReais descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		SemDesconto semDesconto = new SemDesconto();

		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);

		return descontoPorCincoItens.desconto(orcamento);
	}
}
