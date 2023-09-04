There are some of errors in code,they are :
1. your are trying to access an element at index '10' in the 'numbers'array,which is out of bounds.
 arrray has only 5 elements.
2.you are dividing by zero in the divide method which gives exception called 'ArithmeticException'.

To handle this exception,I have corrected the code.

Corrected code : 

//Program to demonstrate ExceptionHandling//
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Accessing an in-bounds index
            System.out.println(numbers[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
