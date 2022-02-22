package banco;

public class Main {
    public static void main(String [] args){
        //Banco Abriu conta para Marcos
        AberturaConta Marcos = new AberturaConta("Marcos Augusto Gomes Cunha");
        //Marcos depositou na sua conta universitária
        Marcos.c.depositar(1200d);
        //Banco abriu conta para Ana
        AberturaConta Ana = new AberturaConta("Ana Letícia Carvalho Couras");
        //Marcos transferiu para conta corrente da Ana
        Marcos.c.transferir(450d, Ana.cc);
        //Extrato das contas correlatadas
        Marcos.c.imprimirExtrato();
        Ana.cc.imprimirExtrato();
    }
}
