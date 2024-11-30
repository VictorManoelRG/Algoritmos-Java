public class SelectionSort {
    public static void selectionSort(int[] array) {
        /*
        * Breve explicação: esse algoritmo vai da posição 0 até o tamanho do vetor,
        * substituindo a posição atual pelo menor valor encontrado pelo vetor inteiro.
        **/


        //looping por todo o array
        for (int i = 0; i < array.length- 1; i++) {
            // Encontra o índice do menor elemento no restante do array
            int initialIndex = i; //inicializa o menor elemento como sendo o atual
            for (int j = i + 1; j < array.length; j++) { //quando encontra um elemento menor que o atual, guarda a posição q se encontra
                if (array[j] < array[initialIndex]) {
                    initialIndex = j;
                }
            }

            // depois que percorreu todo o vetor, alem da posição atual, faz a troca, e o atual fica como o menor
            int temp = array[initialIndex];
            array[initialIndex] = array[i];
            array[i] = temp;
        }
    }
//    Printando resultados para vetor de tamanho 100
//    Tempo de execução em nanosegundos: 280800
//    Tempo de execução em milisegundos: 0,28
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 1000
//    Tempo de execução em nanosegundos: 1574400
//    Tempo de execução em milisegundos: 1,57
//    Tempo de execução em segundos: 0,00
//
//
//    Printando resultados para vetor de tamanho 10000
//    Tempo de execução em nanosegundos: 29477700
//    Tempo de execução em milisegundos: 29,48
//    Tempo de execução em segundos: 0,03
//
//
//    Printando resultados para vetor de tamanho 50000
//    Tempo de execução em nanosegundos: 450410200
//    Tempo de execução em milisegundos: 450,41
//    Tempo de execução em segundos: 0,45
//
//
//    Printando resultados para vetor de tamanho 100000
//    Tempo de execução em nanosegundos: 1667178100
//    Tempo de execução em milisegundos: 1667,18
//    Tempo de execução em segundos: 1,67

    //------------------------------------------------------------------------------

//*Complexidades:
//Complexidade de tempo no pior, médio e melhor caso: Para todos os casos, o Selection Sort tem uma complexidade
// O(n^2). Isso acontece pois independentemente de o vator já vir organizado (melhor caso), ele ainda faz
// comparações seguindo a lógica até o final.


//------------------------------------------------------------------------------

//*Complexidade de espaço: O Selection Sort tem  complexidade de espaço O(1). Isso se deve pois as ordenações sao feitas
// diretamente no vetor.
//------------------------------------------------------------------------------

//*Análise comparativa:
// O Selection Sort é um algoritmo que não é muito eficaz, já  que faz comparações para o índice atual, bem semelhante ao
// Bubble  sort. Porém, acaba sendo melhor que o Bubble Sort, nos casos médio e piores, pois ele não volta até o começo do
// array pára reordena-lo. Ele também não ocupa muita memória. Mas, para velocidade, outros algoritmos que dividem para conquistar
// seriam melhores.
}
