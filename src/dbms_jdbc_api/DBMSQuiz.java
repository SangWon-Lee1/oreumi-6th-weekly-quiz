package dbms_jdbc_api;

import java.sql.*;

public class DBMSQuiz {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/weekly_quiz";
        String username = "root";
        String password = "0000";

        try (
             Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39");
             ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                System.out.println(name + "\t" + age + "\t" + address);
            }
        } catch (SQLException e) {
            System.out.println("SQL 오류 발생");
        }
    }
}