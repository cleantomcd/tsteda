import java.util.*;

class TeoremaMestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] func = sc.nextLine().split(" ");
        int[] coeficientes = vectorToIntArray(func);
	System.out.println(teoremaMestre(coeficientes));
    }

    public static String teoremaMestre(int[] func) {
        int a = func[0];
        int b = func[1];
       	int n = func[2];
	int logAbaseB = (int) (Math.log(a) / Math.log(b));	
        if(n > logAbaseB) return "T(n) = theta(n**"+n+")";
        if(n == logAbaseB) return "T(n) = theta(n**" + n + " * log n)";
        return "T(n) = theta(n**1 * log n)";
    }
    
    public static int[] vectorToIntArray(String[] vector) {
        int[] v = new int[vector.length];
        for(int i = 0; i < vector.length; i++) {
            v[i] = Integer.parseInt(vector[i]);
        }
        return v;

    }

}
