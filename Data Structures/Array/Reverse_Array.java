import java.util.Scanner;

public class Reverse_Array {

    static int MAX = 10;

    static void Reverse(int array[], int start, int end, int n) {
        int temp;
        while (start < end) {
            // Changing the array's data with index
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("\t\tReversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = new int[MAX];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total Number of Elements to be entered: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements which is to be reversed: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int start = 0;
        int size = n - 1;
        Reverse(array, start, size, n);
        scanner.close();
    }
}
