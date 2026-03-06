import java.util.*;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Scn.nextInt();
        }
       int j = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] != 0){
               Swap(arr,i,j);
                j++;
            }
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}