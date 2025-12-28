import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        final int MAX_SEQUENCE_LENGTH = 100;

        Scanner scanner = new Scanner(System.in);

        int maxElements = 0;
        int totalSequence = scanner.nextInt();
        int numElements = 0;

        int [] currentSequence = new int[totalSequence];
        int [][] sortedSequence = new int[totalSequence][MAX_SEQUENCE_LENGTH];

        for (int j = 0; j < totalSequence ; j++) {
            numElements = scanner.nextInt();
            currentSequence[j] = scanner.nextInt();
            for (int i = 0; i < numElements; i++) {
            }
        }
        System.out.println();




        scanner.close();
    }

}