/*
 Write a Java program to find the factorial of a given number using both iterative and recursive approaches.
 */

public class Factorial {

  public static void iterativeFactorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    System.out.println("(Iterative) Factorial of " + n + " is " + factorial);
  }

  public static int recursiveFactorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * recursiveFactorial(n - 1);
    }
  }

  public static void main(String[] args) {

    iterativeFactorial(5);
    System.out.println("(Recursive) Factorial of 5 is " + recursiveFactorial(5));

  }

}