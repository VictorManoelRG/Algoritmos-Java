public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        /*
         * Breve explicação: esse algoritmo quebra o array inteiro pela metade, e recursivamente faz isso,
         * até não poder haver mais divisões. Após isso, o vetor inteiro vai sendo reconstruido.
         * Isso faz com que pequenas comparações sejam feitas, e no final resultará no vetor ordenado.
         **/


        if (left < right) { //na recursão, compara esquerda e direita, e o algoritmo parará quando a direita for maior
            int midPos = left + (right - left) / 2; //calculo da metade do array

            mergeSort(array, left, midPos); //separa de novo a esquerda até o meio
            mergeSort(array, midPos + 1, right); //separa de novo do meio até a direita

            //quando o array fica muito pequeno, ele ccomeça a ser resolvido em recurssão
            merge(array, left, midPos, right);
        }
    }

    public static void merge(int[] array, int left, int midPos, int right) {
        int startPosFirstPart = midPos - left + 1;
        int startPosSecondPart = right - midPos;

        //cria arrays com o tamanho da posição total do pedaço
        int[] leftArray = new int[startPosFirstPart];
        int[] rightArray = new int[startPosSecondPart];

        // copia para o vetor da parte esquerda os valores de left até a posição calculada
        for (int i = 0; i < startPosFirstPart; i++) {
            leftArray[i] = array[left + i];
        }

        //  copia para o vetor da parte direita os valores de mid até até a posição calculada
        for (int j = 0; j < startPosSecondPart; j++) {
            rightArray[j] = array[midPos + 1 + j];
        }

        //indice 0 dos pequenos arrays
        int i = 0, j = 0;

        // inicializa a posição do array final
        int posFinalArray = left;

        // começa a fazer o merge
        while (i < startPosFirstPart && j < startPosSecondPart) { // enquanto i e j são menores que suas respectivas partes
            if (leftArray[i] <= rightArray[j]) {
                array[posFinalArray] = leftArray[i]; //compara o i do array esquerdo com o direito, e o menor terá seu lugar
                i++;
            } else {
                array[posFinalArray] = rightArray[j];
                j++;
            }
            posFinalArray++; //incrementa para o proximo valor do array final
        }

        // agora com as comparações finais, o que sobrou aqui seriam elementos da esquerda que já seriam menores, pois sao os
        // proximos a serem colocados
        while (i < startPosSecondPart) {
            array[posFinalArray] = leftArray[i];
            i++;
            posFinalArray++;
        }

        // termina copiando o lado direito
        while (j < startPosSecondPart) {
            array[posFinalArray] = rightArray[j];
            j++;
            posFinalArray++;
        }
    }

//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 1310720
//    Tempo de execução em milisegundos: 1,31
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 159740
//    Tempo de execução em milisegundos: 0,16
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 1956800
//    Tempo de execução em milisegundos: 1,96
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 5176520
//    Tempo de execução em milisegundos: 5,18
//    Tempo de execução em segundos: 0,01
//
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 9970080
//    Tempo de execução em milisegundos: 9,97
//    Tempo de execução em segundos: 0,01

//------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no melhor caso, pior  caso e caso médio:

// Para  ambos os casos, a complexidade é O(nlogn). Isso  acontece em todos os casos
// por conta que as mesmas operações de preparação do vetor são feitas, independentemente
// dele  já estar ordenado ou não.
//------------------------------------------------------------------------------

//*Complexidade de espaço: O(n). Essa complexidade se á por conta que o array final precisa de um  tamanho
// igual ao array de entrada, para ir montando o merge a partir de sua conclusão.
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Merge Sort é usa uma  técnica famosa chamada dividir para conquistar, pois ele divide o array de
// entrada em arrays menores e menores, e depois retorna fazendo a remontagem desses pequenos arrays.
// Ele é muito rápido, mas exige memória adicional. Logo, comparado a outros algoritmos  de complexidade
// O(nlogn), como o Quick Sort e Merge Sort,ele acaba sendo mais custoso em uso de memória.
// Ele também não é  estável (não mantém a ordem de aparecimento dos elementos).
}
