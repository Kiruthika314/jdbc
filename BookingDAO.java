package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Date;

public class BookingDAO {

	public int getBookedCount(int i, Date j) throws Exception {
		String que="Select count(pass_name) from booking where busNo=? and bdate=?";
		Connection con=Connectio.getConnect();
		PreparedStatement st=con.prepareStatement(que);
		st.setInt(1,i);
		java.sql.Date da=new java.sql.Date(j.getTime());
		st.setDate(2, da);
		ResultSet rs=st.executeQuery();
		rs.next();
		// TODO Auto-generated method stub
		return rs.getInt(1);
	}

	public void add(Booking booking) throws Exception {
		String que="insert into booking values(?,?,?)";
		Connection con=Connectio.getConnect();
		PreparedStatement st=con.prepareStatement(que);
		st.setString(1, booking.name);
		st.setInt(2, booking.busNo);
		java.sql.Date d=new java.sql.Date(booking.date.getTime());
		st.setDate(3,d);
		st.executeUpdate();
		
		// TODO Auto-generated method stub
		
	}

}
