public class Criminal implements Enemy {
    private final String name;

    public Criminal(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Criminal " + name + " attacks with city-style tactics!");
    }
}

