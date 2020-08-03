package routes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mygrocery.*;

@WebServlet("/register")
public class Register extends HttpServlet {
	private User user = new User();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String retype_password = request.getParameter("retype_password");
		boolean notComplete = name.length()==0 || email.length()==0 || password.length()==0;
		if(notComplete) {
			request.setAttribute("message", "Please fill in all information.");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else if(!password.equals(retype_password)){
			request.setAttribute("message", "Password mismatch.");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else {
			user.register(name, email, retype_password);
			response.sendRedirect("/Grocery/grocerylist");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}
}
