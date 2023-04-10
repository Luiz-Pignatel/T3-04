import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String continua = "S";

        while (!continua.equalsIgnoreCase("N")) {
            System.out.print("Digite numero: ");

            while (!input.hasNextInt()) {
                System.out.print("Digite apenas numeros: ");
                input.next();
            }
            num = input.nextInt();
            input.nextLine(); // consome o buffer/enter

            System.out.printf("O numero %d e ", num);
            if (num > 0) {
                System.out.println("positivo");
            } else if (num < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("neutro");
            }

            System.out.print("Deseja continuar? [S/N] ");
            continua = input.nextLine();
        }
    }
}
