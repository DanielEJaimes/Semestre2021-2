
import java.util.Scanner;


public class MainFibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición:\n");
        int num = sc.nextInt();
        System.out.println("Fibonacci recursivo:"+fibonacciRec(num));
        System.out.println("Fibonacci iterativo:"+fibonacciIte(num));
    }

    public static long fibonacciIte(long posicion) {
                long siguiente = 1, actual = 0, temporal = 0;
                for (long x = 1; x <= posicion; x++) {
                        temporal = actual;
                        actual = siguiente;
                        siguiente = siguiente + temporal;
                }
                return actual;
        }

    public static int fibonacciRec(int n)
    {
        if (n>1){
           return fibonacciRec(n-1) + fibonacciRec(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("El número debe ser positivo");
            return -1; 
        }
    }
}
