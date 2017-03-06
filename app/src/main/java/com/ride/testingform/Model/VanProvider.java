package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class VanProvider extends BaseModel {
    public String Name;
    public String MobileNo;
    public String Email;
    public String OfficeAddress;
    public String PhoneNo;
    public ArrayList<VanRoute> VanRoutes;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        OfficeAddress = officeAddress;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public ArrayList<VanRoute> getVanRoutes() {
        return VanRoutes;
    }

    public void setVanRoutes(ArrayList<VanRoute> vanRoutes) {
        VanRoutes = vanRoutes;
    }
}
