import java.util.Random;

public class AlienFactory {
    private enum alienTypes { SQUID, RAT, TIGER, MONKEY};
    public static Random r = new Random();

    public Alien getAlien(){
        int n = r.nextInt(alienTypes.values().length);
        alienTypes t = alienTypes.values()[n];
        Alien result = null;
        switch(t){
            case SQUID:
                result = new SquidAlien();
                break;
            case TIGER:
                result = new TigerAlien();
                break;
            case MONKEY:
                result = new MonkeyAlien();
                break;
            case RAT:
                result = new RatAlien();
                break;
            default:
                System.out.println("Where alien?");
                System.exit(0);
        }
        return result;
    }
}
