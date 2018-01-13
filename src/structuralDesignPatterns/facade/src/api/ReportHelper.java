package structuralDesignPatterns.facade.src.api;

import java.sql.Connection;

/**
 * ReportHelper.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public interface ReportHelper {

    void generatePdfReport(String tableName, Connection connection);
    void generateHtmlReport(String tableName, Connection connection);
}
