public class ParentSelection {
    public static Chromosome[] tournamentSelection(Chromosome[] population) {
        // Input: Chromosome[] of the population. 
        // Returns: Chromosome[] of size 2 with two parents for reproduction.

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
        
        return parents;
    }
}
