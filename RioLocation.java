public class RioLocation extends Location {

    public RioLocation() {
        super("Rio de Janeiro");
    }

    @Override
    public Enemy createEnemy(String enemyName) {
        // In Rio, enemies are criminals
        return new Criminal(enemyName);
    }
}

