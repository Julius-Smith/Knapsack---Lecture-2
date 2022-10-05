public class InversionMutation {

    
    public static  int[] inversionMutation(int arr[]){
        
        int pivot1 = Configuration.INSTANCE.mersenneTwister.nextInt(arr.length);
        int pivot2 = Configuration.INSTANCE.mersenneTwister.nextInt(arr.length);
        
        
        if (pivot1 > pivot2){
            int temp = pivot2;
            pivot2 = pivot1;
            pivot1 = temp;
        }

        for(int i = pivot1; i <= pivot2; i++){
            
            if(arr[i] == 0){
                arr[i] = 1;
            } else{
                arr[i] = 0;
            }
        }
        
        return arr;
    }

}