import java.util.Random;


public class AlienFactoryButBetter {
    private enum alienTypes { SquidAlien, RatAlien, TigerAlien, MonkeyAlien}; //Enum names have to be the same as the class names
    public static Random r = new Random();

    public Alien getAlien() {
        int n = r.nextInt(alienTypes.values().length);
        alienTypes t = alienTypes.values()[n];
        Alien alien = null;
        try {
            alien =
                    (Alien)( Class.forName(t.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e){
            System.out.println("Unknown Alien Type");
        }
        return alien;
    }
}
