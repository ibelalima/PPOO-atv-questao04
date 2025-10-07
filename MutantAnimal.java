public class MutantAnimal implements Enemy {
    private final String name;

    public MutantAnimal(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Mutant animal " + name + " attacks with poisonous claws!");
    }
}
