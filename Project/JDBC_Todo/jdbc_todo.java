import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class jdbc_todo {
	public static void fetchTodos(Statement st,String TEXT_GREEN,String TEXT_RESET) throws SQLException {
		System.out.println("\033[0;1m"+TEXT_GREEN+"~~~~~~ TODOS LIST ~~~~~~"+TEXT_RESET);
		ResultSet rs= st.executeQuery("select * from todos");

			while(rs.next()) {
				if(!rs.getBoolean(3) == false) {
					System.out.println(rs.getInt(1) +"\t"+rs.getString(2)+"\t"+"[ Completed ]");
				}
				else {
					System.out.println(rs.getInt(1) +"\t"+rs.getString(2));
				}
//			String userData = rs.getInt(1) +"\t"+ rs.getString(2);

//			System.out.println(userData);
			}


	}


	public static int dataCount(Statement st) throws SQLException {
		ResultSet rs = st.executeQuery("Select Count(*) from todos");
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);

		}
		return count;
	}
	public static int maxId(Statement st) throws SQLException {
		ResultSet rs= st.executeQuery("SELECT MAX(Todoid) AS Todoid FROM todos");
		int maxId=0;
		if (rs.next()) {
		  maxId = rs.getInt("Todoid");
		}
		return maxId;
	}
	public static int minId(Statement st) throws SQLException {
		ResultSet rs= st.executeQuery("SELECT MIN(Todoid) AS Todoid FROM todos");
		int minId=0;
		if (rs.next()) {
		  minId = rs.getInt("Todoid");
		}
		return minId;
	}

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		 String TEXT_RESET = "\u001B[0m";
	     String TEXT_RED = "\u001B[31m";
	     String TEXT_GREEN = "\u001B[32m";
	     String TEXT_YELLOW = "\u001B[33m";
	     String TEXT_BLUE = "\u001B[34m";
	     String TEXT_PURPLE = "\u001B[35m";
	     String TEXT_CYAN = "\u001B[36m";

		System.out.println("\033[0;1m"+TEXT_GREEN +"****** Welcome To Todo Manager ******"+TEXT_RESET);
		System.out.println();

		Scanner inputObj = new Scanner(System.in);
		BufferedReader bufferinput = new BufferedReader (new InputStreamReader(System.in));

		System.out.println(TEXT_YELLOW+"Press 1 to See All Todos"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 2 to Add new Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 3 to Delete Your Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 4 to Mark Your Todo as Completed"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 5 to Edit Your Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 6 to See your completed Todo"+TEXT_RESET);
		System.out.println();



		Class.forName("java.sql.DriverManager");
		String url = "jdbc:mysql://localhost:3306/fwsa";
		String uname = "root";
		String pass = "";
//		String query = "INSERT INTO todos (Todo_text, status)"
//				+ "VALUES (?,false);";

		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement st = con.createStatement();
		int count = dataCount(st);






		int maxId = maxId(st);
		int minId = minId(st);


		System.out.print("Enter your option: ");
		int choice = inputObj.nextInt();

		if(choice ==1) {
			if (count<1) {
				System.out.print("there is no todo in you database");
			}
			else {
				fetchTodos(st,TEXT_GREEN,TEXT_RESET);
			}
		}

		else if(choice == 2) {
			System.out.print("Enter Your todo: ");
			String todo = bufferinput.readLine();
			System.out.print(todo);

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO todos (Todo_text, status)"
					+ "VALUES (?,false)");
			pstmt.setString(1, todo);
			pstmt.executeUpdate();
	//		int count= st.executeUpdate(query);
	//		System.out.print(count+ " Rows Affected");
			System.out.print("done");
		}
		else if(choice == 3) {
			if(count <1) {
				System.out.print(TEXT_RED+"There is no Todos in your database."+TEXT_RESET);
			}
			else {
				fetchTodos(st,TEXT_GREEN,TEXT_RESET);
				System.out.print("Which Todo do you want to delete? Type the Todo number: ");
				int deleteTodo = inputObj.nextInt();
				if(minId<=deleteTodo && maxId>=deleteTodo) {
					PreparedStatement pstmt = con.prepareStatement("delete from todos where Todoid= ?");
					pstmt.setInt(1, deleteTodo);
					pstmt.executeUpdate();
					System.out.println("Todo Deleted");
				}
				else {
					System.out.print("Sorry invalid todo number");
				}

			}

		}
		else if(choice ==4) {
			if(count <1) {
				System.out.print(TEXT_RED+"There is no Todos in your database."+TEXT_RESET);
			}
			else {
				fetchTodos(st,TEXT_GREEN,TEXT_RESET);
				System.out.print("Which Todo do you want to Mark as complete? Type the Todo Number: ");
				int markedTodo = inputObj.nextInt();
				if(minId<=markedTodo &&  maxId>=markedTodo) {
					PreparedStatement pstmt = con.prepareStatement("update todos set Status=true where Todoid= ?");
					pstmt.setInt(1, markedTodo);
					pstmt.executeUpdate();
					System.out.println("Todo Mark as Completed");
				}
				else {
					System.out.print("Sorry invalid todo number");
				}

			}

		}
		else if(choice == 5) {
			if(count <1) {
				System.out.print(TEXT_RED+"There is no Todos in your database."+TEXT_RESET);
			}
			else {
				fetchTodos(st,TEXT_GREEN,TEXT_RESET);
				System.out.print("Which Todo do you want to Edit? Type the Todo Number: ");
				int editedTodoNumber = inputObj.nextInt();
				if(minId<= editedTodoNumber && maxId >= editedTodoNumber) {
					System.out.print("Enter Your todo:");
					String addEditedTodo = bufferinput.readLine();

					PreparedStatement pstmt = con.prepareStatement("update todos set Todo_text = ?,Status = false where Todoid= ?");
					pstmt.setString(1, addEditedTodo);
		//			pstmt.setBoolean(2, false);
					pstmt.setInt(2,editedTodoNumber);
					pstmt.executeUpdate();
					System.out.println("Todo Updated");
				}
				else {
					System.out.print("Sorry invalid todo number");
				}

			}
		}
		else if(choice == 6) {
			System.out.println("\033[0;1m"+TEXT_GREEN+"~~~~~~ COMPLETED TODOS LIST ~~~~~~"+TEXT_RESET);
			ResultSet rs= st.executeQuery("select * from todos");
			while(rs.next()) {
				if(rs.getBoolean(3) == true) {
					System.out.println(rs.getInt(1) +"\t"+rs.getString(2)+"\t"+"[ Completed ]");
				}
				else {
					System.out.print("There is no marked todo.");
					break;
				}
//			String userData = rs.getInt(1) +"\t"+ rs.getString(2);

//			System.out.println(userData);
			}
		}
		else {
			System.out.println(TEXT_RED+"Sorry you entered invalid input"+TEXT_RESET);
		}

		con.close();
		st.close();
	}


}
