package com.ride.testingform;

import android.os.Bundle;
import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ride.testingform.Model.UserInfo;

import java.util.ArrayList;


public class UserInformatio extends Activity {

    ArrayList<UserInfo> User = new ArrayList<UserInfo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }

}
