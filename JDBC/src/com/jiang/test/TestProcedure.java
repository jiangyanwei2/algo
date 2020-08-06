package com.jiang.test;

import java.sql.SQLException;
import java.util.List;

import com.jiang.dao.ProcedureDao;
import com.jiang.model.Goddess;

public class TestProcedure {
	public static void main(String[] args) throws SQLException {
		ProcedureDao pdao = new ProcedureDao();
		
		Integer count = 0;
		count =pdao.select_count();
		System.out.println(count);
		//pdao.select_nofilter();
		/*String sp_name = "";
		List<Goddess> result = pdao.select_filter(sp_name);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId()+":"+result.get(i).getUser_name()
					+result.get(i).getMobile());
		*/	
		}
		
	}

