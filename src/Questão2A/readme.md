<img src="https://github.com/S4-2024/Lista2/blob/main/arquivos/9.png">
<h1 align="center" > 🩷 Indução  🩷 </h1>

<div align="center">
  
[![Sobre a Atividade](https://img.shields.io/badge/Sobre_a_Atividade-pink?style=for-the-badge&logo=github&logoColor=brown)](https://github.com/S4-2024/Lista2/tree/main)
</div>

<div align="center"> 
  
### ***Resolva a seguinte equação de recorrência por indução:*** 
### $T(0) = 1$ $T(n) = T(n-1)+2^n, n>0$
</div>
<br>

<p>

  [![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&duration=4000&pause=703&color=F724EB&random=false&width=435&lines=on+working...)](https://git.io/typing-svg)
</p>

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




