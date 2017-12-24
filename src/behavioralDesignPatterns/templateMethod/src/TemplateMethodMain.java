package behavioralDesignPatterns.templateMethod.src;

import behavioralDesignPatterns.templateMethod.src.domain.GlassHouse;
import behavioralDesignPatterns.templateMethod.src.domain.HouseTemplate;
import behavioralDesignPatterns.templateMethod.src.domain.WoodenHouse;

/**
 * TemplateMethodMain.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class TemplateMethodMain {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        //using template method
        houseType.buildHouse();
        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
