package POOAulas.statics;

public class TestContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaYure = new ContaCorrente("Yure",1000);
        System.out.println("Conta: " + contaYure.nome + "\nSaldo: " +contaYure.saldo + "\nSaldo Total: " + ContaCorrente.dinheiroTotal + "\nContas: " + ContaCorrente.qtdContas);
        ContaCorrente.verificaSituacaoBanco();
        ContaCorrente.calcularRendaMedia();

        System.out.println("--------------");

        ContaCorrente contaDiogo = new ContaCorrente("Diogo",2300);
        System.out.println("Conta: " + contaDiogo.nome + "\nSaldo: " +contaDiogo.saldo + "\nSaldo Total: " + ContaCorrente.dinheiroTotal + "\nContas: " + ContaCorrente.qtdContas);
        ContaCorrente.verificaSituacaoBanco();
        ContaCorrente.calcularRendaMedia();

        System.out.println("--------------");

        ContaCorrente contaBruno = new ContaCorrente("Bruno",13000);
        System.out.println("Conta: " + contaBruno.nome + "\nSaldo: " +contaBruno.saldo + "\nSaldo Total: " + ContaCorrente.dinheiroTotal + "\nContas: " + ContaCorrente.qtdContas);
        ContaCorrente.verificaSituacaoBanco();
        ContaCorrente.calcularRendaMedia();


    }
}
