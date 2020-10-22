package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic1;
import model.User1;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser1")
public class RegisterUser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String forwardPath = null;


		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if(action == null){
			forwardPath = "/WEB-INF/jsp/registerForm1.jsp";
		}else if(action.equals("done")){

			HttpSession session = request.getSession();
			User1 user1 = (User1)session.getAttribute("User1");

			RegisterUserLogic1 rul = new RegisterUserLogic1();
			rul.execute(user1);

			session.invalidate();

			forwardPath = "/WEB-INF/jsp/registerDone1.jsp";




		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		User1 user1 = new User1(id,name,pass);

		HttpSession session = request.getSession();

		session.setAttribute("user1", user1);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm1.jsp");
		dispatcher.forward(request, response);

	}

}
