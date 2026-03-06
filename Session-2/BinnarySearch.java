import java.util.*;

public class BinnarySearch {

    public static void main(String[] args) {

        Scanner Scn = new Scanner(System.in);

        int n = Scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Scn.nextInt();
        }

        int target = Scn.nextInt();

        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                return mid;
            }

            else if(target < arr[mid]){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return -1;
    }
}