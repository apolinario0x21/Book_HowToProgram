package src.CAP02_operadores;

public class Ex224_maiorAndMenor {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 10;
        b = 20;
        c = 30;
        d = 40;
        e = 50;

        int maior = Math.max(Math.max(a,b), Math.max(c, Math.max(d, e)));
        int menor = Math.min(Math.min(a, b), Math.min(c, Math.min(d, e)));

        System.out.printf("Maior: %d%nMenor: %d", maior, menor);

    }
}
