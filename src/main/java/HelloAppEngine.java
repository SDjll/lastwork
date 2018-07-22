import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(
    name = "★花火の予定★",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  String forwardPath =  null;
	  String action = request.getParameter("action");
	  
	  if(action == null) {
		  forwardPath = "/WEB-INF/lib/yotei.jsp";
	  }
	 
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("★花火の予定★\r\n");
    response.getWriter().println("7/14 久里浜ペリー花火\r\n");
    response.getWriter().println("7/15 横浜スパークリング花火\r\n");
    response.getWriter().println("7/21 足立の花火\r\n");
    response.getWriter().println("7/24 葛飾納涼花火\r\n");
    response.getWriter().println("7/27 幕張ビーチ花火\r\n");
    response.getWriter().println("7/28 隅田川花火\r\n");
    response.getWriter().println("7/29 鴨川納涼花火\r\n");
    response.getWriter().println("8/1 江東花火\r\n");
    response.getWriter().println("8/4 江戸川花火\r\n");
    response.getWriter().println("8/8 館山花火\r\n");
    response.getWriter().println("8/11 熊谷花火\r\n");
    response.getWriter().println("8/15 木更津花火\r\n");
    response.getWriter().println("8/25 流山花火\r\n");  

  }




private Image getImage(String string) {
	// TODO Auto-generated method stub
	return null;
}
}