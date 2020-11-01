package br.com.alura.design.pattern.facades.singleton;

class ServicoSingleton {
	private static Servico instancia;

	public Servico getInstancia() {
		if (instancia == null) {
			instancia = new Servico();
		}
		return instancia;
	}
}