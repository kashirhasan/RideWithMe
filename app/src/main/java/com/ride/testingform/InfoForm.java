package com.ride.testingform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ride.testingform.Adapter.RestService;
import com.ride.testingform.Model.UserInfo;
import com.ride.testingform.Model.UserVehicle;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class InfoForm extends AppCompatActivity {

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_form);

        submitButton = (Button) findViewById(R.id.ButtonSubmitForm);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                SaveData();
            }
        });
    }

    public void SaveData() {
        EditText nameTextBox = (EditText) findViewById(R.id.NameText);
        EditText emailTextBox = (EditText) findViewById(R.id.EmailText);
        EditText addressTextBox = (EditText) findViewById(R.id.AddressText);
        EditText cnicTextBox = (EditText) findViewById(R.id.CnicText);
        EditText mobileNoTextBox = (EditText) findViewById(R.id.MobileNoText);
        EditText areaTextBox = (EditText) findViewById(R.id.AreaText);
        EditText officeBuildingTextBox = (EditText) findViewById(R.id.OfficeBuildingText);
        EditText officeStreetTextBox = (EditText) findViewById(R.id.OfficeStreetText);
        EditText officeAreaTextBox = (EditText) findViewById(R.id.OfficeAreaText);

        UserInfo userInfo = new UserInfo();
        userInfo.setId(0);
        userInfo.setName(nameTextBox.getText().toString());
        userInfo.setEmail(emailTextBox.getText().toString());
        userInfo.setCNIC(cnicTextBox.getText().toString());
        userInfo.setMobileNumber(mobileNoTextBox.getText().toString());
        userInfo.setOfficeArea(officeAreaTextBox.getText().toString());
        userInfo.setOfficeBuilding(officeBuildingTextBox.getText().toString());
        userInfo.setOfficeStreet(officeStreetTextBox.getText().toString());
        userInfo.setAddress(addressTextBox.getText().toString());

        RadioGroup radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioSexButton = (RadioButton) findViewById(selectedId);
        userInfo.setGender(radioSexButton.getText().toString());
        SaveData(userInfo);

    }


    public void SaveData(UserInfo userinfo) {
        RestService restService = new RestService();

        if (userinfo.getId() == 0) {
            restService.getUserinfoService().addUserInfo(userinfo, new Callback<UserInfo>() {
                @Override
                public void success(UserInfo userinfo, Response response) {
                    Toast.makeText(InfoForm.this, "Data inserted successfully", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(InfoForm.this, uservehicle_form.class);
                    startActivity(intent);
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(InfoForm.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        } else {
            restService.getUserinfoService().updateUserInfoById(userinfo.getId(), userinfo, new Callback<UserInfo>() {
                @Override
                public void success(UserInfo userinfo, Response response) {
                    Toast.makeText(InfoForm.this, "userVehicle Record updated.", Toast.LENGTH_LONG).show();
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(InfoForm.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        }
    }

    /**
     * Created by Kashir on 1/31/2017.
     */


}
