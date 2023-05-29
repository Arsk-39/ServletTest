package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class TextBox
 */
@WebServlet("/jsp/minus")
public class TextBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TextBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		String[] melmaga=request.getParameterValues("melmaga");
		request.setCharacterEncoding("UTF-8");
		
		String name=request.getParameter("name");
		String company=request.getParameter("company");
		String mail=request.getParameter("mail");
		String review=request.getParameter("review");
		String docment=request.getParameter("document");
		
		Page.header(out);
		out.println("<p>"+"名前:"+name+"</p>");
		out.println("<p>"+"会社:"+company+"</p>");
		out.println("<p>"+"メール:"+mail+"</p>");
		out.println("<p>"+"お問い合わせ内容:"+review+"</p>");
		
		out.print("メルマガ申請:");
		if (melmaga!=null) {
			for(String item : melmaga) {
				out.println("「"+item+"」");
			}
			out.println("のメルマガがお送りさせていただきます。<br>");
		}else {
			out.println("メルマガはお送りいたしません。<br>" );
		}
		out.print("<br>資料請求希望:");
		if(docment.equals("Yes")) {
			out.println("この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。");
			out.println("<p><a href=dummy.jsp>ダミー</a></p>");
		}else{
			out.println("");
		}
		Page.footer(out);
	}

}
