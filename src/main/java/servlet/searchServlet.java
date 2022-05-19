package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Search;
import util.ParamUtil;
/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String ID = request.getParameter("id");
		
		if (ParamUtil.isNullOrEmpty(ID)) {
            // メッセージ設定
            request.setAttribute("msg", "product_idを入力してください  ");

            // 次画面指定
            request.getRequestDispatcher("top.jsp").forward(request, response);
            return;
        }
		
		Search search = new Search();
		//Product product = search.
	}

}
