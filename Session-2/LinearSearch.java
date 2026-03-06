import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        boolean Found = false;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                System.out.println(i);
                Found = true;
                break;
            }
        }
        if(Found){
            System.out.print("Found the Target");
        }else {
            System.out.print("Not Found");
        }
    }
}