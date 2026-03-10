import java.util.Scanner;
public class upperBound{
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
        int size = Scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Scn.nextInt();
        }
        int target = Scn.nextInt();
        System.out.print(upperBound(arr, target));
    }
    public static int upperBound(int[] arr, int target){
        int high = arr.length-1;
        int low = 0; 
        int result = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                result = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return result;
    }
}