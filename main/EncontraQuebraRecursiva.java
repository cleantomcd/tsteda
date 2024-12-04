import java.util.*;

class EncontraQuebraRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vector = sc.nextLine();
        int[] v = vectorToIntArray(vector);
        System.out.println(encontraQuebraOrdenada(v, 0, v.length - 1));
    }

    public static int[] vectorToIntArray(String vector) {
        String[] vec = vector.split(" ");
        int[] v = new int[vec.length];
        for(int i = 0; i < vec.length; i++) {
            v[i] = Integer.parseInt(vec[i]);
        }
        return v;

    }

    public static int encontraQuebraOrdenada(int[] v, int ini, int fim) {
        if(ini < fim) {
           if(v[ini] > v[ini + 1]) {
               return ini + 1;
           }
           return encontraQuebraOrdenada(v, ini + 1, fim);
        }
        return -1;
    }
}
