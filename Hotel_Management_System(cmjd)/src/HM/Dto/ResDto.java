/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HM.Dto;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class ResDto {
    private int CustID;
    private String CustName;
    private String R_Type;
    private String Package;
    private int Amount;
    private String Time;

    /**
     * @return the CustID
     */
    public int getCustID() {
        return CustID;      
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(int CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * @param CustName the CustName to set
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * @return the R_Type
     */
    public String getR_Type() {
        return R_Type;
    }

    /**
     * @param R_Type the R_Type to set
     */
    public void setR_Type(String R_Type) {
        this.R_Type = R_Type;
    }

    /**
     * @return the Package
     */
    public String getPackage() {
        return Package;
    }

    /**
     * @param Package the Package to set
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * @return the Amount
     */
    public int getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
      public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    @Override
    public String toString() {
        return "ResDto{" + "CustID=" + CustID + ", CustName=" + CustName + ", R_Type=" + R_Type + ", Package=" + Package + ", Amount=" + Amount + ", Time=" + Time + '}';
    }
    
    
    
}
