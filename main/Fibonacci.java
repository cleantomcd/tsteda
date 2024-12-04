import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        if(n == 1) return 1;
        if(n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

}
