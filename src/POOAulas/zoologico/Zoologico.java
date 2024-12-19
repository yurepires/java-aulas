package POOAulas.zoologico;

import POOAulas.zoologico.animais.Animal;
import POOAulas.zoologico.funcionarios.Funcionario;

import java.util.List;

public class Zoologico {
    List<Animal> animais;
    List<Funcionario> funcionarios;

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    //TODO: resolver cuidar do animal

    public void cuidarAnimais(){
        for (Funcionario funcionario: funcionarios){
            if (funcionario.getEspecialidade().equalsIgnoreCase("Mamifero")){
                if (!funcionario.isCuidandoAnimal()){

                }
            }
        }
    }
}
