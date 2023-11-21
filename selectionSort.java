public class selectionSort {
    
    //Selection Sort

    public static void sortSelection(int arr[]) {
        for(int i=0;i<arr.length-1;i++){

        int minPosition=i;

            for(int j=i+1; j<arr.length;j++){

                if(arr[minPosition]>arr[j]){
                    minPosition = j;
                }
            }
            
            //swap
            int temp = arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
            
        }
        
    }
 // Function to print array
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " -> ");
        }
    }
   //Main function
    public static void main(String args[]){
      int arr[]={19,-11,5,2,-122};
      sortSelection(arr); // sorting function call
      printArray(arr); // print array
    }
}
