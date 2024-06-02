public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Fulano");
		
		
        Banco banco = new Banco("");
        
        
        banco.adicionarCliente(venilton);
        banco.adicionarCliente(cliente2);

       
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaCorrente(venilton);
        
        cc.depositar(100);
        cc.transferir(60, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    
        
        banco.listarClientes();
    }
}
