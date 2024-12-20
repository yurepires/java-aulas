package POOAulas.zoologico;

import POOAulas.zoologico.animais.Animal;
import POOAulas.zoologico.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    List<Animal> animais = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    private Animal retornaAnimalNaoCuidado(String grupoAnimal){
        for (Animal animal : animais){
            if (!animal.isSendoCuidado()){
                if (animal.getGrupo().equals(grupoAnimal)){
                    return animal;
                }
            }
        }
        return null;
    }

    public void cuidarAnimais(){
        for (Funcionario funcionario: funcionarios){
            Animal animal = retornaAnimalNaoCuidado(funcionario.getEspecialidade());
            if (animal != null){
                funcionario.cuidarAnimal(animal);
            }
        }
    }

    public void alterarNomeAnimal(Animal animal, String novoNome){
        animal.setNome(novoNome);
    }

}