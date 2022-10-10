public class Utils {
    public static float calculateFitness(Chromosome c,int[] w,int[] v, int m) {
        int fitness = 0;
        int totalweight = 0;
        for(int i = 0; i < c.gene.size(); i++){
            if (c.gene.get(i) == 1){
                totalweight += w[i];
                fitness += v[i];
            }
        }
        if (totalweight > m){
            fitness = 0; //weight limit exceeded. more efficient to move to the fitness calculator but i dont like java.
        }
        return fitness;
    }
    
}
