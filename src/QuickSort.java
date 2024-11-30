public class QuickSort {
    public static void quickSort(int[] values, int began, int end) {
        /*
         * Breve explicação: esse algoritmo ordena o vetor a partir de um pivô. Esse pivô é
         * selecionado no começo, e depois, os vetores serão divididos em dois, a partir
         * da posição desse pivô. Dai, faz-se o mesmo recursivamente. E então, o vetor é remontado,
         * já ordenado.
         **/


        int i = began;
        int j = end - 1;
        int pivot = values[(began + end) / 2]; //encontra a metade do array
        int aux;

        while (i <= j) {
            // avança i enquanto for menor que o pivô
            while (values[i] < pivot && i < end) {
                i++;
            }

            // recua j enquanto for maior que o pivô
            while (values[j] > pivot && j > began) {
                j--;
            }

            // troca os elementos de i e j, e avança de novo
            if (i <= j) {
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
                i++;
                j--;
            }
        }

        // chama recursivamente a parte esquerda ddo vetor
        if (j > began) {
            quickSort(values, began, j + 1);
        }

        // chama recursivamente a parte direita do vetor
        if (i < end) {
            quickSort(values, i, end);
        }
    }

//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 1308480
//    Tempo de execução em milisegundos: 1,31
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 71460
//    Tempo de execução em milisegundos: 0,07
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 839520
//    Tempo de execução em milisegundos: 0,84
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 4249320
//    Tempo de execução em milisegundos: 4,25
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 7876120
//    Tempo de execução em milisegundos: 7,88
//    Tempo de execução em segundos: 0,01

//------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no pior  caso: No pior  caso,  a complexidade do Quick Sort  pode ser até
// O(n^2). Esse cenário acontece quando o pivô selecionado é o primeiro ou o último elemento do array.

//Complexidade de tempo no médio e melhor caso:
// Para  ambos os casos, a complexidade é O(nlogn). Esses casos acontecem quando o pivô é selecionado
// de forma  adequada.
//------------------------------------------------------------------------------

//*Complexidade de espaço: O Quick Sort  é um  algoritmo in-place, porém pode acabar consumindo mais memória
// a depender da recursão, pois cada chamada acaba consumindo mais memória. Nos melhores casos, o consumo de
// memória tem complexidade O(logn), mas no pior, seria O(n).
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Quick Sort é um algoritmo muito rápido, principalmente para  vetores grandes. Porém, há casos que podem
// ocasionar em perda de desempenho, como por exemplo o caso em que o pivô é o do canto esquerdo ou direito.
// Em questão de uso de memória, depende do número de recursões. Ainda assim, é comparável ao Merge Sort e
// Heap Sort.
}
