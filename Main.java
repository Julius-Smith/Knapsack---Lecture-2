import java.lang.reflect.Array;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Population population = new Population(1000, 10, ?, ?, 0.005);
        
        float threshold = 10.0f; // needs to be set properly later.
        boolean GoodEnough = false;

        // Evolution loop
        while(!GoodEnough) {
            
            if(population.evaluatePopulation() >= threshold) {
                GoodEnough = true;
            }

            ArrayList<Chromosome> parents = population.getParents();

            ArrayList<Chromosome> children = population.getChildren(parents);

            children = population.mutate(children);

            population.setPopulation(parents, children);

        }
    }
}