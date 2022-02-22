package cliente;

public class ContaSalário extends Conta{
    public ContaSalário(String nome) {
        super(nome);
    }
        @Override
        public void imprimirExtrato(){
            System.out.println("\tConta Salário\n");
            super.imprimirExtrato();

    }
}
