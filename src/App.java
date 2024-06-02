public class App {
    public static void main(String[] args) throws Exception {
        Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
      
        Conta poupanca = new ContaCorrente(venilton);
        
        cc.depositar(100);
        cc.transferir(60, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
