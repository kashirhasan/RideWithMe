package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class VanType extends BaseModel {
    public String VehicleType;
    public String AirCondition;
    public ArrayList<VanRoute> VanRoutes;

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getAirCondition() {
        return AirCondition;
    }

    public void setAirCondition(String airCondition) {
        AirCondition = airCondition;
    }

    public ArrayList<VanRoute> getVanRoutes() {
        return VanRoutes;
    }

    public void setVanRoutes(ArrayList<VanRoute> vanRoutes) {
        VanRoutes = vanRoutes;
    }
}
