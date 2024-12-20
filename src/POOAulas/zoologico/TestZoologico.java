package POOAulas.zoologico;

import POOAulas.zoologico.funcionarios.Funcionario;
import POOAulas.zoologico.animais.Animal;
import POOAulas.zoologico.animais.Ave;
import POOAulas.zoologico.animais.Mamifero;
import POOAulas.zoologico.animais.Reptil;

public class TestZoologico {
    public static void main(String[] args) {
        Animal mamifero1 = new Mamifero("Pé-de-pano", "Mamifero", 330);
        Animal ave1 = new Ave("Bem-te-vi", "Ave", "macias");
        Animal reptil1 = new Reptil("Gabby Gator", "Reptil", 31.5);
        Animal mamifero2 = new Mamifero("Plotka", "Mamifero", 330);

        Funcionario funcionario1 = new Funcionario("Cléber", "Mamifero");
        Funcionario funcionario2 = new Funcionario("Roger", "Ave");
        Funcionario funcionario3 = new Funcionario("Francisco", "Reptil");

        mamifero1.emitirSom();
        ave1.emitirSom();
        reptil1.emitirSom();

        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(mamifero1);
        zoologico.adicionarAnimal(ave1);
        zoologico.adicionarAnimal(reptil1);
        zoologico.adicionarAnimal(mamifero2);

        System.out.println();
        zoologico.adicionarFuncionario(funcionario1);
        zoologico.adicionarFuncionario(funcionario2);
        zoologico.adicionarFuncionario(funcionario3);

        zoologico.cuidarAnimais();

        System.out.println();
        zoologico.cuidarAnimais();

        System.out.println();
        zoologico.alterarNomeAnimal(reptil1, "Zé Jacaré");
        System.out.println(reptil1.getNome());

        System.out.println();
        System.out.println("Número total de animais: " + Animal.getTotalAnimais());
    }
}