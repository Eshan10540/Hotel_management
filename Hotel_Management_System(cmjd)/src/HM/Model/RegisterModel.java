/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.Model;

import HM.DB.DBConnection;
import HM.Dto.LoginDto;
import HM.Dto.RegisterDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class RegisterModel {

    public RegisterModel() {
    }
    
     public String save(RegisterDto registerDto) throws ClassNotFoundException,SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO admin_table VALUES (?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, registerDto.getUserName());
        statement.setString(2, registerDto.getPassword());
        
        
        if(statement.executeUpdate() > 0){
            return "Success";
        }else{
            return "Fail";
        }
    }
}
