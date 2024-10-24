package POOAulas.aula02;

public class Calculadora{
    public static void main(String[] args) {
        int x = 20;
        int y = -5;
        int soma = adicao(x, y);
        System.out.println("X = " + x + "\nY = " + y + "\nAdição: " + soma);
    }

    public static int adicao(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

    public static float divisao(int a, int b){
        if (b != 0) {
            return (float) a / b;
        }
        return 0;
    }

    public static int exponenciacao(int a, int b){
        int r;
        if(b==0){
            return 1;
        }
        for(r=0; r < b; r++){
            a *= a;
        }
        return a;
    }

    public static int fatorial(int a){
        int r;
        for(r=a - 1; r > 0; r--){
            a *= r;
        }
        return a;
    }

    public static void menu(){
        char op;
        System.out.print("--- CALCULADORA ---\n");
        System.out.print("1 - ADICAO\n");
        System.out.print("2 - SUBTRACAO\n");
        System.out.print("3 - MULTIPLICACAO\n");
        System.out.print("4 - DIVISAO\n");
        System.out.print("5 - EXPONENCIAÇÃO\n");
        System.out.print("6 - FATORIAL\n");

//      Como pega um input??????????
    }
}
