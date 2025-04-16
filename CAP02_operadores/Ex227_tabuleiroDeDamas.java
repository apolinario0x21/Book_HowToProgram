package src.CAP02_operadores;

public class Ex227_tabuleiroDeDamas {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i ++) {
            System.out.println( i % 2 == 0 ? "* * * * * * * *" : " * * * * * * * *");
        }
    }
}
