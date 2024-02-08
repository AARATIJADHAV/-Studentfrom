package from;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;




	public class StudentRegistration {
   public	StudentRegistration() {
		
	System.out.println("\n\t-------------*WELCOME TO MUDHOGI COLLAGE PHALTAN😍📝📝🎓*--------");
	}
	    public static void main(String[] args) throws Exception {
	    	{
	    		StudentRegistration sr=new StudentRegistration();
                //new StudentRegistration();
                sr.Insert();
		    	//System.out.println("submited");

		    }
	    	
	        // Create a Scanner object
	        Scanner scanner = new Scanner(System.in);

	
	    }
	    public void Insert() throws Exception  {

	    	
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegisister", "root", "root");

	    	Scanner ss=new Scanner (System.in);	
	    	PreparedStatement s=con.prepareStatement("insert into StudentInformation values(?,?,?,?)");
	    	
	    	 System.out.println("\n\t\t  enter id:  ");
	    	  s.setInt(1, ss.nextInt());
			 System.out.println("\n\t\t enter name:  ");
			 s.setString(2, ss.next());
	    	 System.out.println("\n\t\tenter age:  ");
	    	 s.setInt(3, ss.nextInt());
	    	 System.out.println("\n\t\tenter address: ");
	    	 s.setString(4, ss.next());
	        
	    	

	    System.out.println("\n\t\t\t\t---------------------------ThankYou------------------------");
        System.out.println("\t\t\t\t----------------------Your addmission Confirom--------");
   	

	    	
	    	s.executeUpdate();

	    	
	    }

	    }
	


