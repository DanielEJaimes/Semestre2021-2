public class HeapSort {
    
    public void sort(Persona arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        
        for (int i = n - 1; i > 0; i--) {
            Persona temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    
    void heapify(Persona arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < n && arr[l].getEdad() > arr[largest].getEdad())
            largest = l;

        if (r < n && arr[r].getEdad() > arr[largest].getEdad())
            largest = r;

        if (largest != i) {
            Persona swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
