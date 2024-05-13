<img src="https://github.com/S4-2024/Lista2/blob/main/arquivos/11.png">
<h1 align="center" > 🩷 Indução  🩷 </h1>

<div align="center">

[![questão 2B](https://img.shields.io/badge/questão_2B-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o2B)
[![Sobre a Atividade](https://img.shields.io/badge/Sobre_a_Atividade-pink?style=for-the-badge&logo=github&logoColor=brown)](https://github.com/S4-2024/Lista2/tree/main)
</div>

<div align="center"> 
  
### ***Resolva a seguinte equação de recorrência por indução:*** 
### $T(0) = 1$ | $T(n) = n + T(\frac{n}{3}), n>1$
</div>
<br>

<p>
O código implementa a resolução da recorrência acima usando indução. Na função calcularT, quando o valor de $n$ é igual a $1$, o caso base é alcançado e retorna-se $1$.

<details>
<summary> <h3> ⭐ Code </h3> </summary>

```
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

```
  
</details>

  
Caso contrário, a função recursivamente calcula $T(n/3)$ e adiciona $n$ a esse resultado, representando o passo de indução. O programa principal define um valor para $n$ e imprime o resultado de $T(n)$ usando essa função.


</p>










