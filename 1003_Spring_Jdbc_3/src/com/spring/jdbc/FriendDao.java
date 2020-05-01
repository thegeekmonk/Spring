package com.spring.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class FriendDao
{
    private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
    
    
	public Boolean saveFriend(Friend f)
	{
		String query = "insert into friend values(?,?,?)";
		
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>()
				{
			       @Override
			       public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException
			       {
			    	   
			    	   ps.setInt(1,f.getId());
			    	   ps.setString(2,f.getName());
			    	   ps.setInt(3,f.getAge());
			    	   
			    	   return ps.execute();
			    	   
			       }
						
			
				});
				
		
	}
	

}
