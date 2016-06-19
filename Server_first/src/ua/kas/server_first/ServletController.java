package ua.kas.server_first;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonBeanModel person = new PersonBeanModel();
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String r_password = request.getParameter("r_password");
		person.setName(name);
		person.setPassword(password);
		person.setR_password(r_password);
		person.setEmail(request.getParameter("email"));
		person.doSomething();
		request.setAttribute("person", person);
		
		if((password!=null)&& (password.equals(r_password))){
			getServletContext().getRequestDispatcher("/jspView_enter.jsp").forward(request,response);
		}
		else{
			getServletContext().getRequestDispatcher("/jspView.jsp").forward(request, response);
		}
		
//		Connection conn;
//		ResultSet myRs = null;
//		java.sql.PreparedStatement myStmt;
//		
//		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freemove", "root", "root");
//			myStmt = conn.prepareStatement("select * from users where user_name=? and password=?");
//			myStmt.setString(0, name);
//			myStmt.setString(1, password);
//			myRs = myStmt.executeQuery();
//				
//			while(myRs.next()){
//				getServletContext().getRequestDispatcher("/jspView_enter.jsp").forward(request,response);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("dddd");
//			getServletContext().getRequestDispatcher("/jspView.jsp").forward(request, response);
//		}
		
	}
}
