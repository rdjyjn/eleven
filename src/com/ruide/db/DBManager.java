package com.ruide.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
	public int executeUpdate(String sql){
		try {
			//找驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//建连接
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String password="tiger";
			Connection conn=DriverManager.getConnection(url, user, password);		
			//建通道
			PreparedStatement pst=conn.prepareStatement(sql);
			//执行SQL
			return pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
		
	}
}
