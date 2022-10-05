public class Utils {
    public static float calculateFitness(Chromosome c) {
        return 0.0f;
    }
    
    public static Chromosome generateRandomChromosome(int chromosomeLength) {

        ArrayList< Integer> gene = new ArrayList<>();

        for(int i = 0; i < chromosomeLength; i++) {
            gene.add(Configuration.INSTANCE.mersenneTwister.nextInt(1));
        }
        
        Chromosome chromosome = new Chromosome(gene);

        return chromosome;
    }
}
