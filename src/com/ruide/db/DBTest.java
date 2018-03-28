package com.ruide.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {
	public static void main(String[] args) {
		try {
			//找驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//建连接
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String password="tiger";
			Connection conn=DriverManager.getConnection(url, user, password);
			//建通道
			String sql="insert into dept values(1,1,1)";
			PreparedStatement pst=conn.prepareStatement(sql);
			//执行SQL
			int i=pst.executeUpdate();
			if(i>=0){
				System.out.println("数据库操作成功 ！");
			}else{
				System.out.println("数据库操作失败 ！");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
