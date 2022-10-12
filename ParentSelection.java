import java.util.ArrayList;

public class ParentSelection {
    //RATHER DO THIS LIKE the premade code. Selecting two parents at a time. 
    public static Chromosome[] tournamentSelection(Chromosome[] population) {
        /*
         * Call: parents = ParentSelection.TournamentSelection(population);  //RETHINK This
         * 
         * Tournament selection for use in Evolution.java
         * Input: population of Chomosome[] from the population.java
         * Output: Parents selected for crossover. Chromosome[] (Maybe we only shall return two of the parents. I think it is better if I implement the entire evolve function.)
         */

        Chromosome[] waitingArea = new Chromosome[population.length];
        System.arraycopy(population, 0, waitingArea, 0, 0); //Check if this is a shallow copy
        int numOfExpectedParents = population.length; // Make this the actual length we want.

        Chromosome[] winners = new Chromosome[population.length];
        while(winners.length<numOfExpectedParents){
            float randint = Configuration.INSTANCE.mersenneTwister.nextFloat();
            // Find another random parent
        }
        /*
         * Mating pool strategy: 
         * Have a pool of like 20, and from that we select by roulette or tournament. It is best to work with a middle 
         *      mating pool. We produce our 40 children. Put it to the population, sort the popoulation by fitness and cut it. 
         * One parent can reproduce multiple times. We have our parents and fight until we have 
         * 
         * 
         * 
         * 'Outline:
         * Select a number of even individuals 2, 4 or 6 ... 
         * THen in the arena from the waiting space we select two indiciduals until we have the expected
         * number of individuals.
         * THe better the fitness, the individual wins. 
         * Winning is going back to the waiting area. 
         * Keep going until we have the preferred amount of parents. 
         * ASK TUTOR: How many parents do we want to keep? 
         */
        

        for (int i = 0; i < numOfExpectedParents; i++) { //Make this a while loop (or is it good like this?)
            
        }
        
        return (waitingArea);
    }
}
