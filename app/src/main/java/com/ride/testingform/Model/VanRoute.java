package com.ride.testingform.Model;

/**
 * Created by Admin on 1/30/2017.
 */

public class VanRoute extends BaseModel {
    public String From;
    public String To;
    public String Gender;
    public int Charges;
    public String Shift;
    public String Lat;
    public String Lon;
    public VanProvider VanProviders;
    public VanType VanTypes;

    public String getLon() {
        return Lon;
    }

    public void setLon(String lon) {
        Lon = lon;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getCharges() {
        return Charges;
    }

    public void setCharges(int charges) {
        Charges = charges;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public VanProvider getVanProviders() {
        return VanProviders;
    }

    public void setVanProviders(VanProvider vanProviders) {
        VanProviders = vanProviders;
    }

    public VanType getVanTypes() {
        return VanTypes;
    }

    public void setVanTypes(VanType vanTypes) {
        VanTypes = vanTypes;
    }
}
