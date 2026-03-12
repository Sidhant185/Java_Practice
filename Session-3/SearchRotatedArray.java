import java.util.Scanner;
public class SearchRotatedArray{
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
        int size = Scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        System.out.print(Search(arr, target));
    }
    public static int Search(int[] arr, int target){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<= target && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}