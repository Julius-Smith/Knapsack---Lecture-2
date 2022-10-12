import java.util.Arrays;

public class BitflipMutation{

    public static void main(String[] args){
        System.out.println("Testing bit flip mutations");
        int[] test = {1,0,0,0,0,0,1,1};
        System.out.print(Arrays.toString(test));
        System.out.print(Arrays.toString(bitflipMutation(test)));
    }

    public static int[] bitflipMutation(int arr[]){ //for binary chromosomes only
        int bit_to_flip = Configuration.INSTANCE.mersenneTwister.nextInt(arr.length-1);
        
        if(arr[bit_to_flip] == 1){
            arr[bit_to_flip] = 0;
        }
        else if (arr[bit_to_flip] == 0){
            arr[bit_to_flip] = 1;
        }
        
        return arr;
    }
}