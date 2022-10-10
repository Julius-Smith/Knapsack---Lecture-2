import java.util.ArrayList;

public class Chromosome implements Comparable {

    // Representation of choices as binary numbers (1=take, 0=leave)
    public ArrayList<Integer> gene;

    public float fitness;

    // Constructor
    public Chromosome(ArrayList<Integer> gene) {
        this.gene = gene;
        this.fitness = 0.0f;
    }
    
    public static Chromosome getRandomChromosome(int geneLength) {
        ArrayList<Integer> gene = new ArrayList<>();

        for(int i = 0; i < geneLength; i++) {
            gene.add(Configuration.INSTANCE.mersenneTwister.nextInt(1));
        }
        
        Chromosome chromosome = new Chromosome(gene);

        return chromosome;
    }

    public float generateFitness() {
        //TODO generate fitness for this chromosome and return it
        return 0.0f;
    }

    public void mutate() {
        //TODO mutates this chromosome's gene somehow
        return;
    }

    @Override
    public int compareTo(Object o) {
        //TODO compare based on fitness.
        return 0;
    }

}
