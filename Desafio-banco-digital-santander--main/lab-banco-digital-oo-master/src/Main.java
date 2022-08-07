
public class Main {

	public static void main(String[] args) {
		Cliente ellen = new Cliente();
		ellen.setNome("ellen");
		
		Conta cc = new ContaCorrente(ellen);
		Conta poupanca = new ContaPoupanca(ellen);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
