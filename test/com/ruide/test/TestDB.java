package com.ruide.test;

import org.junit.Test;

import com.ruide.db.DBManager;

public class TestDB {
	@Test
	public void test(){
		DBManager db=new DBManager();
		String sql="update dept set dname='市场部',loc='济南' where deptno=1";
		int i=db.executeUpdate(sql);
		if(i>=0){
			System.out.println("数据添加成功 ！");
		}else{
			System.out.println("数据添加失败 ！");
		}
	}
}
