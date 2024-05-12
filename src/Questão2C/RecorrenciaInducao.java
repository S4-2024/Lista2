package Questão2C;

public class RecorrenciaInducao {
    // Método para calcular T(n) usando indução
    static int calcularT(int n) {
        if (n == 1) {
            return 1; // Caso Base
        } else {
            return n + calcularT(n / 3); // Passo de Indução
        }
    }

    public static void main(String[] args) {
        int n = 5; // Mude o valor de n conforme necessário

        int resultado = calcularT(n);
        System.out.println("O valor de T(" + n + ") é: " + resultado);
    }
}

