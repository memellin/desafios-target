import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Desafio{

    public static void main(String[] args) {
        /*
    1) Ao final do processamento o valor da variável SOMA será
    de 91 pois é quase uma função exponencial, ela cresce muito em poucos indices.
        */
        int ind = 13;
        int soma = 0;
        int k = 0;
        while (k < ind) {
            k = k + 1;
            System.out.println(k);
            soma = soma + k;
            System.out.println(soma);
        }
        System.out.println(soma);
    
    // 2) está na outra classe

    /*
    a)1, 3, 5, 7, 9, 11, 13... 2 em 2
    b)2, 4, 8, 16, 32, 64, 128, 256... multiplicando por 2,
    c)0, 1, 4, 9, 16, 25, 36, 49... elevando ao quadrado,
    d) 4, 16, 36, 64, 100... elevando proximo num par ao quadro iniciando a partir do 2.
    
    */


    }
}