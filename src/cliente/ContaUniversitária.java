package cliente;

public class ContaUniversit├íria extends Conta{
    public ContaUniversit├íria(String nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\tConta Universit├íria\n");
        super.imprimirExtrato();
    }
}
