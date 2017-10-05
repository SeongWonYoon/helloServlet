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
@WebServlet("/loginServlet") // �� ������̼��� ���ؼ� �� URL �� ������ �ȴٴ°� ������
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  
    // ��ü ����
    // Client -> Thread -> helloServlet -> LoginServlet -> doPost -> Client 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// web.xml ���� Submit �� post �� ����� �ڵ����� ���Եȴ�
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// build HTML code  �� �����  client ���� �ٽ� ������
		// Servlet -> Client
		// Ŭ���̾�Ʈ�� ������ �ϳ� ���������� doPost ��� �����尡 �ϳ��� �����ϴ� ����
		
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
