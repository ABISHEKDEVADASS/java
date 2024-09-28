
import java.sql.*;



public class jdbcDemo {
    public static void main(String[] args) throws SQLException {
    String url="jdbc:mysql://127.0.0.1:3306/jdbc";
    String user="root";
    String password="@Ph9843904979";
    String query="select * from employee";
    Connection con=DriverManager.getConnection(url, user, password);
    Statement st= con.createStatement();
    ResultSet rs=st.executeQuery(query);

    rs.next();
    System.out.println("id :"+rs.getInt(1));
    System.out.println("Name :"+rs.getString(2));
    System.out.println("Salary is "+rs.getInt(3));
    con.close();
}
}

    