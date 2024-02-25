/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.Model;

import HM.DB.DBConnection;
import HM.Dto.CustomerDto;
import HM.Dto.ResDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CustomerModel {

    public CustomerModel() {
    }

    public String CustomerSave(CustomerDto customerDto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer VALUES (?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getNIC());
        statement.setString(2, customerDto.getCustName());

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        while (rst.next()) {
            CustomerDto dto = new CustomerDto();
            dto.setNIC(rst.getString("NIC"));
            dto.setCustName(rst.getString("CustomerName"));

            customerDtos.add(dto);

        }
        return customerDtos;
    }

    public CustomerDto searchCustomer(String NIC) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE NIC = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, NIC);

        ResultSet rst = statement.executeQuery();

        CustomerDto dto = null;
        while (rst.next()) {
            dto = new CustomerDto();
            dto.setNIC(rst.getString("NIC"));
            dto.setCustName(rst.getString("CustomerName"));
        }
        return dto;
    }

    public String UpdateCustomer(CustomerDto customerDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET NIC = ?,CustomerName = ? WHERE NIC = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, customerDto.getNIC());
        statement.setString(2, customerDto.getCustName());
        statement.setString(3, customerDto.getNIC());

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public String DeleteCustomer(String custNIC) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM customer WHERE NIC= ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, custNIC);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<ResDto> getAllReservation() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM reservation";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<ResDto> resDtos = new ArrayList<>();

        while (rst.next()) {
            ResDto dto = new ResDto();

            dto.setCustID(rst.getInt("CustID"));
            dto.setCustName(rst.getString("CustName"));
            dto.setR_Type(rst.getString("R_Type"));
            dto.setPackage(rst.getString("Package"));
            dto.setAmount(rst.getInt("Amount"));

            resDtos.add(dto);

        }
        return resDtos;
    }

   public String AddReservation(ResDto resDto) throws ClassNotFoundException, SQLException {
    Connection connection = null;
    PreparedStatement insertStatement = null;
    PreparedStatement selectStatement = null;
    ResultSet resultSet = null;

    
        connection = DBConnection.getInstance().getConnection();
        String insertSql = "INSERT INTO reservation(CustName, R_Type, Package, Amount, Time) VALUES (?, ?, ?, ?, ?)";
        
        // Prepare the insert statement
        insertStatement = connection.prepareStatement(insertSql);
        insertStatement.setString(1, resDto.getCustName());
        insertStatement.setString(2, resDto.getR_Type());
        insertStatement.setString(3, resDto.getPackage());
        insertStatement.setInt(4, resDto.getAmount());
        insertStatement.setString(5, resDto.getTime());

        // Execute the insert statement
        int rowsAffected = insertStatement.executeUpdate();

       if (rowsAffected > 0) {
            return "Success";
        } else {
            return "Fail";
        }
}


    public String updateRes(ResDto resDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = " UPDATE reservation SET CustName = ?, R_Type = ?,Package = ?, Amount = ? WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        System.out.println("resDto.getR_Type()"+resDto.getR_Type());
        System.out.println("resDto.getPackage()"+resDto.getPackage());
        System.out.println("resDto.getAmount()"+resDto.getAmount());
        System.out.println("resDto.getCustID()"+resDto.getCustID());
        
        statement.setString(1, resDto.getCustName());
        statement.setString(2, resDto.getR_Type());
        statement.setString(3, resDto.getPackage());
        statement.setInt(4, resDto.getAmount());
        statement.setInt(5, resDto.getCustID());

        int rowAffected = statement.executeUpdate();

        if ((rowAffected) > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
    

    public ResDto searchRes(String values) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM reservation WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, values);

        ResultSet rst = statement.executeQuery();

        ResDto dto = null;
        while (rst.next()) {
            dto = new ResDto();
            dto.setCustName(rst.getString("CustName"));
            dto.setR_Type(rst.getString("R_Type"));
            dto.setPackage(rst.getString("Package"));
            dto.setTime(rst.getString("Time"));
        }
        return dto;
    }
    
     public String CancelRes(String ID) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM reservation WHERE CustID= ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, ID);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

}
