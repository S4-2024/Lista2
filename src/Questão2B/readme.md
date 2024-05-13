<img src="https://github.com/S4-2024/Lista2/blob/main/arquivos/10.png">
<h1 align="center" > 🩷 Indução  🩷 </h1>

<div align="center">

[![questão 2A](https://img.shields.io/badge/questão_2A-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o2A)
[![Sobre a Atividade](https://img.shields.io/badge/Sobre_a_Atividade-pink?style=for-the-badge&logo=github&logoColor=brown)](https://github.com/S4-2024/Lista2/tree/main)
[![questão 2c](https://img.shields.io/badge/questão_2c-pink?style=for-the-badge&logo=github&logoColor=black)](https://github.com/S4-2024/Lista2/tree/main/src/Quest%C3%A3o2C)

</div>

<div align="center"> 
  
### ***Resolva a seguinte equação de recorrência por indução:*** 
### $T(0) = X$ | $T(n) = c * T(n-1), n>0$
</div>
<br>

<p>

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&duration=4000&pause=703&color=F724EB&random=false&width=435&lines=on+working...)](https://git.io/typing-svg)

</p>

<details>
<summary> <h3> ⭐ Code </h3> </summary>

```
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
```
  
</details>




