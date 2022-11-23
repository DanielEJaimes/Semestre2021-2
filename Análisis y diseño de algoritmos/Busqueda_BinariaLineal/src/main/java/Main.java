

public class Main {
    
    public static void main(String[] args) {
        int array[] = new int[]{0,2,3,6,4,9};
        System.out.println("lineal");
        System.out.println(Lineal(array,9));
        System.out.println("binaria");
        System.out.println(Binaria(array,9));
    }
    
    public static int Lineal(int[] array, int n) {
        int pos = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static int Binaria(int[] array, int n)
    {
        int pos;
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin){
            pos = (inicio+fin)/2;
            if (array[pos] == n){
                return pos;
            }else if (array [pos] < n){
                inicio = pos + 1;
            }else{
                fin = pos - 1;
            }
        }
        return -1;
    }
}
