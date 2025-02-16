package hongduong;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test-request"})
public class ServletRequest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Phuong thuc cua request" + req.getMethod());
		req.getContentType();
		req.getContextPath();
		System.out.println(req.getServerName());
		System.out.println(req.getServletPath());
	}
}
