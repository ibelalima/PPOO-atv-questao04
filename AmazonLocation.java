public class AmazonLocation extends Location {

    public AmazonLocation() {
        super("Amazonia");
    }

    @Override
    public Enemy createEnemy(String enemyName) {
        // In the Amazon, enemies are mutant animals
        return new MutantAnimal(enemyName);
    }
}
