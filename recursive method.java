In this code, the fibonacciRecursive method calculates the nth Fibonacci number using recursion. You can change the value of n in the main method to calculate the Fibonacci number for a specific value of 'n'. Simply replace int n = 10; with the desired value of 'n'
Code : 
public class FibonacciRecursive {

    public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        int n=20; // Change this to the desired value of n

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int result = fibonacciRecursive(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }
    }
}
