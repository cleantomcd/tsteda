import java.util.*;

class PotenciaRecursiva { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expoente = sc.nextInt();
        System.out.println(potenciaRecursiva(base, expoente));
    }

    public static int potenciaRecursiva(int base, int expoente) {
        if(expoente == 0) return 1;
        return base * potenciaRecursiva(base, expoente - 1);
    }

}
