import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        int maxweight = 15;
        int[] weights = {8,6,1,5};
        int[] values = {13,5,4,7};


        ArrayList<Integer> lol = new ArrayList<Integer>();
        lol.add(1);
        lol.add(0);
        lol.add(1);
        lol.add(0);
        // [1,0,1,0] gene ^
        Chromosome myChrome = new Chromosome(lol);
        System.out.println(myChrome.gene); //look at gene for associated chromosome
        float fitness = Utils.calculateFitness(myChrome, weights, values, maxweight);
        
        System.out.println(fitness); 
    }
}