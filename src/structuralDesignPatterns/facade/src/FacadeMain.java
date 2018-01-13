package structuralDesignPatterns.facade.src;

import structuralDesignPatterns.facade.src.api.DBTypes;
import structuralDesignPatterns.facade.src.impl.HelperFacade;
import structuralDesignPatterns.facade.src.impl.MySqlHelper;
import structuralDesignPatterns.facade.src.impl.OracleHelper;
import structuralDesignPatterns.facade.src.api.ReportTypes;

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
