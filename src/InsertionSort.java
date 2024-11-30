public class InsertionSort {
    public static void insertionSort(int[] array) {
        /*
         * Breve explicação: esse algoritmo vai da posição 0 até o tamanho do vetor,
         * fazendo trocar o elemento atual, do que está atras.
         * Quando, na posição seguinte é encontrado um valor maior que o atual, é trocado
         * a posição, e o valor i+1 que foi trocado, vai voltando para tras até a menor
         * posição que ele deveria ficar
         **/


        // looping da posição 1 até o final. Isso ocorre pois a posição 0 será auterada com o menor numero no primeiro looping
        for (int i = 1; i < array.length; i++) {
            int actualElement = array[i]; //valor da posição atual da comparação
            int j = i - 1;  //posição anterior ao atual

            // enquanto o atual for menor que o anterior e ainda não está no final, vai trocando
            while (j >= 0 && array[j] > actualElement) {
                array[j + 1] = array[j]; //aqui é como se o vetor fosse sendo deslocado a direita até que o valor atual esteja
                j--;                     // no lugar certo
            }

            // termina o laço atual inserindo o valor atual em sua posição correta, enquanto todos foram deslocados para a direita
            array[j + 1] = actualElement;
        }
    }

//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 69340
//    Tempo de execução em milisegundos: 0,07
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 736260
//    Tempo de execução em milisegundos: 0,74
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 7985539
//    Tempo de execução em milisegundos: 7,99
//    Tempo de execução em segundos: 0,01
//
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 105000380
//    Tempo de execução em milisegundos: 105,00
//    Tempo de execução em segundos: 0,11
//
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 392365219
//    Tempo de execução em milisegundos: 392,37
//    Tempo de execução em segundos: 0,39

//------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no melhor caso:
// No melhor caso, o algoritmo tem uma complexidade de O(n). Isso pois ele só compara
// o elemento  atual com o próximo, e caso não precise de mudanças, continua.

//Complexidade de tempo no pior caso e caso médio:
// Para o Insertion Sort, os elementos devem ser movidos para a sua respectiva posição.
// Por conta disso, ele precisaria de uma complexidade O(n^2).


//------------------------------------------------------------------------------

//*Complexidade de espaço: O(1). A memória consumida é constante independente do valor de entrada.
// Todo o  vetor é organizado in-place.
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Insertion Sort não é um algoritmo que se  comporta be para entradas muito grandes, e ainda assim, podde
// ser ruim para  entradas pequenas, tornando-se O(n^2) caso o vetor não esteja ordenado. Logo, não é uma opção boa,
// e fica classificado igualmente ao Bubble Sort e Selection Sort, porém ainda mais rápido em alguns casos, principamente
// Comparado ao Selection Sort. Outros algoritmos como o Quick Sort, Merge Sort e Heap Sort  podem ser melhores.
}
