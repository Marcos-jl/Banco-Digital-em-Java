package banco;

import cliente.*;

public class AberturaConta {
    protected Conta cc, cp, cs, c;

    public AberturaConta(String nome){
        cc = new ContaCorrente(nome);
        cp = new ContaPoupança(nome);
        cs = new ContaSalário(nome);
        c = new ContaUniversitária(nome);
    }
}
