import java.util.ArrayList;
import java.util.Arrays;

public class Population {

    private final float elitismRatio;
    private final float mutationRatio;
    private final float crossoverRatio;
    private final int chromosomeGeneLength;
    private Chromosome[] population;

    public Population(int populationSize, int chromosomeGeneLength, float crossoverRatio, float elitismRatio,
            float mutationRatio) {
        this.crossoverRatio = crossoverRatio;
        this.elitismRatio = elitismRatio;
        this.mutationRatio = mutationRatio;
        this.chromosomeGeneLength = chromosomeGeneLength;

        initializePopulation(populationSize);

        // Arrays.sort(population);
    }

    private void initializePopulation(int populationSize) {
        this.population = new Chromosome[populationSize];

        for (int i = 0; i < populationSize; i++) {
            population[i] = Chromosome.getRandomChromosome(chromosomeGeneLength);
        }
    }

    public Chromosome[] getParents() {
        // Returns two parents chosen from the population to reproduce
        return ParentSelection.tournamentSelection(population);
    }

    public Chromosome[] getChildren(Chromosome[] parents) {
        // TODO implement the crossover here
        // Returns an ArrayList of children generated from parents
        return null;
    }

    public Chromosome mutate(Chromosome individual) {
        // TODO Implement mutation function here
        // mutates a chromosome and returns the mutated product.
        return null;
    }

    public float evaluatePopulation() {
        // TODO evaluates the population by generating each individuals fitness
        // Returns the best fitness (I think) which stops the evolutions if good enough
        return 0.0f;
    }

    public void evolve() {
        Chromosome[] chromosomes = new Chromosome[population.length];
        int index = Math.round(population.length * elitismRatio); // Init the index with the strongest surviving
                                                                  // anyways.

        System.arraycopy(population, 0, chromosomes, 0, index); // Copy the elite into the next population

        while (index < chromosomes.length) {
            if (Configuration.INSTANCE.mersenneTwister.nextFloat() <= crossoverRatio) {
                // Parent selection
                Chromosome[] parents = getParents(); // We do one round of tournament selectino every round

                // Crossover should happen here
                Chromosome[] children = getChildren(parents);

                if (Configuration.INSTANCE.mersenneTwister.nextFloat() <= mutationRatio) {
                    // Mutation should happen here
                    children[0] = mutate(children[0]);
                }

                chromosomes[(index++)] = children[0];
                // Check if our population is not already full
                if (index < chromosomes.length) {
                    if (Configuration.INSTANCE.mersenneTwister.nextFloat() <= mutationRatio) {
                        children[0] = mutate(children[0]);
                    }
                    chromosomes[(index++)] = children[1];
                }
            }
            // If not crossover, then mutate or just add parent.
            else if (Configuration.INSTANCE.mersenneTwister.nextFloat() <= mutationRatio) {
                chromosomes[(index++)] = mutate(population[index]);
            } else {
                chromosomes[(index++)] = population[index];
            }
        }

        // Sorts the array and sets it as our new population
        Arrays.sort(chromosomes);
        population = chromosomes;
    }

}
