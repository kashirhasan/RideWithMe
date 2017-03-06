package com.ride.testingform.Model;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class VehicleType extends BaseModel {

    public int Id;
    public String Type;
    public int Maxpassengers;
    public ArrayList<UserVehicle> UserVehicles;

    public VehicleType(JSONObject object) {
        try {
            this.Id = object.getInt("Id");
            this.Maxpassengers = object.getInt("Maxpassengers");
            this.Active = object.getBoolean("Active");
            this.Type = object.getString("Type");
        } catch (JSONException e) {
            Log.i("Error", "Object Parsing");
        }
    }
}
