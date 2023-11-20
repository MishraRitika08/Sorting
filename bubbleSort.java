class bubbleSort{

    public static void sort(int arr[]) {
        for(int i=0;i< arr.length - 1;i++){

            for(int j=0;j< arr.length-i-1;j++){
                
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    //printing array 

    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + "-> ");
        }
    }
    public static void main(String args[]){
      int arr[]={19,1,5,2,12};
      sort(arr); // sorting function call
      printArray(arr);
    }
}