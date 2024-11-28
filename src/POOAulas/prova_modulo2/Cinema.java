package POOAulas.prova_modulo2;

import java.util.Scanner;

public class Cinema {
    char[][] assentos;
    int assentosDisponiveis;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();
        cinema.inicializarSala();

        while (true){
            System.out.println("=== CINEMA ===");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Assentos disponíveis");
            System.out.println("4 - Sair");
            System.out.print(">>> ");
            String menu = scanner.next();
            int fila;
            int cadeira;
            switch (menu){
                case "1":
                    cinema.exibirSala();
                    System.out.print("Digite o número da fila: ");
                    fila = scanner.nextInt();
                    while (!cinema.verificaNumeros(fila)){
                        System.out.println("Número de fila inválido!");
                        System.out.print("Digite o número da fila: ");
                        fila = scanner.nextInt();
                    }
                    System.out.print("Digite o número da cadeira: ");
                    cadeira = scanner.nextInt();
                    while (!cinema.verificaNumeros(cadeira)){
                        System.out.println("Número de cadeira inválido!");
                        System.out.print("Digite o número da cadeira: ");
                        cadeira = scanner.nextInt();
                    }
                    cinema.reservarAssento(fila, cadeira);
                    break;
                case "2":
                    cinema.exibirSala();
                    System.out.print("Digite o número da fila: ");
                    fila = scanner.nextInt();
                    while (!cinema.verificaNumeros(fila)){
                        System.out.println("Número de fila inválido!");
                        System.out.print("Digite o número da fila: ");
                        fila = scanner.nextInt();
                    }
                    System.out.print("Digite o número da cadeira: ");
                    cadeira = scanner.nextInt();
                    while (!cinema.verificaNumeros(cadeira)){
                        System.out.println("Número de cadeira inválido!");
                        System.out.print("Digite o número da cadeira: ");
                        cadeira = scanner.nextInt();
                    }
                    cinema.cancelarReserva(fila, cadeira);
                    break;
                case "3":
                    cinema.mostrarAssentosDisponiveis();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public boolean verificaNumeros(int n){
        return n > 0 && n < 6;
    }

    public Cinema() {
        assentos = new char[5][5];
        assentosDisponiveis = 25;
    }

    public void inicializarSala(){
        for (int i=0; i < assentos.length; i++){
            for (int r=0; r < assentos[i].length; r++){
                assentos[i][r] = 'L';
            }
        }
    }

    public void exibirSala(){
        for (int i=0; i < assentos.length; i++){
            System.out.printf("Fila %d - [", i + 1);
            for (int r=0; r < assentos[i].length; r++){
                System.out.printf("%c ", assentos[i][r]);
            }
            System.out.printf("]\n");
        }
    }

    public void reservarAssento(int fila, int cadeira){
        if (assentos[fila - 1][cadeira - 1] == 'L'){
            assentos[fila - 1][cadeira - 1] = 'R';
            assentosDisponiveis--;
            System.out.println("Reserva feita com sucesso!");
        } else {
            System.out.println("Esta cadeira já está reservada!");
        }
    }

    public void cancelarReserva(int fila, int cadeira){
        if (assentos[fila - 1][cadeira - 1] == 'R'){
            assentos[fila - 1][cadeira - 1] = 'L';
            assentosDisponiveis++;
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("Esta cadeira não está reservada!");
        }
    }

    public void mostrarAssentosDisponiveis(){
        System.out.printf("Há %d assentos disponiveis\n", assentosDisponiveis);
    }
}
