import java.util.ArrayList;
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<>();
        String continua = "S";

        while (!continua.equalsIgnoreCase("N")) {
            System.out.print("Digite numero: ");

            while (!input.hasNextInt()) {
                System.out.print("Digite apenas numeros: ");
                input.next();
            }
            numero.add(Integer.parseInt(input.nextLine()));

            System.out.print("Deseja continuar? [S/N] ");
            continua = input.nextLine();
        }

        for (int i = 0; i < numero.size(); i++) {
            System.out.print(numero.get(i));
            if (numero.get(i) > 0) {
                System.out.println(" - positivo");
            } else if (numero.get(i) < 0) {
                System.out.println(" - negativo");
            } else {
                System.out.println(" - neutro");
            }
        }
    }
}