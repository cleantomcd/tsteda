import java.util.*;

class BuscaLinearRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vector = sc.nextLine();
        int[] v = vectorToIntArray(vector);
        int k = sc.nextInt();
        System.out.println(buscaLinearRecursiva(v, 0, v.length - 1, k));
    }

    public static int buscaLinearRecursiva(int[] v, int ini, int fim, int k) {
        if(ini <= fim) {
            if(v[ini] == k) return ini;
            return buscaLinearRecursiva(v, ini + 1, fim, k);
        }
        return -1;

    }

    public static int[] vectorToIntArray(String vector) {
        String[] vec = vector.split(" ");
        int[] v = new int[vec.length];
        for(int i = 0; i < vec.length; i++) {
            v[i] = Integer.parseInt(vec[i]);
        }
        return v;

    }


}
