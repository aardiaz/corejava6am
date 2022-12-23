package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(url,username,psw)
		Connection dbObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb6am", "root", "");
		
		
		//=========================== insert sql =============================================
			//		String sql = "insert into  user(username,password)values('hhh','pppp') ";
			//		Statement  stm = dbObject.createStatement();
			//		stm.execute(sql);
			//		
			//		dbObject.close();
			//		System.out.println("added success");
		
     //==================================== select sql ==========================================
					  //1. write sql
					   // String sql = "select * from user where username= 'admin' and password = 'admin'  ";
		
		           //search sql 
					//	String sql = "select * from user  where username like  '%m%'  order by username desc ";
		   
				 //count sql
						String  sql = "SELECT COUNT(id) AS total_user FROM USER WHERE username LIKE  '%t%' ";
						
					  //2. create statement
					    Statement  stm = dbObject.createStatement();
					  //3. execute sql(for write sql)/executeQuery sql (for read sql)
					  ResultSet  rs = stm.executeQuery(sql);
					  rs.next();
					  
					  System.out.println("Total User = "+rs.getInt("total_user"));
					  
//						  while(rs.next()) {
//							  //|id|username|password|
//							  System.out.println("Id = "+rs.getInt("id"));
//							  System.out.println("UserName = "+rs.getString("username"));
//							  System.out.println("Passwod = "+rs.getString("password"));
//							  System.out.println("===================");
//						  }
					  //4. db close
					  dbObject.close();
		  
	//======================================== update sql ========================================
		  
			//		   String newPsw = "TTTTT345";
			//		   int uid = 3;
			//
			//		  String sql = "update user  set password = '"+newPsw+"' where id =  '"+uid+"' ";
			//		  Statement stm = dbObject.createStatement();
			//		    stm.execute(sql);
			//		    
			//		    dbObject.close();
			//		  System.out.println("update success");
		  
   		  
   //======================================= delete sql =======================================
			//		String sql = "delete from user where id = 2 ";
			//		Statement stm = dbObject.createStatement();
			//		stm.execute(sql);
 
		
	}

}
