import java.util.Scanner;
import java.util.Arrays;

public class copyArray {
    // Merging Arrays
    public static void main(String[] args) {
        System.out.print("Enter number of First Array's Elements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstArray[] = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            firstArray[i] = scanner.nextInt();
        }
        System.out.print("Enter Number of second Array's Element: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter " + n1 + " Elements: ");
        int secondArray[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            secondArray[i] = scanner.nextInt();
        }
        int[] result = new int[n + n1];

        // For copying array to another array: System.arraycopy(src, srcPos, dest,
        // destPos, length);
        System.arraycopy(firstArray, 0, result, 0, n);
        System.arraycopy(secondArray, 0, result, n, n1);
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}