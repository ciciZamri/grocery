package routes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mygrocery.GroceryItems;

@WebServlet("/item")
public class Item extends HttpServlet {
	private GroceryItems groceryItems = new GroceryItems();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item_name = (String) request.getParameter("item");
		String[] itemdetails = groceryItems.getItemByName(item_name);
		request.setAttribute("item", itemdetails);
		request.getRequestDispatcher("item.jsp").forward(request, response);
	}
}
