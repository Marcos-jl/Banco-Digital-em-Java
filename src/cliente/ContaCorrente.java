package cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(String nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\tConta Corrente\n");
        super.imprimirExtrato();
    }
}
