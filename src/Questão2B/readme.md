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
O código apresenta uma resolução para a equação de recorrência acima por meio de indução.  A função calcularT recebe três parâmetros: $n$, que representa o índice da função de recorrência, $c$, que é a constante multiplicativa, e $X$, o valor inicial de $T(0)$.

Se $n$ for zero, a função retorna 
$X$, caso contrário, retorna $c$ multiplicado pelo resultado da chamada recursiva de calcularT com $n−1$, $c$, e $X$. No main, é definido um valor para $n$, $c$, e $X$, e então o resultado é impresso. 


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



Basicamente, a função calcularT resolve a recorrência definida, multiplicando a constante $c$ pelo valor resultante da chamada recursiva da função com $n−1$ até que $n$ seja zero, retornando então o valor inicial $X$.


</p>






