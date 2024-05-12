package Questão2A;

import java.util.Scanner;

public class RecorrenciaInducao {
    // Método para calcular T(n) usando indução
    static int calcularT(int n) {
        if (n == 0) {
            return 1; // Caso Base
        } else {
            return calcularT(n - 1) + (int)Math.pow(2, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de T(n): ");
        int n = sc.nextInt();

        int resultado = calcularT(n);
        System.out.println("O valor de T(" + n + ") é: " + resultado);
    }
}
