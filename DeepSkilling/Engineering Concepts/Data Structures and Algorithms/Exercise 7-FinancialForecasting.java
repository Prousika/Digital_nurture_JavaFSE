/*
Recursion - a technique where a method calls itselt repeatedly until a base condition is reached.
  Every Recursion Function has:
  Base case - Condition to stop recursion
  Recursive case - calls itself
*/

import java.util.Scanner;
public class FinancialForecasting {

    static double futureValueRecursive(double amount, double rate, int years){
        if(years==0)
            return amount;

        return futureValueRecursive(amount*(1+rate), rate, years-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Current Amount: ");
        double amount = in.nextDouble();

        System.out.println("Growth Rate: ");
        double rate = in.nextDouble();

        System.out.print("Years: ");
        int years = in.nextInt();

        double future = futureValueRecursive(amount, rate/100, years);

        System.out.println("Future Value = " + future);


    }
}
/*
Time Complexity: O(n) (one recursive call per year)
Space Complexity: O(n) (because of the recursive call stack)

Optimization - Iteration/memoization
*/

//Iteration - Best for large n - o(n) time but reduces space complexity to o(1) and avoids the risk of StackOverflowError
public static double futureValueIterative(double amount, double rate, int years){
      double value = amount;
      for(int i=0;i<years;i++){
        value*=(1+rate);
      }
  return value;
} 


//Memoization - better when recursive algorithm recomputes the same subproblems multiple times


//using Mathematical Formula

public static double futureValue(double amount, double rate, int years){
  return amount*Math.pow(1+rate, years);
}

