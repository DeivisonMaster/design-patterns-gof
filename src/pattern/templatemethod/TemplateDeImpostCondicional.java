package pattern.templatemethod;

public abstract class TemplateDeImpostCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarAmaximaOuMinimaTaxacao(orcamento)) {
			return taxacaoMaxima(orcamento);
		}else {
			return taxacaoMinima(orcamento);
		}
	}

	abstract double taxacaoMinima(Orcamento orcamento);

	abstract double taxacaoMaxima(Orcamento orcamento);

	abstract boolean deveUsarAmaximaOuMinimaTaxacao(Orcamento orcamento);

}
