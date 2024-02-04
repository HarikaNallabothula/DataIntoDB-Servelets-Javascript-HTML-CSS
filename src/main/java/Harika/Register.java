package Harika;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get printwriter
		//PrintWriter pw=response.getWriter();
		//set content type
		//response.setContentType("text/html");
		int equip_id=Integer.valueOf( request.getParameter("equip_id"));
		String type=request.getParameter("type");
		String color=request.getParameter("color");
		String location= request.getParameter("location");
		Object install_date= request.getParameter("install_date");
		
		Registerbean registerbean=new Registerbean(equip_id, type, color, location, install_date);
		RegisteringDao rdo=new RegisteringDao();
	     String result=rdo.insert(registerbean);
		response.getWriter().print(result);
		/* Connection con=null;
			con=HelperClass.putConnection();
			String result="DATA ENTERED SUCCESSFULLY IN TO DATABASE...";
			String Insert_Query="insert into playground values(?,?,?,?,?) ";
			PreparedStatement pst;
			try {
			pst=con.prepareStatement(Insert_Query);
			pst.setInt(1, Integer.valueOf(equip_id));
			pst.setString(2, type);
			pst.setString(3, color);
			pst.setString(4, location);
			pst.setDate(5, (java.sql.Date) install_date);
			int count=pst.executeUpdate();
			if(count==0)
			{ System.out.println(".......................RECORD NOT INSERTED INTO DB.........................");}
			else {System.out.println("......................RECORD INSERTED INTO DB............................");}
		}
			catch(Exception e) {e.printStackTrace();}
	}*/

}
}