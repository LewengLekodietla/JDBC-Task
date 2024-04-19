/**
 * @author sirlewengmakgopa
 * @version 19 April 2024
 * */
package JDBCAssessment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	/** 
	 * Main method
	 * @param args for main method
	 * @throws SQLException for incorrect SQL syntax
	 * */
	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/PoisePMS?useSSL=false",
					"root",
					"Kod1etla@1958"
					);
			System.out.println("Connection to database: successful");

			Statement statement = connection.createStatement();
			ResultSet resultSet;
			int rowsAffected;
			//Scanner class to help store user's input that'll be inserted into the DB program
			Scanner userInput = new Scanner (System.in);

			//Prompt information about new projects to be added later into the PoisePMS database.
			System.out.println("To capture new project details, please enter (separating each value using a comma): "
					+ "\nThe project number, "
					+ "\nThe project name, "
					+ "\nThe fee charged for the project, "
					+ "\nThe amount paid to date by the customer, "
					+ "\nThe project deadline? (format: YYYY-MM-DD), "
					+ "\nThe name of the assigned architect, "
					+ "\nThe name of the assigned contractor, "
					+ "\nThe name of the customer, "
					+ "\nThe status of the project?"
					);
			//Store the user's prompted input 
			String projectDetailsCombined = userInput.nextLine();
			//Split the project details and store as an array
			String[] initialProjectList = projectDetailsCombined.split(", ");

			//Initialise and create a new Project object using the array details above
			Project newProjectOne = new Project();
			newProjectOne.setProjectNumber(initialProjectList[0]);
			newProjectOne.setProjectName(initialProjectList[1]);
			newProjectOne.setTotalProjectFeeCharge(Integer.parseInt(initialProjectList[2]));
			newProjectOne.setTotalAmountPaidToDate(Integer.parseInt(initialProjectList[3]));
			newProjectOne.setProjectDeadline(LocalDate.parse(initialProjectList[4]));
			newProjectOne.setArchitectName(initialProjectList[5]);
			newProjectOne.setContractorName(initialProjectList[6]);
			newProjectOne.setCustomerName(initialProjectList[7]);
			newProjectOne.setProjectStatus(initialProjectList[8]);

			//Insert each project property as a field in the project table
			insertProjectIntoTable(statement, newProjectOne);

			//Prompt user to continue entering more project details until they indicate they no longer want to continue
			Scanner additionalUserInput = new Scanner (System.in);
			System.out.println("Do you want to proceed to entering another project's details, enter 'Yes' to continue or 'No' to stop?");
			String continueIndication = additionalUserInput.nextLine();


			while(!continueIndication.equalsIgnoreCase("No")) {
				//re-initialise the scanner class to enable storing user input within this control statement	
				userInput = new Scanner (System.in);

				//Prompt information about new projects to be added later into the PoisePMS database.
				System.out.println("To capture new project details, please enter (separating each value using a comma): "
						+ "\nThe project number, "
						+ "\nThe project name, "
						+ "\nThe fee charged for the project, "
						+ "\nThe amount paid to date by the customer, "
						+ "\nThe project deadline? (format: YYYY-MM-DD), "
						+ "\nThe name of the assigned architect, "
						+ "\nThe name of the assigned contractor, "
						+ "\nThe name of the customer, "
						+ "\nThe status of the project?"
						);
				//Store the user's prompted input 
				String moreProjectDetails = userInput.nextLine();
				//Split the project details and store as an array
				String[] subsequentProject = moreProjectDetails.split(", ");

				//Initialise and create a new Project object using the array details above
				Project projectAnother = new Project(); 
				projectAnother.setProjectNumber(subsequentProject[0]);
				projectAnother.setProjectName(subsequentProject[1]);
				projectAnother.setTotalProjectFeeCharge(Integer.parseInt(subsequentProject[2]));
				projectAnother.setTotalAmountPaidToDate(Integer.parseInt(subsequentProject[3]));
				projectAnother.setProjectDeadline(LocalDate.parse(subsequentProject[4]));
				projectAnother.setArchitectName(subsequentProject[5]);
				projectAnother.setContractorName(subsequentProject[6]);
				projectAnother.setCustomerName(subsequentProject[7]);
				projectAnother.setProjectStatus(subsequentProject[8]);

				//Insert each project property as a field in the project table
				insertProjectIntoTable(statement, projectAnother);
				//Capture additional project details
				additionalUserInput = new Scanner (System.in);
				System.out.println("Do you want to proceed to entering another project's details, enter 'Yes' to continue or 'No' to stop?");
				continueIndication = additionalUserInput.nextLine();
				//Stop Program
			}
			if(continueIndication.equalsIgnoreCase("No")) {

				System.out.println("You have indicated that you want to stop the program.");
				System.out.println("The following project details have been updated in your database: ");
				System.out.println("---------------Details-----------------");

				//Update existing project details in the project table: lines 125 to 135
				rowsAffected = statement.executeUpdate(

						"UPDATE project SET project_deadline='2028-08-12' WHERE project_number='123'"
						);
				System.out.println("Query Complete, " + rowsAffected + " rows updated.");

				rowsAffected = statement.executeUpdate(

						"UPDATE project SET project_status='Overdue' WHERE project_number='321'"
						);
				System.out.println("Query Complete, " + rowsAffected + " rows updated.");

				//Delete data about projects and people associated with them: Lines 138 to 148
				rowsAffected = statement.executeUpdate(

						"DELETE FROM project WHERE project_number='34ZR'"
						);
				System.out.println("Query Complete, " + rowsAffected + " rows removed.");

				rowsAffected = statement.executeUpdate(

						"DELETE FROM project WHERE project_number='234R'"
						);
				System.out.println("Query Complete, " + rowsAffected + " rows removed.");

				//Finalise existing projects - when finalised the project should be marked as “finalised” and the completion date should be added.
				rowsAffected = statement.executeUpdate(

						"UPDATE project SET project_status='Finalised' WHERE project_number='435Y'"
						);
				System.out.println("Query Complete, " + rowsAffected + " rows updated.");
				//Find all projects that still need to be completed from the database.
				resultSet = statement.executeQuery(

						"SELECT * FROM project WHERE project_status='In Progress'"

						);
				//Loop over returned results
				while(resultSet.next()) {
					System.out.println(resultSet.getString("project_number") + ", " + resultSet.getString("project_name") + ", " + resultSet.getInt("total_project_fee_charge") + ", " 
				+ resultSet.getInt("total_amount_paid_to_date") + ", " + resultSet.getDate("project_deadline") + ", " + resultSet.getString("architect_name") + ", " + resultSet.getString("contractor_name") 
				+ ", " + resultSet.getString("customer_name") + ", " + resultSet.getString("project_status"));
				}
				//Find all projects that are past the due date from the database.
				resultSet = statement.executeQuery(

						"SELECT * FROM project WHERE project_status='Overdue'"

						);
				//Loop over returned results
				while(resultSet.next()) {
					System.out.println(resultSet.getString("project_number") + ", " + resultSet.getString("project_name") + ", " + resultSet.getInt("total_project_fee_charge") + ", " 
				+ resultSet.getInt("total_amount_paid_to_date") + ", " + resultSet.getDate("project_deadline") + ", " + resultSet.getString("architect_name") + ", " + resultSet.getString("contractor_name") 
				+ ", " + resultSet.getString("customer_name") + ", " + resultSet.getString("project_status"));
				}
				//Find and select a project by entering either the project number or project name.
				resultSet = statement.executeQuery(

						"SELECT * FROM project WHERE project_number='435Y'"

						);
				//Loop over returned results
				while(resultSet.next()) {
					System.out.println(resultSet.getString("project_number") + ", " + resultSet.getString("project_name") + ", " + resultSet.getInt("total_project_fee_charge") + ", " 
				+ resultSet.getInt("total_amount_paid_to_date") + ", " + resultSet.getDate("project_deadline") + ", " + resultSet.getString("architect_name") + ", " + resultSet.getString("contractor_name") 
				+ ", " + resultSet.getString("customer_name") + ", " + resultSet.getString("project_status"));
				}
				resultSet.close();
			}
			userInput.close();
			statement.close();
			additionalUserInput.close();
		} catch (SQLException e) {
			// Catch a SQLException only.
			e.printStackTrace();
		}
	}
	/**
	 * @param Statement  and Project objects as args
	 * */
	//Method created to insert project details into table
	public static void insertProjectIntoTable(Statement statement, Project project) {

		int rowsAffected;
		try {
			rowsAffected = statement.executeUpdate("INSERT INTO project VALUES('"+project.getProjectNumber()+"', '"+project.getProjectName()+"', '"+project.getTotalProjectFeeCharge()+"', "
					+ "'"+project.getTotalAmountPaidToDate()+"', '"+project.getProjectDeadline()+"', '"+project.getArchitectName()+"', '"+project.getContractorName()+"', "
					+ "'"+project.getCustomerName()+"', '"+project.getProjectStatus()+"')");
			System.out.println("Query Complete, " + rowsAffected + " rows added.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
