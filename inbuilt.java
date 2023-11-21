import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    
    public static void printArray(Integer arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i< n-1){
                System.out.print(" -> ");
            }
        }
    }
    public static void main(String args[]){
      Integer arr[]={19,1,5,2,12};
      Arrays.sort(arr,0,3); // sorting function call
      Arrays.sort(arr,Collections.reverseOrder());
      printArray(arr);
    }
}
