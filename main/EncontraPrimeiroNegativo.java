import java.util.*;

class EncontraPrimeiroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vector = sc.nextLine();
        String[] v = vector.split(" ");
        System.out.println(encontraPrimeiroNegativo(v, 0, v.length - 1));
    }

    public static String encontraPrimeiroNegativo(String[] v, int ini, int fim) {
        if(ini <= fim) {
            if(Integer.parseInt(v[ini]) < 0) return v[ini];
            return encontraPrimeiroNegativo(v, ini + 1, fim);
        }
        return "-";
    }


}
