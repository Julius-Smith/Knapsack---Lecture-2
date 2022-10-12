import java.util.Arrays;
import java.util.Collections;

public class InversionMutation {

// testing
//    public static void main(String[] args){
//
//        int[] test = {2,4,5,7,8,6,1,9};
//        System.out.print(inversionMutation(test));
//    }

    
    public static int[] inversionMutation(int arr[]){
        
        int pivot1 = Configuration.INSTANCE.mersenneTwister.nextInt(arr.length-1);
        int pivot2 = Configuration.INSTANCE.mersenneTwister.nextInt(arr.length-1);
        
        if (pivot1 > pivot2){
            int temp = pivot2;
            pivot2 = pivot1;
            pivot1 = temp;
        } else if (pivot1 == pivot2){
            pivot2++;
        }

        int[] temp = Arrays.copyOfRange(arr, pivot1, pivot2);
        int j = temp.length;
        int [] temp2 = new int[j];

        for (int i = 0; i < temp.length; i++) {
            temp2[j - 1] = temp[i];
            j = j - 1;
        }

        int[] genome = new int[arr.length];
        for(int i = 0; i < pivot1; i++){
            genome [i] = arr[i]; 
        }

        int count = 0;
        for(int i = pivot1; i < pivot2; i++){
            genome[i] = (temp2[count]);
            count++;
        }

        for(int i = pivot2; i <= arr.length-1; i++){
            genome[i] = arr[i];
        }
        return genome;
    }
}