package patterns.structual.fascade;

import java.sql.Connection;
import java.util.Collection;

public class MainReportGenerator {
    public static void main(String[] args) {

        System.out.println("Classic way report calling");

        //===MySQL
        Connection mySQLconnection = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
        mySQLReportGenerator.generatePDFReportFromMySQL("Customers",mySQLconnection);

        //===ORACLE
        Connection oracleConnection = OracleReportGenerator.getOracleDBConnection();
        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
        oracleReportGenerator.generateHTMLReportFromOracle("cars", oracleConnection);

        System.out.println("FASCADE - new way report calling");
        ReportProvider.generateReport(
                ReportProvider.DBType.ORACLE,
                ReportProvider.ReportType.PDF,
                "Customers"
        );
    }
}
