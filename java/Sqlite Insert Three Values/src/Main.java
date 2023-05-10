import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String fileName = "/home/rw/Zev/SQLite/EN-JP-Database/csv-files/sentences/5 introduce yourself 1.txt";
        String url = "jdbc:sqlite:/home/rw/Zev/SQLite/EN-JP-Database/EN-JB-DB.db";
        String tableName = "DATA";

        try (Connection conn = DriverManager.getConnection(url);
             BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            String insertQuery = "INSERT INTO " + tableName + " (japanese, english, romaji, segmentName, segmentNumber, type) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                pstmt.setString(1, values[0]);
                pstmt.setString(2, values[1]);
                pstmt.setString(3, values[2]);
                pstmt.setString(4, "Introduce Yourself 1");
                pstmt.setInt(5, 5);
                pstmt.setString(6, "S");
                pstmt.executeUpdate();
            }
            System.out.println("Data inserted successfully");

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
