package pattern.templatemethod;


public class ICPP extends TemplateDeImpostCondicional{

	@Override
	double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	boolean deveUsarAmaximaOuMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
	
}
