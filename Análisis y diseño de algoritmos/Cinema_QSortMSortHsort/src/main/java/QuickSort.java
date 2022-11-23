
public class QuickSort {
    
    public static void QuickSort(Persona array[], int izq, int der){
        
        Persona pivote = array[izq];
        int i = izq;
        int j = der;
        Persona aux;

 

        while(i<j){
            while(array[i].getEdad()<= pivote.getEdad() && i<j){
                i++;
            }
            while(array[j].getEdad() > pivote.getEdad()){
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
