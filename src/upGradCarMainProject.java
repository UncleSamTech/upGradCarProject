import java.util.ArrayList;
import java.util.List;

public class upGradCarMainProject {

    public static void main(String[] args) {
        System.out.println(recursive_factorial(8));
        System.out.println(recursive_fibonacci(5));
        System.out.println(factorialIterative(5));
    }

    public static int recursive_factorial(int number){
        if(number == 0){
            return 1;
        }
        if(number == 1){
            return 1;
        }
        if(number == 2){
            return 2;
        }
        return number * recursive_factorial(number - 1);
    }

    public static int factorialIterative(int number){
        int newValu = 1;
        if(number == 0)
            return 1;
        if(number == 1)
            return 1;
        if(number == 2)
            return 2;
        for(int i = 2; i <= number;i++) {
            newValu = newValu * i;

        }
        return newValu;


    }
    // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

    public static int recursive_fibonacci(int num){
        if(num < 2)
            return num;
        return recursive_fibonacci(num - 1) + recursive_factorial(num - 2);
    }

    public static int fibonacciIterative(int num){
      ArrayList<Integer> arrVal =  new ArrayList<Integer>();
      arrVal.add(0,0);
      arrVal.add(1,1);
      for(int i = 2 ; i < num + 1; i++){
          //arrVal.add(3,arrVal[i - 2] + arrVal[i - 1]);
      }
        return 0;
    }
}
