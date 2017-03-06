package com.ride.testingform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ride.testingform.Adapter.RestService;
import com.ride.testingform.Extras.MultiSelectionSpinner;
import com.ride.testingform.Model.UserInfo;
import com.ride.testingform.Model.UserSchedule;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ScheduleForm extends AppCompatActivity {

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_form);
        MultiSelectionSpinner spiner = (MultiSelectionSpinner) findViewById(R.id.Days);
        String[] daysarray = getResources().getStringArray(R.array.days_list);
        spiner.setItems(daysarray);


        submitButton = (Button) findViewById(R.id.ButtonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                SaveData();
            }
        });
    }


    public void SaveData() {
        MultiSelectionSpinner spiner = (MultiSelectionSpinner) findViewById(R.id.Days);
        EditText fromstreet = (EditText) findViewById(R.id.FromStreet);
        EditText fromarea = (EditText) findViewById(R.id.FromArea);
        EditText fromtime = (EditText) findViewById(R.id.FromTime);
        EditText totime = (EditText) findViewById(R.id.ToTime);
        EditText tostreet = (EditText) findViewById(R.id.ToStreet);
        EditText toarea = (EditText) findViewById(R.id.ToArea);
        List<String> days = spiner.getSelectedStrings();

        UserSchedule userschedule = new UserSchedule();
        userschedule.setFromArea(fromarea.getText().toString());
        userschedule.setToArea(toarea.getText().toString());
        userschedule.setFromStreet(fromstreet.getText().toString());
        userschedule.setToStreet(tostreet.getText().toString());
        userschedule.setStartTime(fromtime.getText().toString());
        userschedule.setEndTime(totime.getText().toString());
        userschedule.setUserId(0);

        for (int i = 0; i < days.size(); i++) {
            userschedule.setDays(days.get(i).toString());
            SaveData(userschedule);
        }

    }


    public void SaveData(UserSchedule UserSchedule) {
        RestService restService = new RestService();

        if (UserSchedule.getId() == 0) {
            restService.getUserScheduleService().addUserSchedule(UserSchedule, new Callback<UserSchedule>() {
                @Override
                public void success(UserSchedule userSchedule, Response response) {
                    Toast.makeText(ScheduleForm.this, "Data inserted successfully", Toast.LENGTH_LONG).show();
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(ScheduleForm.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        } else {
            restService.getUserScheduleService().updateUserScheduleById(UserSchedule.getId(), UserSchedule, new Callback<UserSchedule>() {
                @Override
                public void success(UserSchedule UserSchedule, Response response) {
                    Toast.makeText(ScheduleForm.this, "userVehicle Record updated.", Toast.LENGTH_LONG).show();
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(ScheduleForm.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        }
    }
}
