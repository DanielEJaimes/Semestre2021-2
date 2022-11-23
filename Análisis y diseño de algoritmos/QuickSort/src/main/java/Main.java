
public class Main {
    public static void main(String[] args) {
        int numeros[] = {6,1,5,9,3,8,7};
        QuickSort(numeros, 0, numeros.length-1);
        
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" - ");            
        }

    }
    
    public static void QuickSort(int array[], int izq, int der){
        
        int pivote = array[izq];
        int i = izq;
        int j = der;
        int aux;

 

        while(i<j){
            while(array[i]<= pivote && i<j){
                i++;
            }
            while(array[j] > pivote){
                j--;
            }
            if(i<j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

 

        array[izq] = array[j];
        array[j] = pivote;
        
        if(izq < j - 1){
            QuickSort(array, izq, j-1);
        }
        if(j+1 < der){
            QuickSort(array, j+1, der);
        }
    }
}
