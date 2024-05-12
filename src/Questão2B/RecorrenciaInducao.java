package Questão2B;

public class RecorrenciaInducao {
    static int calcularT(int n, int c, int X) {
        if (n == 0) {
            return X;
        } else {
            return c * calcularT(n - 1, c, X);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Mude o valor de n conforme necessário
        int c = 2; // Constante multiplicativa
        int X = 3; // Valor inicial de T(0)

        int resultado = calcularT(n, c, X);
        System.out.println("O valor de T(" + n + ") é: " + resultado);
    }
}
