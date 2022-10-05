import java.util.ArrayList;

public class Chromosome {

    // Representation of choices
    private ArrayList<Integer> gene;

    // Fitness
    private float fitness;

    // Constructor
    public Chromosome(ArrayList<Integer> gene) {
        this.gene = gene;
        this.fitness = Utils.calculateFitness(this);
    }

}