package estruturadedados.aula05;

public class Problemas {

    public static void main(String[] args) {
        problema7();
    }

    public static void problema1(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = 0; j <= i ; j++){
                System.out.println(m[i][j]);
            }
        }
    }

    public static void problema2(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = 0; j < i ; j++){
                System.out.println(m[i][j]);
            }
        }
    }

    public static void problema3(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = i; j < m[i].length; j++){
                System.out.printf("*s %d - ", m[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void problema4(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = i + 1; j < m[i].length; j++){
                System.out.printf("%s - %d - ", (i == 0 ? "" : "       "), m[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void problema5(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            System.out.println(m[i][i]);
        }
    }

    public static void problema6(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                System.out.printf("%d ", m[j][i]);
            }
            System.out.println();
        }
    }

    public static void problema7(){
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < m.length; i++){
            for (int j = 0; j < m.length - i; j++){
                System.out.printf("%d ", m[j][i]);
            }
            System.out.println();
        }
    }
}
