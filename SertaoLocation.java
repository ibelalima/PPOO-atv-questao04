public class SertaoLocation extends Location {

    public SertaoLocation() {
        super("Sertao");
    }

    @Override
    public Enemy createEnemy(String enemyName) {
        // In the Sertao, enemies are cangaceiros
        return new Cangaceiro(enemyName);
    }
}
