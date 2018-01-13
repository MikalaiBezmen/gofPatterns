package structuralDesignPatterns.facade.src.api;

import java.sql.Connection;

/**
 * DBHelper.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public interface DBHelper {

    Connection getConnection();
}
