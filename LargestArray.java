import java.util.Arrays;
import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Largest element: " + array[n - 1]);
        System.out.println("Smallest element: " + array[0]);
        
    }
}


