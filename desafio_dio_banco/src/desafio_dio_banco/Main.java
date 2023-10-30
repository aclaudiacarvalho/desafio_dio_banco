package desafio_dio_banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente Dinha = new Cliente();
		Dinha.setNome("Claudia");
		
		
		Conta cc = new ContaCorrente(Dinha);
		Conta poupanca = new ContaPoupanca(Dinha);
		
		cc.depositar(300);
		poupanca.depositar(200);
		
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}
