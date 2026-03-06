import java.util.*;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Scanner Scn = new Scanner(System.in);

        int n = Scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Scn.nextInt();
        }

        int largest;
        int second;

        if(arr[0] > arr[1]){
            largest = arr[0];
            second = arr[1];
        } else {
            largest = arr[1];
            second = arr[0];
        }

        for(int i = 2; i < n; i++){

            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }

            else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}