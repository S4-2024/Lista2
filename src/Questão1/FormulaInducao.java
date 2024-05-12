package Questão1;
import java.util.Scanner;
public class FormulaInducao {
    static int somaQuadrados(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    // verificar a validade
    static boolean validarFormulaPorInducao(int n) {
        // Caso Base (n = 1)
        if (n == 1) {
            return somaQuadrados(n) == 1; // 1² = 1
        }
        int somaAteK = somaQuadrados(n - 1);

        return somaQuadrados(n) == somaAteK + n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o valor de n");
        int n = sc.nextInt();

        if (validarFormulaPorInducao(n)) {
            System.out.println("A fórmula é válida para P(" + n + ")" + " = " + somaQuadrados(n));
        } else {
            System.out.println("A fórmula não é válida para P(" + n + ")" + " = " + somaQuadrados(n));
        }
    }
}
