import java.util.ArrayList;
import java.util.Arrays;

public class Population {

    private final float elitismRatio;
    private final float mutationRatio;
    private final float crossoverRatio;
    private final int chromosomeGeneLength;
    private Chromosome[] population;
    
    public Population(int populationSize, int chromosomeGeneLength, float crossoverRatio, float elitismRatio, float mutationRatio) {
        this.crossoverRatio = crossoverRatio;
        this.elitismRatio = elitismRatio;
        this.mutationRatio = mutationRatio;
        this.chromosomeGeneLength = chromosomeGeneLength;
        
        initializePopulation(populationSize);

        //Arrays.sort(population);
    }

    private void initializePopulation(int populationSize) {
        this.population = new Chromosome[populationSize];

        for (int i = 0; i < populationSize; i++) {
            population[i] = Chromosome.getRandomChromosome(chromosomeGeneLength);
        }
    }

    public Chromosome[] getParents() {
        //TODO returns the parents chosen from the population as an ArrayList of Chromosomes
        return ParentSelection.tournamentSelection(population);
    }

    public Chromosome generateChild(Chromosome Parent1, Chromosome Parent2) {
        //TODO returns the (singular) child offspring given two parents
        return null;
    }

    public Chromosome[] getChildren(Chromosome[] parents) {
        //TODO returns an ArrayList of children generated from parents 
        return null;
    }

    public Chromosome[] mutate(Chromosome[] individuals) {
        //TODO mutates an arraylist of chromosomes and returns the mutated product.
        return null;
    }

    public float evaluatePopulation() {
        //TODO evaluates the population by generating each individuals fitness
        // Returns the best fitness (I think) which stops the evolutions if good enough
        return 0.0f;
    }

    public void setPopulation(Chromosome[] parents, Chromosome[] children) {
        //TODO sets the population to a combination of parents and children
        return;
    }

}
