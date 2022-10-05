public enum Configuration {
    INSTANCE;

    public final char[] targetGene = "genetic algorithms are fascinating".toCharArray();
    public final String fileSeparator = System.getProperty("file.separator");
    public final String lineSeparator = System.getProperty("line.separator");
    public final String userDirectory = System.getProperty("user.dir");
    public final String logFile = userDirectory + fileSeparator + "log" + fileSeparator + "pattern_matching.txt";
    public final MersenneTwister mersenneTwister = new MersenneTwister(System.currentTimeMillis());

    public final int populationSize = 2048;
    public final int maximumNumberOfGenerations = 10000;
    public final float crossoverRatio = 0.7f;
    public final float elitismRatio = 0.1f;
    public final float mutationRatio = 0.005f;
}
