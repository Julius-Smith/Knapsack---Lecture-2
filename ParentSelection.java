
public class ParentSelection {
    public static Chromosome[] TournamentSelection(Chromosome[] population) {
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

        while(waitingArea.length>numOfExpectedParents)
        /*
         * Outline:
         * Select a number of even individuals 2, 4 or 6 ... 
         * THen in the arena from the waiting space we select two indiciduals until we have the expected
         * number of individuals.
         * THe better the fitness, the individual wins. 
         * Winning is going back to the waiting area. 
         * Keep going until we have the preferred amount of parents. 
         * ASK TUTOR: How many parents do we want to keep? 
         */
        

        for (int i = 0; i < 2; i++) { //Make this a while loop
            float randint = Configuration.INSTANCE.mersenneTwister.nextFloat();
        }
        
        return (waitingArea);
    }
}
