package pattern.chain.of.responsibility;

public class CalculadorDeDesconto {

	/**
	 * @author Deivison
	 * @category chain of responsability
	 * @description calculates the discount based on the value of the budget
	 * */
	public double calcula(Orcamento orcamento) {
		double calcula = 0;
		
		DescontoPorCincoItens descontoPorCincoItens = new DescontoPorCincoItens();
		DescontoPorMaisDeQuinhenhosReais descontoPorMaisDeQuinhenhosReais = new DescontoPorMaisDeQuinhenhosReais();
		SemDesconto semDesconto = new SemDesconto();
		
		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhenhosReais);
		descontoPorMaisDeQuinhenhosReais.setProximo(semDesconto);
		
		return descontoPorCincoItens.calcula(orcamento);
	}
}
