
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese valor A:");
        int a = sc.nextInt();
        System.out.println("Ingrese valor B:");
        int b = sc.nextInt();
        
        if (a > b){
            System.out.println("El valor de B debe ser mayor que el de A");
        }else{
            for (int i = a; i < b; i++) {
                boolean primo = esPrimo(a,b,i);
                if(primo == true){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }

    public static boolean esPrimo(int a, int b, int num){
        boolean primo = true;
        for (int i = 2 ; i < b ; i++){
                if (num%i == 0 && num != i){
                    primo = false;
                    break;
                }
        }
        return primo;
    
    } 
}
