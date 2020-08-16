package routes;

import java.sql.ResultSet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mygrocery.User;

@WebServlet("/login")
public class Login extends HttpServlet {
	private User user = new User();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String[] user_details = user.get(email, password);
		if(user_details[0] == null) {
			System.out.println("not found");
			request.setAttribute("message", "Invalid username or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			for(String str: user_details) {
				System.out.println(str);
			}
			HttpSession session = request.getSession(true);
			session.setAttribute("is_logged_in", "true");
			session.setAttribute("user_id", user_details[0]);
			response.sendRedirect("/Grocery/grocerylist?action=view");
		}
	}
}
