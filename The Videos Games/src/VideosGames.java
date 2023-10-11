import java.util.Random;

public class VideosGames {
    private static final int C = 10;
    public void play(){
        AlienFactory f = new AlienFactory();
        Alien [] aliens = new Alien[C];
        for (int i = 0; i < aliens.length ; i++){
            aliens[i] = f.getAlien();
        }
        for(Alien a: aliens ){
            System.out.println(a);
        }
    }
}
