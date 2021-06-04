package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.bean.User;

public class UserDao {

	public int saveUser(User user) {
		Connection conn = DBConnection.getConnection();
		int rows = 0;
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into users values(?,?,?)");
			stmt.setInt(1, user.getId());
			stmt.setString(2, user.getName());
			stmt.setString(3, user.getEmail());
			rows = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rows;
	}

}
