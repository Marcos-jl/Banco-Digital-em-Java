package cliente;

public class ContaUniversitária extends Conta{
    public ContaUniversitária(String nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\tConta Universitária\n");
        super.imprimirExtrato();
    }
}
