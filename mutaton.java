import java.util.Arrays;

public class mutaton {

    public static int[][] twoPointCrossover(int[] parent1, int[] parent2, int point1, int point2){
        if (point2 < point1){
            int temp = point1;
            point1 = point2;
            point2 = temp;
        }
        int[] child1 = new int[parent1.length];
        int[] child2 = new int[parent1.length];
        for (int i = 0; i < parent1.length; i ++){
            if (i < point1){
                child1[i] = parent1[i];
                child2[i] = parent2[i];
            }
            else if(i >= point1 & i <= point2){
                child1[i] = parent2[i];
                child2[i] = parent1[i];
            }
            else{
                child1[i] = parent1[i];
                child2[i] = parent2[i];
            }
        }
        return new int[][] {child1, child2};
    }
}
