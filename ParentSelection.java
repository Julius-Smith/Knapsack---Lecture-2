public class ParentSelection {
    public static Chromosome[] tournamentSelection(Chromosome[] population) {
        /*
         * Input: population of Chomosome[] from the population.java
         * Output: Two parents selected for crossover. Chromosome[] 
         */

        Chromosome[] waitingArea = new Chromosome[population.length];
        System.arraycopy(population, 0, waitingArea, 0, 0); //Check if this is a shallow copy
        int numOfExpectedParents = population.length; // Make this the actual length we want.

        Chromosome[] winners = new Chromosome[population.length];
        while(winners.length<numOfExpectedParents){
            float randint = Configuration.INSTANCE.mersenneTwister.nextInt(population.length);
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
        
        // We run two rounds of selecting parents by selecitng randomly.
        Chromosome[] parents = new Chromosome[2];
        for (int i = 0; i < 2; i++) { //Make this a while loop (or is it good like this?)
            //Select first parent to fight 
            parents[i] = population[Configuration.INSTANCE.mersenneTwister.nextInt(population.length)];
            //Go through three others to fight against it, the winner stays.
            for (int j = 0; j < 3; j++) {
                int randint = Configuration.INSTANCE.mersenneTwister.nextInt(population.length);
                if (parents[i].fitness < population[randint].fitness) {
                    parents[i] = population[randint];
                }
            }
        }
        
        return (parents);
    }
}
