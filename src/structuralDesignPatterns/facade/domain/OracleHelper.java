package structuralDesignPatterns.facade.domain;

import java.sql.Connection;

/**
 * OracleHelper.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class OracleHelper implements DBHelper, ReportHelper {

    @Override
    public Connection getConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    @Override
    public void generatePdfReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }

    @Override
    public void generateHtmlReport(String tableName, Connection connection) {
        //get data from table and generate pdf report
    }
}
