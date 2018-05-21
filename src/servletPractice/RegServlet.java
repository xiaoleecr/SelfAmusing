package servletPractice;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;

public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		User user = new User();
		String username = req.getParameter("username");
		String mypassword = req.getParameter("mypassword");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String introduce = req.getParameter("introduce");
		String[] favorites = req.getParameterValues("favorite");
		Date birthday = new Date();
		try {
			birthday = sdf.parse(req.getParameter("birthday"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isAccept;
		if(req.getParameter("isAccept") != null){
			isAccept = true;
		}else{
			isAccept = false;
		}
		
		user.setUsername(username);
		user.setMypassword(mypassword);
		user.setEmail(email);
		user.setGender(gender);
		user.setIntroduce(introduce);
		user.setBirthday(birthday);
		user.setFavorites(favorites);
		user.setAcceptState(isAccept);
		req.getSession().setAttribute("regUser", user);
		RequestDispatcher rd = req.getRequestDispatcher("/reg.jsp");
		rd.forward(req, resp);
	}
}
