package cliente;

public class ContaPoupança extends Conta{
    public ContaPoupança(String nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\tConta Poupança\n");
        super.imprimirExtrato();
    }
}
