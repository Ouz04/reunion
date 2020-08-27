package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class FacadeServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO ud;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ud = new UserDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*
		 * récupérer les données de la requête
		 */
		String userName = request.getParameter("username");

		String password = request.getParameter("password");

		/*
		 * validation des données
		 */

		if ((userName == null || password == null) || userName.equals("") || password.equals(""))

		{
			

			request.setAttribute("msgError", "Required Fields");
			request.getRequestDispatcher("index.jsp").forward(request, response);

		} else {
			System.out.println(" values ok");

			/*
			 * stocker les données dans le modèle
			 */
			User u = new User();
			u.setUsername(userName);
			u.setPassword(password);
			/*
			 * effetuer le traitement
			 */
			User us = ud.find(userName, password);

			/*
			 * stocker le resultat dans le modèle
			 */
			u.setEmp(us.getEmp());
			/*
			 * stocker le modèle dans la session
			 */

			HttpSession session = request.getSession(true);

			session.setAttribute("user", u);
			/*
			 * faire la redirection vers la vue JSP
			 */
			//request.getRequestDispatcher("welcome.jsp").forward(request, response);
			response.sendRedirect("welcome.jsp");
		}
	}

}
