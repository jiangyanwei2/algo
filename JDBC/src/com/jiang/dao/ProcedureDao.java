package com.jiang.dao;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.jiang.db.DBUtil;
import com.jiang.model.Goddess;

public class ProcedureDao {
	public static void select_nofilter() throws SQLException {
		Connection con = DBUtil.getConnection();
		CallableStatement cs = con.prepareCall("call sp_select_nofilter()");
	    cs.execute();
	    ResultSet rs = cs.getResultSet();
	    while(rs.next())
	    {
	    	System.out.println(rs.getString("user_name")+rs.getString("email")+rs.getString("mobile"));
	    }
	}
	
	public static List<Goddess> select_filter(String sp_name) throws SQLException{
		List<Goddess> result=new ArrayList<>();
		Connection con = DBUtil.getConnection();
		CallableStatement cs = con.prepareCall("call sp_select_filter(?)");
	    cs.setString(1, sp_name);
		cs.execute();
	    ResultSet rs = cs.getResultSet();
	    while(rs.next())
	    {
	    	Goddess g = new Goddess();
	    	g.setId(rs.getInt("id"));
	    	g.setUser_name(rs.getString("user_name"));
	    	g.setAge(rs.getInt("age"));
	    	g.setMobile(rs.getString("mobile"));
	    	result.add(g);
	    }
		return result;
	}
	
	public static Integer select_count() throws SQLException {
		Integer count = 0;
		Connection con = DBUtil.getConnection();
		CallableStatement cs = con.prepareCall("call sp_select_count(?)");
	    cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		count = cs.getInt(1);
		return count;
	}
	
}
