package Harika;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisteringDao {
public String insert(Registerbean<java.sql.Date> registerbean) {
    Connection con=null;
	con=HelperClass.putConnection();
	String result=".............................DATA INSERTED SUCCESSFULLY IN TO DATABASE................................";
	String Insert_Query="insert into playground values(?,?,?,?,?) ";
	PreparedStatement pst;
	try {
	pst=con.prepareStatement(Insert_Query);
	pst.setInt(1, Integer.valueOf(registerbean.getEquip_id()));
	pst.setString(2,  registerbean.getType());
	pst.setString(3, registerbean.getColor());
	pst.setString(4, registerbean.getLocation());
	pst.setDate(5, Date.valueOf(registerbean.getInstall_date()));
	pst.executeUpdate();
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
		result="...............................DATA NOT ENTERED IN TO DATABASE............................";}
	return result;
	}
}
