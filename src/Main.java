import java.util.Random;

public class Main {
    private static final int[] arrayLengths = {100,1000,10000,50000,100000};
    private static final int NUM_TESTES = 5;

    public static void main(String[] args) {
        for (int arrayLength : arrayLengths) {
            long somaTemposNano = 0;

            for (int i = 0; i < NUM_TESTES; i++) {
                var array = buildNewArrayByLength(arrayLength);
                long startTime = System.nanoTime();
                HeapSort.heapSort(array);
                long finalTime = System.nanoTime() - startTime;

                somaTemposNano += finalTime;
            }

            long mediaNano = somaTemposNano / NUM_TESTES;
            printResults(mediaNano, arrayLength);
        }
    }

    private static void printResults(long finalTime, int arrayLength) {
        System.out.println("\n\nPrintando resultados para vetor de tamanho " + arrayLength);
        double duracaoMili = finalTime / 1_000_000.0;
        double duracaoSeg = finalTime / 1_000_000_000.0;

        System.out.printf("Tempo de execução em nanosegundos: %d%n", finalTime);
        System.out.printf("Tempo de execução em milisegundos: %.2f%n", duracaoMili);
        System.out.printf("Tempo de execução em segundos: %.2f%n", duracaoSeg);
    }

    private static int[] buildNewArrayByLength(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }

        return array;
    }
}
