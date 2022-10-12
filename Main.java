import java.lang.reflect.Array;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Population population = new Population(1000, 10, 0.7f, 0.1f, 0.005f);
        
        float threshold = 10.0f; // needs to be set properly later.
        boolean GoodEnough = false;

        // Evolution loop
        while(!GoodEnough) {
            
            if(population.evaluatePopulation() >= threshold) {
                GoodEnough = true;
            }

            Chromosome[] parents = population.getParents();

            Chromosome[] children = population.getChildren(parents);

            children = population.mutate(children);

            population.setPopulation(parents, children);

        }
    }
}