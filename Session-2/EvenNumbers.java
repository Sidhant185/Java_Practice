import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Scn.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count = count+1;
                System.out.println(arr[i]);
            }
        }
        System.out.print("Total number of even number are = "+count );
    }
}