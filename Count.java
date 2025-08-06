import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array elements
        System.out.print("Enter the numbers: ");
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // Input the number X
        System.out.print("X = ");
        int x = sc.nextInt();

        // Find numbers smaller than X
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int num : numbers) {
            if (num < x) {
                count++;
                result.append(num).append(",");
            }
        }

        // Output the results
        System.out.println("Count = " + count);
        if (count > 0) {
            // Remove the last comma
            result.setLength(result.length() - 1);
            System.out.println("Numbers are = " + result);
        } else {
            System.out.println("No numbers smaller than " + x);
       }
  sc.close();
  }
}