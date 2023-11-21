public class insertionSort {

    public static void sortInsertion(int arr[]) {
        for(int i=1;i<arr.length;i++){

          int curr = arr[i];
          int prev = i-1;
          //swapping 
          while(prev>=0 && curr<arr[prev]){
            arr[prev+1]=arr[prev];
            prev--;
          }
          //Placing elt at right place
          arr[prev+1]= curr;

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
      int arr[]={19,-11,5,2,22};
      sortInsertion(arr); // sorting function call
      printArray(arr); // print array
    }
}
