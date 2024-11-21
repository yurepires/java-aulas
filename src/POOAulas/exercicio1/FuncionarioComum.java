package POOAulas.exercicio1;

public class FuncionarioComum extends Funcionario{
    private double salarioMensal;

    public FuncionarioComum() {
    }

    public FuncionarioComum(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public String toString() {
        return "FuncionarioComum{" +
                "salarioMensal=" + salarioMensal +
                '}';
    }
}
