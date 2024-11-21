package POOAulas.exercicio1;

public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                '}';
    }
}
