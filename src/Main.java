import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 0;
        int [] elements = new int[300];
        int insertions = scanner.nextInt();
             while (insertions-- > 0){
                width = scanner.nextInt();
                for (int i = 0; i<width; i++) {
                elements[i] = scanner.nextInt();
                }
                for (int j = 0; j < width; j++) {
                    int index = (j % 2 == 0) ? j / 2 : width - 1 - j / 2;
                    System.out.print(elements[index] + " ");
                }
                System.out.println();
        }
    }
}