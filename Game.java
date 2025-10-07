public class Game {
    public static void main(String[] args) {
        // Simulação: trocando de localizações e criando inimigos via Factory Method
        Location amazon = new AmazonLocation();
        Location sertao = new SertaoLocation();
        Location rio = new RioLocation();

        // Simular algumas spawns
        amazon.spawnAndAttack("Jaguar-X");
        amazon.spawnAndAttack("Boa-Prime");

        sertao.spawnAndAttack("Lampiao-Impostor");
        sertao.spawnAndAttack("Zé-do-Tiro");

        rio.spawnAndAttack("StreetBoss-01");

        // Mostra que o jogo só pede inimigos sem saber a implementação
        Location current = chooseLocation("Sertao");
        current.spawnAndAttack("Cangaceiro-Sombra");
    }

    // método auxiliar que simula escolher uma localização por nome
    private static Location chooseLocation(String name) {
        if ("Amazonia".equalsIgnoreCase(name) || "Amazon".equalsIgnoreCase(name)) {
            return new AmazonLocation();
        } else if ("Sertao".equalsIgnoreCase(name) || "Sertão".equalsIgnoreCase(name)) {
            return new SertaoLocation();
        } else {
            return new RioLocation();
        }
    }
}
