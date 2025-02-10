package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CalenderDAO;
import model.GoodsDAO;
import model.domain.CalenderDTO;
import model.domain.GoodsDTO;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CalenderDAO calenderDAO = new CalenderDAO();
		List<CalenderDTO> upcomingSchedules = calenderDAO.findRecentSchedules();
		request.setAttribute("upcomingSchedules", upcomingSchedules);
		request.getRequestDispatcher("upcomingSchedules.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            float price = Float.parseFloat(request.getParameter("price"));
            int stockQty = Integer.parseInt(request.getParameter("stockQty"));
            GoodsDTO goods = new GoodsDTO(0, 1, name, description, price, stockQty, "공식",
                                          LocalDateTime.now(), LocalDateTime.now());
            GoodsDAO goodsDAO = new GoodsDAO();
            boolean success = goodsDAO.addGoods(goods);
            if (success) {
                response.sendRedirect("goods_form.html");
            } else {
                response.getWriter().write("Failed to add goods");
            }
    }
}