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
    name = "★海の予定★",
    urlPatterns = {"/hello1"}
)
public class HelloAppEngine2 extends HttpServlet {
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

    response.getWriter().print("★海の予定★\r\n");
    response.getWriter().println("〜関東の海の名所〜\r\n");
    response.getWriter().println("江ノ島/神奈川県\r\n");
    response.getWriter().println("城ヶ島/神奈川県\r\n");
    response.getWriter().println("白浜海岸/千葉県\r\n");
    response.getWriter().println("野島崎/千葉県\r\n");
    response.getWriter().println("大洗海岸/茨城県\r\n");
    response.getWriter().println("三ツ石/神奈川県\r\n");

  }
  public void paint(Graphics g){
	    
	    Image img;
	    img = getImage("umi.jpg");
	    g.drawImage(img, 0, 0, (ImageObserver) this);
	    
	}


	private Image getImage(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}