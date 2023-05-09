import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;


public class Main {

    public static void main(String[] args) {

        String fileName = "/file/path/.txt";
        String url = "jdbc:sqlite:/data/base/path/.db";
        String tableName = "DATA";

        try (Connection conn = DriverManager.getConnection(url);
             BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            String insertQuery = "INSERT INTO " + tableName + " (japanese, english, segmentName, segmentNumber) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                pstmt.setString(1, values[0]);
                pstmt.setString(2, values[1]);
                pstmt.setString(3, "Katakana");
                pstmt.setInt(4, 2);
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