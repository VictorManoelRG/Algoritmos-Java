public class BubbleSort {
    public static void bubbleSort(int[] array) {
        /*
         * Breve explicação: esse algoritmo troca a posição atual com o proximo
         * caso o atual seja maior que o proximo.
         **/

        for (int i = 0; i < array.length - 1; i++) { //laço de fora que percorre o vetor inteiro
            for (int j = 0; j < array.length - i - 1; j++) {//laço que carrega a posição atual e compara com o proximo
                if (array[j] > array[j + 1]) {//se o atual for maior que o proximo, trocam de posição
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 307000
//    Tempo de execução em milisegundos: 0,31
//    Tempo de execução em segundos: 0,00
////
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 1162960
//    Tempo de execução em milisegundos: 1,16
//    Tempo de execução em segundos: 0,00
////
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 83689459
//    Tempo de execução em milisegundos: 83,69
//    Tempo de execução em segundos: 0,08
////
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 2793299339
//    Tempo de execução em milisegundos: 2793,30
//    Tempo de execução em segundos: 2,79
////
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 11651550659
//    Tempo de execução em milisegundos: 11651,55
//    Tempo de execução em segundos: 11,65

//------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no melhor caso:
// No melhor caso, o algoritmo tem uma complexidade de O(n). Isso pois ele só compara
// o elemento  atual com o próximo, e caso não precise de mudanças, continua.

//Complexidade de tempo no pior caso e caso médio:
// Nesses casos, o Bubble Sort precisa percorrer o array algumas vezes, para o caso médio, e
// muitas vezes para o pior caso, tendo como complexidade O(n^2).


//------------------------------------------------------------------------------

//*Complexidade de espaço: O(1). A memória consumida é constante independente do valor de entrada.
// Todo o  vetor é organizado in-place.
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Bubble Sort quase nunca é das  melhores  escolhas para um método de  ordenação. Isso pois ele é um algoritmo
// muito lento para  entradas grandes e  desordenadas, pois sua complexidadde é de O(n^2). Por isso, quase  nunca
// é optável, comparao com Merge  Sort e Quick Sort, que ainda com entradas pequenas, podem chegar a serem   superiores.
}
