<img src="https://github.com/S4-2024/Lista2/blob/main/arquivos/9.png">
<h1 align="center" > 🩷 Indução  🩷 </h1>

<div align="center">

[![questão 1](https://img.shields.io/badge/questão_1-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o1)
[![Sobre a Atividade](https://img.shields.io/badge/Sobre_a_Atividade-pink?style=for-the-badge&logo=github&logoColor=brown)](https://github.com/S4-2024/Lista2/tree/main)
[![questão 2B](https://img.shields.io/badge/questão_2B-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o2B)

</div>

<div align="center"> 
  
### ***Resolva a seguinte equação de recorrência por indução:*** 
### $T(0) = 1$ | $T(n) = T(n-1)+2^n, n>0$
</div>
<br>

<p>

O código implementa a solução de uma equação de recorrência usando um método recursivo. O método calcularT(int n) recebe um parâmetro &n& que representa o índice da função de recorrência $T(n)$.
  
Se $n$ é igual a zero, o método retorna 1, caso contrário, ele chama recursivamente calcularT(n - 1) para encontrar $T(n-1)$ e adiciona $2^n$ a esse valor, refletindo a definição da recorrência $T(n) = T(n-1)+2^n$.


<details>
<summary> <h3> ⭐ Code </h3> </summary>

```
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
```
  
</details>



No método principal, o programa solicita ao usuário um valor $n$, calcula $T(n)$ usando o método calcularT(n) e exibe o resultado. Assim, o código resolve a equação de recorrência fornecida e interage com o usuário para obter o valor de $n$.
</p>






