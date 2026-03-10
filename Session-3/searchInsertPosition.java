import java.util.Scanner;
public class searchInsertPosition{
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
        int size = Scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        System.out.print(Position(arr,target));
    }
    public static int Position(int[] arr, int target){
        int high = arr.length-1;
        int low = 0; 
        int result = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                result = mid; 
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return result;
    }
}