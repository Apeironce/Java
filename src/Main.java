package src;


import java.sql.*;

public class Main {
    private static Connection connection = null;
    private static String url = "jdbc:postgresql://95.213.183.180:5432/test_prod";
    private static String username = "postgres";
    private static String password = "fWs@Qu434";

    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        String sql;
        String val = "";

        try {
            System.out.println("Открыл соединение\n");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Задание 1:");
            sql = "select * from employeesAge where age>20";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.printf("%s %s \n",
                        rs.getString("employeeName"), rs.getString("age"));
            }

            System.out.println("\nЗадание 2:");
            sql = "select departmentName, avg(salary) as averageSalary from departmentsalary group by departmentName";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.printf("%s %s \n",
                        rs.getString("departmentName"), rs.getString("averageSalary"));
            }
            System.out.println("\nЗадание 3:");
            sql = "select employeename, d.departmentname, d.location  from departmentemployee " +
                    "join public.departmentlocation d on departmentemployee.departmentid = d.departmentid";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.printf("%s %s %s\n",
                        rs.getString("employeename"), rs.getString("departmentname"),
                        rs.getString("location"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            connection.close();
            System.out.println("\nЗакрыл соединение");
        }

    }
}
