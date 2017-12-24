package structuralDesignPatterns.facade;

import structuralDesignPatterns.facade.domain.DBTypes;
import structuralDesignPatterns.facade.domain.HelperFacade;
import structuralDesignPatterns.facade.domain.MySqlHelper;
import structuralDesignPatterns.facade.domain.OracleHelper;
import structuralDesignPatterns.facade.domain.ReportTypes;

import java.sql.Connection;

/**
 * FacadeMain.
 *
 * @author Mikalai Bezmen
 */
public class FacadeMain {

    public static void main(String[] args) {
        String tableName="Employee";
        //generating MySql HTML report and Oracle PDF report without using Facade
        MySqlHelper mySqlHelper = new MySqlHelper();
        Connection con = mySqlHelper.getConnection();
        mySqlHelper.generateHtmlReport(tableName, con);
        OracleHelper oracleHelper = new OracleHelper();
        Connection con1 = oracleHelper.getConnection();
        oracleHelper.generatePdfReport(tableName, con1);
        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
    }
}
