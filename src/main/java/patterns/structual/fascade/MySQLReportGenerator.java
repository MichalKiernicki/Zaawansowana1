package patterns.structual.fascade;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLDBConnection() {
        System.out.println("Connection to MySQL established");
        return null;
    }

    public void generatePDFReportFromMySQL(String table, Connection connection) {
        System.out.println("Creating PDF report from " + table);
    }

    public void generateHTMLReportFromMySQL(String table, Connection connection) {
        System.out.println("Creating HTML report from " + table);
    }
}