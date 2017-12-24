package behavioralDesignPatterns.templateMethod.src.domain;

/**
 * GlassHouse.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
