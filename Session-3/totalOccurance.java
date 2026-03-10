import java.util.*;
public class totalOccurance {
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
        int size = Scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        int First = firstOccurance(arr, target);
        int Last = lastOccurance(arr, target);
        int sol = -1;
        if(First==-1){
            sol = 0;
        }else {
            sol = Last-First+1;
        }
        System.out.print(sol);
    }
    public static int lastOccurance(int[] arr, int target){
        int high = arr.length-1;
        int low = 0;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result = mid;
                low = mid+1;
            }else if(target<arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
    public static int firstOccurance(int[] arr, int target){
        int high = arr.length-1;
        int low = 0;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result = mid; 
                high = mid-1;
            }else if(target<arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
       return result;
    }
}