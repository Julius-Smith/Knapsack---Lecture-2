import java.util.ArrayList;

public class Chromosome {

    // Representation of choices
    public ArrayList<Integer> gene;

    // Fitness
    public float fitness;

    // Constructor
    public Chromosome(ArrayList<Integer> gene) {
        this.gene = gene;
        this.fitness = 0;
    }

}