import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deletedetails {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/fwsa";
		String uname = "root";
		String pass = "";
		String query = "delete from persons where LastName='Dhaya'";
//		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.print(" Rows Deleted");
		con.close();
		st.close();

	}
}