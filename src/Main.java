import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 0;
        int [] elements = new int[300];
        int insertions = scanner.nextInt();
             for (int i =0; i< insertions;i++){
                width = scanner.nextInt();
                elements[0] = scanner.nextInt();

                elements = sortElements(width,elements);
                printElements(elements, width);
        }
    }
    public static int[] sortElements (int width, int[] elements) {
        int [] sortedElements = new int [300];
        for (int i =0, j =elements.length -1;i < width;i++, j--) {
            sortedElements[(i<elements.length/2-2) ? elements[i] : elements.length-1] = elements[i];
            sortedElements[(j>elements.length/2-2) ? elements[j] : elements.length-1] = elements[j];
        }
        return sortedElements;
    }
    public static void printElements (int[] elements, int width) {
        Arrays.stream(elements).limit(width).forEach(e -> System.out.print(e + " "));
    }
}