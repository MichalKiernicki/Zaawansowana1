package patterns.structual.fascade;

import java.sql.Connection;

public class OracleReportGenerator {

    public static Connection getOracleDBConnection() {
        System.out.println("Connection to Oracle DB established");
        return null;
    }

    public void generatePDFReportFromOracle(String table, Connection connection) {
        System.out.println("Creating PDF report from " + table + " with Oracle DB");
    }

    public void generateHTMLReportFromOracle(String table, Connection connection) {
        System.out.println("Creating HTML report from " + table + " with Oracle DB");
    }
}
