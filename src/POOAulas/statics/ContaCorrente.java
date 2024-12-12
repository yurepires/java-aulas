package POOAulas.statics;

public class ContaCorrente {
    static int qtdContas = 0;
    static float dinheiroTotal = 0;
    float saldo;
    String nome;

    // Variavéis staticas não podem ser acessadas por objetos da classe, somente pela classe
    // o mesmo serve para os métodos

    public ContaCorrente(String nome,float saldo) {
        this.nome = nome;
        this.saldo = saldo;
        dinheiroTotal += saldo;
        qtdContas += 1;
        verificaSituacao();
    }

    public void verificaSituacao(){
        if (saldo < 1500){
            System.out.println(nome + " está pobre");
        } else if (saldo < 5000) {
            System.out.println(nome + " Tá mais ou menos");
        } else {
            System.out.println(nome + " Tá rico");
        }
    }

    public static void verificaSituacaoBanco(){
        if (dinheiroTotal < 1500){
            System.out.println("O banco está pobre");
        } else if (dinheiroTotal < 5000) {
            System.out.println("O banco tá mais ou menos");
        } else {
            System.out.println("O banco tá rico");
        }
    }

    public static void calcularRendaMedia(){
        if (qtdContas > 0){
            System.out.printf("Renda média: %.2f\n", (dinheiroTotal / qtdContas));
        } else {
            System.out.println("Não há contas cadastradas!");
        }
    }
}
