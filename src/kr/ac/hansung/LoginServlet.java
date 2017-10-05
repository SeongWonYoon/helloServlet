package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet") // 이 어노테이션을 통해서 이 URL 에 맵핑이 된다는걸 보여줌
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  
    // 전체 동작
    // Client -> Thread -> helloServlet -> LoginServlet -> doPost -> Client 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// web.xml 에서 Submit 한 post 는 여기로 자동으로 오게된다
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// build HTML code  이 결과를  client 한테 다시 날린다
		// Servlet -> Client
		// 클라이언트가 정보를 하나 보낼때마다 doPost 라는 쓰레드가 하나씩 동작하는 원리
		
		PrintWriter out = response.getWriter();
		String htmlResponse;
		htmlResponse = "<html>";
		htmlResponse += "<h2> your name is " + username + "<br/>";
		htmlResponse += "your password is " + password + "</h2>";
		htmlResponse += "<br/>";
		htmlResponse += "</html>";
		out.println(htmlResponse);
	}


}
