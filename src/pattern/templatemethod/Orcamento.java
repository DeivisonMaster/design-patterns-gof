package pattern.templatemethod;

import java.util.Collections;
import java.util.List;

public class Orcamento {
	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
}
