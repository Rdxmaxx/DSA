import java.util.Scanner;

class BasicArray {

    public static void Create_array(int arr[]) {
        // Declaration
        int array[] = new int[5];

        // Initialization
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Print array with index
        System.out.println("Print arrays with Index");
        System.out.println(array[0]);

        System.out.println("Print all arrays with loop");

        // Print all arrays with iteration

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Getting input from user to store data into array
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you wanna add ? : ");
        int n = scanner.nextInt();

        int array_input[] = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            array_input[i] = scanner.nextInt();
        }

        System.out.println("Showing the Array with Loop");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + array_input[i]);
        }
        scanner.close();

        // receives an array as a parameter
        System.out.println("Receiving an array as a parameter");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        Create_array(new int[] { 10, 11, 12, 13, 14 });
    }
}