public abstract class Location {
    protected String locationName;

    public Location(String locationName) {
        this.locationName = locationName;
    }

    // Factory Method
    public abstract Enemy createEnemy(String enemyName);

    // Template: spawn an enemy and make it attack
    public void spawnAndAttack(String enemyName) {
        Enemy enemy = createEnemy(enemyName);
        System.out.println("Location: " + locationName + " spawned an enemy:");
        enemy.attack();
        System.out.println();
    }
}

