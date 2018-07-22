import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(
    name = "★プールの予定★",
    urlPatterns = {"/hello2"}
)
public class HelloAppEngine3 extends HttpServlet {
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

    response.getWriter().print("★プールの予定★\r\n");
    response.getWriter().println("〜おすすめプール〜\r\n");
    response.getWriter().println("東京サマーランド\r\n");
    response.getWriter().println("豊島園\r\n");
    response.getWriter().println("大磯ロングビーチ\r\n");
    response.getWriter().println("\r\n");
    response.getWriter().println("〜ナイトプール〜\r\n");
    response.getWriter().println("ホテルニューオータニ\r\n");
    response.getWriter().println("グランドニッコー東京\r\n");
    response.getWriter().println("京王プラザホテル\r\n");

  }
  public void paint(Graphics g){
	    
	    Image img;
	    img = getImage("pu-ru.jpg");
	    g.drawImage(img, 0, 0, (ImageObserver) this);
	    
	}


	private Image getImage(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}