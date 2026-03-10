import java.util.*;

public class firstOccurance {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int size = Scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        int Sol = BinnarySearch(arr, target);
        System.out.print(Sol);

    }
    public static int BinnarySearch(int[] arr, int target){
        int high = arr.length-1;
        int low = 0;
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target == arr[mid]){
                result = mid;
                high = mid -1;
            }else if (target<arr[mid]){
                high = mid-1;
            }else if (target > arr[mid]){
                low = mid+1;
            }
        }
        return result;
    }
}