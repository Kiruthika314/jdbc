package jdbc;

import java.sql.*;

public class BusDAO {
	
	public void display() throws Exception {
		String que="Select * from bus";
		Connection con=Connectio.getConnect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(que);
		while(rs.next()) {
			System.out.println("Bus No. : "+rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC : No");
			else
				System.out.println("AC : Yes");
			System.out.println("Capacity : "+rs.getInt(3));
			System.out.println();
		}
		System.out.println("_________________________________________________________________");
		
		
		con.close();
	}

	public int getCapacity(int id) throws Exception {
		// TODO Auto-generated method stub
		String que="Select capacity from bus where busNo="+id;
		Connection con=Connectio.getConnect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(que);
		rs.next();

		return rs.getInt(1) ;
	}

}
