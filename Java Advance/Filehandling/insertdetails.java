
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdetails {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/fwsa";
		String uname = "root";
		String pass = "";
		String query = "INSERT INTO persons (personID, LastName, FirstName, Address)"
				+ "VALUES (2,'Ajith','U','Tharamani');";
//		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement st = con.createStatement();
		int count= st.executeUpdate(query);
		System.out.print(count+ " Rows Affected");
		con.close();
		st.close();

	}

}

