package routes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mygrocery.GroceryItems;

@WebServlet("/explore")
public class Explore extends HttpServlet {
	private GroceryItems groceryItems = new GroceryItems();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String category = (String) request.getParameter("category");
		String groceryitem = (String) request.getParameter("groceryitem");
		if (groceryitem != null) {
			response.sendRedirect("/Grocery/item?item="+groceryitem);
		} else if (category != null) {
			request.setAttribute("items", groceryItems.getItems(category));
			request.setAttribute("title", "Select item");
			request.setAttribute("section", "groceryitem");
			request.getRequestDispatcher("explore.jsp").forward(request, response);
		} else {
			request.setAttribute("items", getCategories());
			request.setAttribute("title", "Select category");
			request.setAttribute("section", "category");
			request.getRequestDispatcher("explore.jsp").forward(request, response);
		}
		System.out.println(category);
	}

	private String[][] getCategories() {
		String[][] categories = { { "Fruits", "images/placeholder.png" }, { "Vegetables", "images/placeholder.png" },
				{ "Meats", "images/placeholder.png" }, { "Fish", "images/placeholder.png" },
				{ "Herbs", "images/placeholder.png" }, { "Vegetables", "images/placeholder.png" } };
		return categories;
	}
}
