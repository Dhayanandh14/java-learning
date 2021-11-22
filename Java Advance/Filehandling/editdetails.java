import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class editdetails {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/fwsa";
		String uname = "root";
		String pass = "";
		String query = "update persons set LastName='Dhayanandh' where PersonId=1";
		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.print("Edited");
		con.close();
		st.close();

	}
}