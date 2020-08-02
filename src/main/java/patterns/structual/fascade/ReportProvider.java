package patterns.structual.fascade;

import java.sql.Connection;

public class ReportProvider {
    public enum DBType {
        MYSQL,
        ORACLE,
    }
    public enum ReportType {
        HTML,
        PDF,
    }

    public static void generateReport(DBType dbtype, ReportType reportType, String table) {
        Connection connection;
        switch (dbtype) {
            case ORACLE:
                connection = OracleReportGenerator.getOracleDBConnection();
                OracleReportGenerator generator = new OracleReportGenerator();
                switch (reportType) {
                    case PDF:
                        generator.generatePDFReportFromOracle(table, connection);
                        break;
                    case HTML:
                        generator.generateHTMLReportFromOracle(table,connection);
                        break;
                }
                break;
            case MYSQL:
                connection = MySQLReportGenerator.getMySQLDBConnection();
                MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
                switch (reportType) {
                    case PDF:
                        mySQLReportGenerator.generatePDFReportFromMySQL(table,connection);
                        break;
                    case HTML:
                        mySQLReportGenerator.generateHTMLReportFromMySQL(table,connection);
                        break;
                }
        }
    }
}
