import java.util.Scanner;

public class MinMaxFinal {

    // Method to calculate minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to calculate maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to calculate both minimum and maximum
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        // -------- Command Line Version --------
        if (args.length > 0) {
            int[] arr = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            int[] result = findMinMax(arr);

            System.out.println("Command Line Input:");
            System.out.println("Minimum = " + result[0]);
            System.out.println("Maximum = " + result[1]);
        }

        // -------- Scanner Version --------
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMinMax(arr);

        System.out.println("\nScanner Input:");
        System.out.println("Minimum = " + result[0]);
        System.out.println("Maximum = " + result[1]);

        sc.close();
    }
}    