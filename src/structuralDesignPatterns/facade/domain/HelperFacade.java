package structuralDesignPatterns.facade.domain;

import java.sql.Connection;

/**
 * HelperFacade.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection;
        switch (dbType) {
            case MYSQL:
                MySqlHelper mySqlHelper = new MySqlHelper();
                connection = mySqlHelper.getConnection();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateHtmlReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generatePdfReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                OracleHelper oracleHelper = new OracleHelper();
                connection = oracleHelper.getConnection();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateHtmlReport(tableName, connection);
                        break;
                    case PDF:
                        oracleHelper.generatePdfReport(tableName, connection);
                        break;
                }
                break;
        }
    }
}
