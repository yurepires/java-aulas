package POOAulas.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {
    private List<Funcionario> funcionarioList;

    public TesteFuncionarios() {
        this.funcionarioList = new ArrayList<>();
    }

    public static void main(String[] args) {
        TesteFuncionarios empresa = new TesteFuncionarios();

        Funcionario fComum1 = new FuncionarioComum("Yure", "009", 2500);
        Funcionario fComissionado1 = new FuncionarioComissionado("Davi", "007", 3000, 200);
        Funcionario fHorista1 = new FuncionarioHorista("Carlos", "006", 160, 30);

        empresa.adicionarFuncionario(fComum1);
        empresa.adicionarFuncionario(fComissionado1);
        empresa.adicionarFuncionario(fHorista1);

        System.out.println(fComum1.calcularSalario());
        System.out.println(fComissionado1.calcularSalario());
        System.out.println(fHorista1.calcularSalario());

        empresa.exibirFuncionarios();

        System.out.println(empresa.valorSalarialTotal());
    }

    public void exibirFuncionarios(){
        for (Funcionario funcionario : funcionarioList){
            System.out.println(funcionario);
        }
    }

    public double valorSalarialTotal(){
        double valorTotal = 0;
        for (Funcionario funcionario : funcionarioList){
            valorTotal += funcionario.calcularSalario();
        }
        return valorTotal;
    }

    public void adicionarFuncionario(Funcionario funcionarioAdicionado){
        funcionarioList.add(funcionarioAdicionado);
    }

    @Override
    public String toString() {
        return "TesteFuncionarios{" +
                "funcionarioList=" + funcionarioList +
                '}';
    }
}
