package estruturadedados.aula03;

public class AcessaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente minhaconta = new ContaCorrente("Yure Pires");

        ContaCorrente joao = new ContaCorrente("João", 1000);

        System.out.println("O saldo de " + joao.getTitular() + " é " + joao.verificaSaldo());
        joao.depositaValor(300);
        System.out.println("O saldo de " + joao.getTitular() + " é " + joao.verificaSaldo());
    }
}
