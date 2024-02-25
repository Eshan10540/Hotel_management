/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.Model;

import HM.DB.DBConnection;
import HM.Dto.LoginDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class LoginModel {

    public LoginModel() {
    }

   public String adminLogin(LoginDto loginDto) throws ClassNotFoundException, SQLException {
    Connection connection = DBConnection.getInstance().getConnection();
    String sql = "SELECT * FROM admin_table WHERE UserName = ? AND Password = ?";

    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, loginDto.getUserName());
    statement.setString(2, loginDto.getPassword());

    ResultSet resultSet = statement.executeQuery();
    
    if (resultSet.next()) {
        return "Login Success";
    } else {
        return "Login fail";
    }
}

}
