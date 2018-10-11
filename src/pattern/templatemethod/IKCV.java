package pattern.templatemethod;

public class IKCV extends TemplateDeImpostCondicional{

	@Override
	double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	boolean deveUsarAmaximaOuMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}
	
	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}
}
