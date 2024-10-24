package estruturasdedados.aula03;

public class ContaCorrente {
    private float saldo;
    private String titular;

    public ContaCorrente(String titular) {
        this.titular = titular;
    }

    public ContaCorrente(String titular, float saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositaValor(float valor){
        this.saldo += valor;
    }

    public float verificaSaldo(){
        return saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacaValor(float valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }
}