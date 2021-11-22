import java.sql.*;
public class fetchDetails {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/fwsa";
		String uname = "root";
		String pass = "";
//		String query = "select LastName from persons where FirstName='D'";
		String query = "select * from persons";
//		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next()) {
		String userData = rs.getInt(1) +" "+ rs.getString(2);
		System.out.println(userData);
		}
		con.close();
		st.close();
		
	}

}
