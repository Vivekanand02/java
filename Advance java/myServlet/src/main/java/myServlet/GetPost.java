package myServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class GetPost extends HttpServlet{
	@Override
      protected void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
    	String myEmail=(String)request.getParameter("email"); 
    	String myPass=(String)request.getParameter("password");  
		System.out.println("I am in service method");
      }
}
