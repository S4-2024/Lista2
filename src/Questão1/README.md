<img src="https://github.com/S4-2024/Lista2/blob/main/arquivos/8.png">
<h1 align="center" > 🩷 Indução  🩷 </h1>

<div align="center">
  
[![Sobre a Atividade](https://img.shields.io/badge/Sobre_a_Atividade-pink?style=for-the-badge&logo=github&logoColor=brown)](https://github.com/S4-2024/Lista2/tree/main)
[![questão 2A](https://img.shields.io/badge/questão_2A-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o2A)

</div>

<div align="center"> 
  
### ***Mostre, por indução, a validade da seguinte fórmula:*** 


###   $`P(n) = 1² + 2² +  ...  + n² = \frac{ n(n+1)(2n + 1)}{6}`$


</div>


<br>




<p>

Passo 1: Caso Base $(n = 1)$

- Verifique se a fórmula é válida para o caso base, onde $n = 1$.

Passo 2: Hipótese de Indução

- Assuma que a fórmula é verdadeira para algum inteiro $k$, isto é, $P(k) = 1² + 2² + ... + k² = \frac {k(k+1)(2k+1)}{6}$.


Passo 3: Passo de Indução

- Mostre que se a fórmula é verdadeira para k, então também é verdadeira para $k + 1$.
</p>


<details>

<summary> <h3> ⭐ Code </h3> </summary>

```
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
```
  
</details>







