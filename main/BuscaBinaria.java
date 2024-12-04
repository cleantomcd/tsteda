import java.util.*;

class BuscaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int[] v = vectorToIntArray(entrada);
        int k = sc.nextInt();
        buscaBinaria(v, 0, v.length - 1, k);
    }

    public static int[] vectorToIntArray(String vector) {
        String[] vec = vector.split(" ");
        int[] v = new int[vec.length];
        for(int i = 0; i < vec.length; i++) {
            v[i] = Integer.parseInt(vec[i]);
        }
        return v;

    }

    public static int buscaBinaria(int[] v, int ini, int fim, int k) {
        if(ini <= fim) {
            int meio = (ini + fim) / 2;
            System.out.println(meio);
            if(v[meio] == k) {
                return meio;
            }
            if(v[meio] < k) {
                return buscaBinaria(v, meio + 1, fim, k);
            }
            return buscaBinaria(v, ini, meio - 1, k);
        }
        System.out.println(-1);
        return -1;

    }
}
