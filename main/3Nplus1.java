import java.util.*;

class N3plus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(encontraMaiorSequencia(num1, num2));
        
    }

    public static int encontraMaiorSequencia(int num1, int num2) {

        if(num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        int numaux = 0;
        int auxcont = 1;
        int maiorsequencia = 0;
        while(num1 <= num2) {
            numaux = num1;
            while(numaux != 1) {
                if(numaux % 2 == 0) numaux /= 2;
                else numaux = (numaux * 3) + 1;
                auxcont += 1;
            }
            if(auxcont > maiorsequencia) maiorsequencia = auxcont; auxcont = 1;
            num1 += 1;
        }
        return maiorsequencia;



    }

}
