public class Cangaceiro implements Enemy {
    private final String name;

    public Cangaceiro(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Cangaceiro " + name + " attacks with a rifle and a fierce shout!");
    }
}
