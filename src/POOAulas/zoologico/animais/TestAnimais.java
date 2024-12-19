package POOAulas.zoologico.animais;

public class TestAnimais {
    public static void main(String[] args) {
        Animal mamifero1 = new Mamifero("Bolt", "Cachorro", 63);
        Animal ave1 = new Ave("galinha", "Galinha", "fortes");
        Animal reptil1 = new Reptil("jacaré", "Jacaré", 33.8);
        Animal mamifero2 = new Mamifero("Sansão", "Cachorro", 63);

        System.out.println(mamifero1.getId());
        System.out.println(ave1.getId());
        System.out.println(reptil1.getId());
        System.out.println(mamifero2.getId());

        mamifero1.emitirSom();
        ave1.emitirSom();
        reptil1.emitirSom();

    }
}
