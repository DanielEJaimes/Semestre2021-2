import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6,1,5,9,3,8,7};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    
    public static void quicksort(int arreglo[], int izq, int der) {
        System.out.println(Arrays.toString(arreglo));
        int i,j,pivote,aux;
        i = izq;
        j = der;
        pivote = arreglo[izq];
        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
            if(i<=j){
                aux = arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(izq<j){
            quicksort(arreglo,izq,j);
        }
        if(i<der){
            quicksort(arreglo,i,der);
        }
    }
    
    public static void OrdenInsercion(int arreglo[]){                                            
    int i, j;
    int aux;
    for (i = 1; i < arreglo.length; i++){
        aux = arreglo[i];
        j = i - 1;
        while ((j >= 0) && (aux < arreglo[j])){                       
            arreglo[j + 1] = arreglo[j];
                j--; 
            }
            arreglo[j + 1] = aux;
        }
    }
}
