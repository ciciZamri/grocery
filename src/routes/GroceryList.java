package routes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/grocerylist")
public class GroceryList extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", "hello");
		String itemName = (String) request.getParameter("add");
		HttpSession session = request.getSession(true);
		String status = (String) session.getAttribute("is_logged_in");
		if(status != null) {
			request.getRequestDispatcher("grocerylist.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		System.out.println(status);
	}

}
