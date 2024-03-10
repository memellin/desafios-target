
public class Desafio {

    public static void main(String[] args) {
        /*
         * 1) Ao final do processamento o valor da variável SOMA será
         * de 91 pois é quase uma função exponencial, ela cresce muito em poucos
         * indices.
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

        // 3)
        /*
         * a)1, 3, 5, 7, 9, 11, 13... 2 em 2
         * b)2, 4, 8, 16, 32, 64, 128, 256... multiplicando por 2,
         * c)0, 1, 4, 9, 16, 25, 36, 49... elevando ao quadrado,
         * d) 4, 16, 36, 64, 100... elevando proximo num par ao quadro iniciando a
         * partir do 2.
         * e) 1, 1, 2, 3, 5, 8, 13... fibonacci
         * f) 2, 10, 12, 16, 17, 18, 19, 200... sequencia aleatoria, talvez de numero
         * que iniciem com a letra D??
         */

        // 4)
        /*
         * Equação horária do carro:
         * 
         * x = 110t (distância percorrida pelo carro em função do tempo t)
         * 
         * Equação horária do caminhão:
         * x = 100 - 80t (distância percorrida pelo caminhão em função do tempo t)
         * 
         * Igualando as equações horárias:
         * 110t = 100 - 80t
         * 
         * Resolvendo para t:
         * t = 0,625 horas = 37 minutos e 30 segundos
         * 
         * Distância percorrida por cada veículo no momento do encontro:
         * x = 110t = 110 * 0,625 = 68,75 km
         * CONCLUSAO: O carro e o caminhão percorreram 68,75 km cada um desde seus
         * pontos de partida.
         * Como a distância entre as cidades é de 100 km, ambos estão a 60,9 km de
         * Ribeirão Preto (100 km - 68,75 km = 31,25 km).
         * Portanto, no momento do encontro,
         * eles estarão à mesma distância de Ribeirão Preto.
         */
        // 5)
    }
}