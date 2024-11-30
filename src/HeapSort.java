public class HeapSort {
    public static void heapSort(int[] array) {
        /*
         * Breve explicação: o heap sort é um algoritmo baseado numa estrutura de dados de árvore.
         * Ele organiza todos os elementos do vetor numa árvore, e vai subindo o nível, ordenando
         * e deixando os maiores valores nos nós mais acima. Depois, o vetor é reconstruindo, com
         * o maior elemento sendo o ultimo do vetor, e por ai vai.
         **/

        int length = array.length; //inicializa com o tamanho do vetor
        int i = length / 2, fatherNode, sonNode, actualNode;

        while (true) { //contrução do heap em árvore
            if (i > 0) {
                i--;
                actualNode = array[i]; //nó atual é assegurado
            } else {//aqui a heap foi construída
                length--; //reduz o tamanho do heap
                if (length <= 0) {
                    return;
                }
                actualNode = array[length]; //coloca o maior elemento na posição final do array
                array[length] = array[0];
            }
            //ajusta o heap para obter novamente o valor do tamanho
            fatherNode = i; //nó do pai
            sonNode = ((i * 2) + 1); //filho esquerdo

            //looping  para que o maior elemento fique na raiz
            while (sonNode < length) {
                //verifica qual o maior dos dois filhos
                if ((sonNode + 1 < length) && (array[sonNode + 1] > array[sonNode])) {
                    sonNode++; //se o filho direito for maior, atualiza
                }

                //compara o filho selecionado com o nó atual
                if (array[sonNode] > actualNode) { //se o filho é maior, move para cima no heap
                    array[fatherNode] = array[sonNode];
                    fatherNode = sonNode;
                    sonNode = fatherNode * 2 + 1;
                } else {
                    break; //sai do loop caso a posição correta foi encontrada
                }
            }
            //insere o valor original na posição correta do heap
            array[fatherNode] = actualNode;
        }
    }

//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 1198460
//    Tempo de execução em milisegundos: 1,20
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 337040
//    Tempo de execução em milisegundos: 0,34
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 1137200
//    Tempo de execução em milisegundos: 1,14
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 4150180
//    Tempo de execução em milisegundos: 4,15
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 9365500
//    Tempo de execução em milisegundos: 9,37
//    Tempo de execução em segundos: 0,01

//------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no melhor caso, pior  caso e caso médio:

// Para  ambos os casos, a complexidade é O(nlogn). Isso  se dá pois a construção
// do heap já consome O(n), e a remoção e reordenação do filho mais alto consome
// O(logn).
//------------------------------------------------------------------------------

//*Complexidade de espaço: O(1). A memória consumida é constante independente do valor de entrada
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Heap  Sort se mantém de maneira O(nlogn) para a maioria das entradas. Por conta dessa complexidade,
// ele se torna cada vez mais adaptavel conforme o tamanho do array. Ou seja, quanto maior o array, mais rápida
// e eficiente  será sua execução. E para entradas pequenas, também não é  tão lento.
// É rápido, semelhante ao Merge Sort e Quick Sort, podendo até os superar.
}
