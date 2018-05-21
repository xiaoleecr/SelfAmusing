package servletPractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet  {

	@Override
	public void destroy() {
		System.out.println("销毁servlet");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getContentType());
		PrintWriter out = resp.getWriter();
//		HttpSession session = req.getSession();
//		req.setAttribute("age", 100);
		out.println(req.getParameter("username"));
		out.println(req.getParameter("mypassword"));
		out.print("ass♂we♂can!");
		out.close();
		req.getRequestDispatcher("/nextServlet01").forward(req, resp);
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "获得servlet信息";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("初始化了");

	}


}
