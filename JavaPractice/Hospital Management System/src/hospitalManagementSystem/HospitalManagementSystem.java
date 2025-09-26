package hospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalManagementSystem {
		private static final String url="jdbc:mysql://localhost:3306/hospital";
		private static final String username="root";
		private static final String password="root";
	    public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Scanner scanner=new Scanner(System.in);
		try {
			Connection connection =DriverManager.getConnection(url,username,password);
			Patient patient=new Patient(connection,scanner);
			Doctor doctor=new Doctor(connection);
			while(true) {
				System.out.println("HOSPITAL MANAGEMENT SYSTEM");
				System.out.println("1.Add patient");
				System.out.println("2.View patients");
				System.out.println("3.View doctors");
				System.out.println("4.Book appointments");
				System.out.println("5.Exit");
				System.out.println("Enter your choice : ");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:
					patient.addPatient();
					System.out.println();
					break;
				case 2:
					patient.viewPatients();
					System.out.println();
					break;
				case 3:
					doctor.viewDoctors();
					System.out.println();
					break;
				case 4:
					bookAppointment(patient,doctor,connection,scanner);
					System.out.println();
					break;
				case 5:
					return;
					
					default : System.out.println("Enter valid choice !!!");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    }
		public static void bookAppointment(Patient patient,Doctor doctor,Connection connection,Scanner scanner) {
			System.out.print("Enter patient id :");
			int patientId=scanner.nextInt();
			System.out.print("Enter doctor id : ");
			int doctorId=scanner.nextInt();
			System.out.print("Enter appointment date (YYYY-MM-DD): ");
			String appointment=scanner.next();
		
		if(patient.getPatientById(patientId) && doctor.getDoctorById(doctorId)){
			if(checkDoctorAvailability(doctorId,appointment,connection)) {
				String appointmentQuery="insert into appointment(patient_id,doctor_id,appointment_date)values(?,?,?)";
				try {
					PreparedStatement preparedStatement=connection.prepareStatement(appointmentQuery);
					preparedStatement.setInt(1,patientId);
					preparedStatement.setInt(2,doctorId);
					preparedStatement.setString(3,appointment);
					int rowsAffected=preparedStatement.executeUpdate();
					if(rowsAffected>0)
					{
						System.out.println("Appointment booked");
					}
					else 
					{
						System.out.println("failed to book appointment");
					}
				}
				catch(SQLException e) 
				{
						e.printStackTrace();
				}
				
			else  {
				System.out.println("Doctor not available on this date!!!");
			}
			else {
				System.out.println("Either doctor or patient does not exist!!!");
			}
		}
		}
		
		

		public static  boolean checkDoctorAvailability(int doctorId,String appointmentDate,Connection connection) {
			String Query ="select count(*) from appoints where doctor_id=? and appointment_date=?";
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(Query);
				preparedStatement.setInt(1, doctorId);
				preparedStatement.setString(2,appointmentDate);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()) {
					int count=resultSet.getInt(1);
					return true;
				}
				else {
					return false;
				}
			}
		
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return false;
		}
		}




