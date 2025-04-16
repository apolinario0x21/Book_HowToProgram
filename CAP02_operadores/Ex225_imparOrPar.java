package src.CAP02_operadores;

import java.util.Scanner;

public class Ex225_imparOrPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "par" : "impar");
    }
}
