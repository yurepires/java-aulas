package POOAulas.exercicio1;

public class FuncionarioComissionado extends Funcionario{
    private double salarioBase;
    private double comissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "salarioBase=" + salarioBase +
                ", comissao=" + comissao +
                '}';
    }
}
