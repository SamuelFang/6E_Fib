/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n <= 2) return 1; //base/recursive case decision, base case solution
        return fib_recurrence(n - 1) + fib_recurrence(n - 2); //recursive case solution
        //     ^recursive abstraction^concatenation            no leftover processing
    }
     /* These are class / instance methods because...
     class, no instance variables
     
     5. 45 is roughly the highest index for someone unwilling to wait more than a few seconds
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        if (n <= 1) return n;
        long previousNumber = 0;
        long currentNumber = 1;
        long answer = n;
        for (int counter = 1; counter < n; counter++) {
            answer = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = answer;
        }
        return answer;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       n
       As the proxy for the time required, count...
       loops
       Then cost of the the recurrence algorithm
       grows ?? linearly
       as the size of the problem increases,
       because ?? for how much n increases, the number of loops increase as well
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5))/2;
        double psi = 1 - phi;
        double answer = (Math.pow(phi,n) - Math.pow(psi,n))/Math.sqrt(5);
        return answer;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       n
       As the proxy for the time required, count...
       Math.pow
       Then cost of the the recurrence algorithm
       grows ?? constant
       as the size of the problem increases,
       because ?? size of n doesn't matter in the power function
     */
}
