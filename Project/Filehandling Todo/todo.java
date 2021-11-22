import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class todo {
	public static String printAllTodos(File fileobj,String TEXT_BLUE,String TEXT_RESET,String TEXT_GREEN,String TEXT_RED) throws FileNotFoundException {
		Scanner reader;
		reader = new Scanner(fileobj);
		System.out.println("\033[0;1m"+TEXT_GREEN+"~~~~~~ TODOS LIST ~~~~~~"+TEXT_RESET);
		if(!reader.hasNextLine()) {
// 			System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
            // return TEXT_RED+""+"There is no Todos in your file."+""+TEXT_RESET;
            return "nothing";
		}
		else{
		    String test="";
    		int count = 1;
    		while(reader.hasNextLine()) {
    			String data = reader.nextLine();
    			test=test+ TEXT_BLUE+"["+ count++ +"]" +"\t"+data+TEXT_RESET+"\n";
    		}
    		return test;
        }
	}
	public static void todoWriter(List<String> pendingTodoFileTotalLines) throws IOException {
		int i=0;
		FileWriter writeobj = new FileWriter("todo.txt");
		for(;i<pendingTodoFileTotalLines.size();i++) {
			writeobj.write(pendingTodoFileTotalLines.get(i)+""+System.getProperty("line.separator"));
		}
		writeobj.close();
	}
	public static void main(String[] args) throws IOException {
		 String TEXT_RESET = "\u001B[0m";
	     String TEXT_RED = "\u001B[31m";
	     String TEXT_GREEN = "\u001B[32m";
	     String TEXT_YELLOW = "\u001B[33m";
	     String TEXT_BLUE = "\u001B[34m";
	     String TEXT_PURPLE = "\u001B[35m";
	     String TEXT_CYAN = "\u001B[36m";

		System.out.println("\033[0;1m"+TEXT_GREEN +"****** Welcome To Todo Manager ******"+TEXT_RESET);
		System.out.println();
		System.out.println(TEXT_YELLOW+"Press 1 to See All Todos"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 2 to Add new Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 3 to Delete Your Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 4 to Mark Your Todo as Completed"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 5 to Edit Your Todo"+TEXT_RESET);
		System.out.println(TEXT_YELLOW+"Press 6 to See your completed Todo"+TEXT_RESET);
		System.out.println("\033[0;1m"+TEXT_RED+"------ ENTER 0 TO EXIT ------"+TEXT_RESET);
		System.out.println();


		Scanner todoinput = new Scanner(System.in);

		File fileobj = new File("todo.txt");
		File completedTodoFile = new File("completedTodo.txt");

		if(fileobj.createNewFile()) {
			System.out.println(TEXT_GREEN+"File is created: "+fileobj.getName()+TEXT_RESET);
		}
	    if(completedTodoFile.createNewFile()) {
	      System.out.println(TEXT_GREEN+"File is created: "+completedTodoFile.getName()+TEXT_RESET);
	    }
    	System.out.println();

		System.out.print("Enter your option: ");
		List<String> pendingTodoFileTotalLines = Files.readAllLines(Paths.get("todo.txt"));
		List<String> completedTodoLines = Files.readAllLines(Paths.get("completedTodo.txt"));
		BufferedReader bufferinput = new BufferedReader (new InputStreamReader(System.in));
		int choice = todoinput.nextInt();
		System.out.println();
		if(choice==0){
			return;
		}
		if(choice == 1) {
		    String listoftodos = printAllTodos(fileobj,TEXT_BLUE,TEXT_RESET,TEXT_GREEN,TEXT_RED);
		    if (listoftodos == "nothing"){
          System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
		    }
		    else{
		        System.out.println(listoftodos);
		    }
			System.out.println();
		}
		else if(choice == 2) {
			System.out.print("Enter your Todo:");
			String addNewTodo;
			addNewTodo = bufferinput.readLine();
			System.out.println("\033[0;1m"+TEXT_RED+"------ ENTER 0 TO EXIT ------"+TEXT_RESET);

			while(!addNewTodo.equals("0")) {
				pendingTodoFileTotalLines.add(addNewTodo);
				System.out.print("Enter your Next Todo:");
				addNewTodo = bufferinput.readLine();
			}
			// Collections.reverse(pendingTodoFileTotalLines);
			todoWriter(pendingTodoFileTotalLines);
			System.out.println();
		}
		else if(choice ==3) {
			String listoftodos = printAllTodos(fileobj,TEXT_BLUE,TEXT_RESET,TEXT_GREEN,TEXT_RED);
			if(listoftodos=="nothing"){
			   	System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
			    return;
			}
			else {
			    System.out.print(listoftodos);
			System.out.print("Which Todo do you want to delete? Type the Todo number: ");
			int deleteTodo = todoinput.nextInt();

			if(deleteTodo<=0 || pendingTodoFileTotalLines.size()<deleteTodo ) {
				System.out.print(TEXT_RED+"Sorry Invaild Input"+TEXT_RESET);
				return;
			}

			pendingTodoFileTotalLines.remove(deleteTodo-1);
			todoWriter(pendingTodoFileTotalLines);

			}
			System.out.println();
		}
		else if(choice == 4) {

      System.out.println();
		    String listoftodos = printAllTodos(fileobj,TEXT_BLUE,TEXT_RESET,TEXT_GREEN,TEXT_RED);
			if(listoftodos=="nothing"){
			   	System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
			    return;
			}
			else {
			    System.out.print(listoftodos);
				System.out.print("Which Todo do you want to Mark as complete? Type the Todo Number: ");
				int completedTodo = todoinput.nextInt();


				if(completedTodo<=0 || pendingTodoFileTotalLines.size()<completedTodo ) {
					System.out.print(TEXT_RED+"Sorry Invaild Input"+TEXT_RESET);
					return;
				}

				completedTodoLines.add(pendingTodoFileTotalLines.get(completedTodo-1));
				FileWriter writeobj2 = new FileWriter("completedTodo.txt");
				for(int i=0;i<completedTodoLines.size();i++) {
					writeobj2.write(completedTodoLines.get(i)+""+System.getProperty("line.separator"));
				}
				writeobj2.close();
				pendingTodoFileTotalLines.remove(completedTodo-1);
				todoWriter(pendingTodoFileTotalLines);
				}
			System.out.println();
		}
		else if(choice == 5) {
		    String listoftodos = printAllTodos(fileobj,TEXT_BLUE,TEXT_RESET,TEXT_GREEN,TEXT_RED);
			if(listoftodos=="nothing"){
			   	System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
			    return;
			}
			else {
			    System.out.print(listoftodos);
			System.out.print("Which Todo do you want Edit? Type the Todo Number: ");
			int editTodo = todoinput.nextInt();
			if(editTodo<=0 || pendingTodoFileTotalLines.size()<editTodo ) {
				System.out.print(TEXT_RED+"Sorry Invaild Input"+TEXT_RESET);
				return;
			}
			System.out.print("Enter Your todo:");
			String addEditedTodo = bufferinput.readLine();
			pendingTodoFileTotalLines.set(editTodo-1,addEditedTodo);
			todoWriter(pendingTodoFileTotalLines);

			}
			System.out.println();
		}
		else if(choice == 6) {
			Scanner reader;
			reader = new Scanner(completedTodoFile);
			System.out.println("\033[0;1m"+TEXT_GREEN+"~~~~~~ COMPLETED TODOS LIST ~~~~~~"+TEXT_RESET);
			if(!reader.hasNextLine()) {
	 			System.out.print(TEXT_RED+"There is no Todos in your file."+TEXT_RESET);
			}
			else {
				int count = 1;
	    		while(reader.hasNextLine()) {
	    			String data = reader.nextLine();
	    			System.out.println(TEXT_RED+"["+ count++ +"]" +"\t"+data+TEXT_RESET);
	    		}
			}
		}
		else{
			System.out.println(TEXT_RED+"Sorry invalid input."+TEXT_RESET);
			System.out.println();
		}
	}
}
