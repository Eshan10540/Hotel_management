/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.Controller;

import HM.Dto.LoginDto;
import HM.Dto.CustomerDto;
import HM.Dto.RegisterDto;
import HM.Dto.ResDto;
import HM.Model.CustomerModel;
import HM.Model.LoginModel;
import HM.Model.RegisterModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CustomerController {

    private CustomerModel customerModel;

    private RegisterModel registerModel;
    private LoginModel loginModel;

    public CustomerController() {
        registerModel = new RegisterModel();
        loginModel = new LoginModel();
        customerModel = new CustomerModel();
    }

    public String save(RegisterDto registerDto) throws Exception {
        return registerModel.save(registerDto);

    }

    public String adminLogin(LoginDto loginDto) throws Exception {
        return loginModel.adminLogin(loginDto);
    }

    public String CustomerSave(CustomerDto customerDto) throws Exception {
        return customerModel.CustomerSave(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        return customerModel.getAllCustomer();
    }

    public String UpdateCustomer(CustomerDto customerDto) throws Exception {
        return customerModel.UpdateCustomer(customerDto);
    }

    public CustomerDto searchCustomer(String NIC) throws Exception {
        return customerModel.searchCustomer(NIC);
    }

    public String DeleteCustomer(String custNIC) throws Exception {
        return customerModel.DeleteCustomer(custNIC);
    }

    public ArrayList<ResDto> getAllReservation() throws Exception {
        return customerModel.getAllReservation();
    }

    public String AddReservation(ResDto resDto) throws Exception {
        return customerModel.AddReservation(resDto);
    }

    public String updateRes(ResDto resDto) throws Exception {
        return customerModel.updateRes(resDto);
    }

    public ResDto searchRes(String values) throws Exception {
        return customerModel.searchRes(values);
    }
      public String CancelRes(String ID) throws Exception {
        return customerModel.CancelRes(ID);
    }

}
