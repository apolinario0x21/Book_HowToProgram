package src.CAP02_operadores;

public class Ex230_separandoDigitos {
    public static void main(String[] args) {
        int number = 42339;

        int d1 = number / 10000;
        int d2 = (number / 1000) % 10;
        int d3 = (number / 100) % 10;
        int d4 = (number / 10) % 10;
        int d5 = number % 10;

        System.out.printf("%d %d %d %d %d ", d1, d2, d3, d4, d5);
    }
}
