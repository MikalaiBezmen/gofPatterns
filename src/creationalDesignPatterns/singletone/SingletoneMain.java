package creationalDesignPatterns.singletone;

/**
 * SingletoneMain.
 * Date: 07/22/2017
 *
 * @author Mikalai Bezmen
 */
public class SingletoneMain {

    public static void main(String[] args) {
        ChocolateBoilerSync chocolateBoilerSync = ChocolateBoilerSync.getInstance();
        chocolateBoilerSync.fill();
        chocolateBoilerSync.boil();
        chocolateBoilerSync.drain();

        ChocolateBoilerInitInstance chocolateBoilerInitInstance = ChocolateBoilerInitInstance.getInstance();
        chocolateBoilerInitInstance.fill();
        chocolateBoilerInitInstance.boil();
        chocolateBoilerInitInstance.drain();

        ChocolateBoilerVolotile chocolateBoilerVolotile = ChocolateBoilerVolotile.getInstance();
        chocolateBoilerVolotile.fill();
        chocolateBoilerVolotile.boil();
        chocolateBoilerVolotile.drain();
    }
}
