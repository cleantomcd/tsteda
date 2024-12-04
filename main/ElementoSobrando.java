import java.util.*;

// formas mais eficientes: xor e soma dos arrays

class ElementoSobrando {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] v1 = sc.nextLine().split(" ");
        String[] v2 = sc.nextLine().split(" ");
        int[] intv1 = vectorToIntArray(v1);
        int[] intv2 = vectorToIntArray(v2);
        System.out.println(encontraElementoSobrando(intv1, intv2));
    }

    public static int[] vectorToIntArray(String[] vector) {
        int[] v = new int[vector.length];
        for(int i = 0; i < vector.length; i++) {
            v[i] = Integer.parseInt(vector[i]);
        }
        return v;
    
    }

    public static int encontraElementoSobrando(int[] v1, int[] v2) {
        HashSet<Integer> contagem = new HashSet<Integer>();
        for(int num: v1) {
            contagem.add(num);
        }
        for(int num: v2) {
            if(!contagem.contains(num)) return num;
        }
        return 0;
    }


}
