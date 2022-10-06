public class Population {

    private final float elitismRatio;
    private final float mutationRatio;
    private final float crossoverRatio;
    private Chromosome[] population;
    
    public Population(int size, float crossoverRatio, float elitismRatio, float mutationRatio) {
        this.crossoverRatio = crossoverRatio;
        this.elitismRatio = elitismRatio;
        this.mutationRatio = mutationRatio;
        population = new Chromosome[size];

        for (int i = 0; i < size; i++) {
            population[i] = Chromosome.generateRandom();
        }

        Arrays.sort(population);
    }

}
