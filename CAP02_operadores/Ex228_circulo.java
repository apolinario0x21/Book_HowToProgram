package src.CAP02_operadores;

public class Ex228_circulo {
    public static void main(String[] args) {
        double raio = 5.0;

        System.out.printf("Diâmetro do círculo: %n", (2 * raio));
        System.out.printf("Circunferência do círculo: %.2f%n", (2 * Math.PI * raio));
        System.out.printf("Área do círculo: %.2f%n", Math.PI * Math.pow(raio, 2));
    }
}
