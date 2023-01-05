package Test;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
