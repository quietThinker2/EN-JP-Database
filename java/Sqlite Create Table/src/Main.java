import java.sql.*;

public class Main {


    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Connect to the database
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:/home/rw/Zev/SQLite/EN-JP-Database/EN-JB-DB.db");

            // Create the table and columns
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE DATA " +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "japanese TEXT, " +
                    "english TEXT, " +
                    "romaji TEXT, " +
                    "type CHAR(1), " +
                    "segmentNumber INTEGER, " +
                    "segmentName TEXT)";
            stmt.executeUpdate(sql);

            // Close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}