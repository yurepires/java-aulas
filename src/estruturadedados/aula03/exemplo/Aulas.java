package estruturadedados.aula03.exemplo;

public class Aulas {

    public static void main(String[] args) {
        Aulas aula = new Aulas();
        System.out.println("A + B = " + aula.exemplo02(10, 5));
        exemplo03("Yure");

        System.out.println("f(x) = " + problema03(2));
    }

    public static int exemplo02(int a, int b){
        return a + b;
    }

    public static void exemplo03(String nome){
        System.out.println("Nome: " + nome);
    }

    public static int problema03(int x){
        int fx;
        fx = 3 * (x*x) + (2 * x) + 7;
        return fx;
    }
}
