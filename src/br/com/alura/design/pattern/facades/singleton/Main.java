package br.com.alura.design.pattern.facades.singleton;

public class Main {
	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		
		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);
		facade.fazContato(cliente, cobranca);
		facade.geraCobranca(fatura);
		
	}
}
