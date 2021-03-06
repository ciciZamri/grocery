package routes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mygrocery.MyGroceryList;

@WebServlet("/grocerylist")
public class GroceryList extends HttpServlet {
	private MyGroceryList mylist = new MyGroceryList();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Boolean is_logged_in = false;
		if(session.getAttribute("is_logged_in") != null) {
			is_logged_in = Boolean.parseBoolean((String) session.getAttribute("is_logged_in"));
		}
		if(is_logged_in) {
			String action = (String) request.getParameter("action");
			String user_id = (String) session.getAttribute("user_id");
			System.out.println(user_id);
			if(action.equals("add")) {
				String item_name = request.getParameter("item");
				mylist.addTolist(user_id, item_name);
				System.out.println("add new " + item_name);
			} else if(action.equals("delete")) {
				String item_name = request.getParameter("item");
				mylist.deleteFromList(user_id, item_name);
				System.out.println("delete " + item_name);
			}
			String[][] list = mylist.getMyList(user_id);
			request.setAttribute("items", list);
			request.getRequestDispatcher("grocerylist.jsp").forward(request, response);
		}else{
			response.sendRedirect("/Grocery/login");
		}
		System.out.println(is_logged_in);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item_name = request.getParameter("item_name");
		String notes = request.getParameter("notes");
		String submit_value = request.getParameter("submit_value");
		System.out.println(item_name + notes + submit_value);
		if(submit_value.equals("cancel")) {
			response.sendRedirect("/Grocery/grocerylist?action=view");
		} else {
			HttpSession session = request.getSession(true);
			String user_id = (String) session.getAttribute("user_id");
			mylist.updateList(user_id, item_name, notes);
			String[][] list = mylist.getMyList(user_id);
			request.setAttribute("items", list);
			request.getRequestDispatcher("grocerylist.jsp").forward(request, response);
		}
	}

}
