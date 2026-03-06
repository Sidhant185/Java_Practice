import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Scn.nextInt();
        }
        int i =0; 
        int j = n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}