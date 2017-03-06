package com.ride.testingform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.search.SearchAuth;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.ride.testingform.Adapter.MainAdapter;
import com.ride.testingform.Adapter.RestService;
import com.ride.testingform.Helper.StringWithTag;
import com.ride.testingform.Model.UserSchedule;
import com.ride.testingform.Model.UserVehicle;
import com.ride.testingform.Model.VehicleType;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static android.R.attr.data;


public class uservehicle_form extends AppCompatActivity {

    Spinner vehicleTypeSpinner;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uservehicle_form);
        submit = (Button) findViewById(R.id.SubmitButton);
        CheckSpinnerData();
        //GetData(10);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Spinner spinnerVehicleTypeId = (Spinner) findViewById(R.id.VehicleTypeId);
                EditText vehicleColor = (EditText) findViewById(R.id.VehicleColor);
                EditText vehicleNumber = (EditText) findViewById(R.id.VehicleNumber);
                Spinner vehicleMaxPassenger = (Spinner) findViewById(R.id.VehicleMaxPassenger);
                StringWithTag vehicleTypeID = (StringWithTag) spinnerVehicleTypeId.getSelectedItem();


                UserVehicle userVehicle = new UserVehicle();
                userVehicle.setMaxPassenger(Integer.parseInt(vehicleMaxPassenger.getSelectedItem().toString()));
                userVehicle.setColor(vehicleColor.getText().toString());
                userVehicle.setVehicleNumber(vehicleNumber.getText().toString());
                userVehicle.setVehicleTypeId(vehicleTypeID.id);
                userVehicle.setUserId(2);
                userVehicle.setId(0);
                SaveData(userVehicle);
                Log.i("Error", vehicleTypeID.id.toString() + vehicleTypeID.tag.toString());


            }
        });

        final Spinner spinner = (Spinner) findViewById(R.id.VehicleTypeId);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                StringWithTag selectedValue = (StringWithTag) spinner.getSelectedItem();

                ArrayList<String> listItems = new ArrayList<String>();
                for (int i = 1; i <= selectedValue.tag; i++) {
                    listItems.add(Integer.toString(i));
                }
                Spinner maxPassengerSpinner = (Spinner) findViewById(R.id.VehicleMaxPassenger);
                ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(uservehicle_form.this, android.R.layout.simple_spinner_dropdown_item, listItems);
                spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                maxPassengerSpinner.setAdapter(spinnerAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }

        });

    }

    public void CheckSpinnerData() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = sharedPreferences.getString(getResources().getString(R.string.Shared_VehicleType), "");
        if (value != null && value != "") {
            PopulateSpinner(value);
        } else {
            GetDataType(0);
        }
    }

    public void SaveSharedPreferenceData(String Data) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(getResources().getString(R.string.Shared_VehicleType), Data);
        editor.commit();
        PopulateSpinner(Data);
    }

    public void PopulateSpinner(String Data) {

        if (Data != "" && Data != null) {
            vehicleTypeSpinner = (Spinner) findViewById(R.id.VehicleTypeId);
            Gson gson = new Gson();

            Type listType = new TypeToken<List<VehicleType>>() {
            }.getType();
            final ArrayList<VehicleType> vehicleTypes = (ArrayList) gson.fromJson(Data.toString(), listType);

            List<StringWithTag> itemList = new ArrayList<StringWithTag>();
            for (final VehicleType vehicle : vehicleTypes) {

                itemList.add(new StringWithTag(vehicle.Type, vehicle.Id, vehicle.Maxpassengers));
            }

            ArrayAdapter<StringWithTag> spinnerAdapter = new ArrayAdapter<StringWithTag>(this, android.R.layout.simple_spinner_item, itemList);
            spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            vehicleTypeSpinner.setAdapter(spinnerAdapter);
        } else {
            Toast.makeText(getApplicationContext(), "Data could not be fetched", Toast.LENGTH_SHORT).show();
        }

    }

    //Send id to Retrieve Single Object
    //Send id="" to retrieve all data
    public void FetchedData(String id) {
        RequestParams params = new RequestParams();

        MainAdapter.get("vehicletypes/" + id, params, new JsonHttpResponseHandler() {

                    //For Single Object Retrieval
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        Gson gson = new Gson();
                        VehicleType vehicleType = gson.fromJson(response.toString(), VehicleType.class);
                    }

                    //For all Data Retreival
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                        SaveSharedPreferenceData(response.toString());
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                        super.onFailure(statusCode, headers, throwable, errorResponse);
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                        super.onFailure(statusCode, headers, throwable, errorResponse);
                    }
                }
        );

    }


    public void SaveData(UserVehicle uservehicle) {
        RestService restService = new RestService();

        if (uservehicle.getId() == 0) {
            restService.getUserVehicleService().addUserVehicle(uservehicle, new Callback<UserVehicle>() {
                @Override
                public void success(UserVehicle uservehicle, Response response) {
                    Toast.makeText(uservehicle_form.this, "USer Vehicle Inserted.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(uservehicle_form.this, ScheduleForm.class);
                    startActivity(intent);
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        } else {
            restService.getUserVehicleService().updateUserVehicleById(uservehicle.getId(), uservehicle, new Callback<UserVehicle>() {
                @Override
                public void success(UserVehicle userVehicle, Response response) {
                    Toast.makeText(uservehicle_form.this, "userVehicle Record updated.", Toast.LENGTH_LONG).show();
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        }
    }

    public void GetData(Integer id) {
        RestService restService = new RestService();
        if (id > 0) {
            restService.getUserVehicleService().getUserVehicleById(id, new Callback<UserVehicle>() {
                @Override
                public void success(UserVehicle uservehicle, Response response) {
                    Gson gson = new Gson();
                    SaveSharedPreferenceData(gson.toJson(uservehicle));
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        }
        restService.getUserVehicleService().getUserVehicle(new Callback<List<UserVehicle>>() {
            @Override
            public void success(List<UserVehicle> uservehicle, Response response) {
          /*      Gson gson = new Gson();
                SaveSharedPreferenceData(gson.toJson(uservehicle));*/
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

    public void GetDataType(Integer id) {
        RestService restService = new RestService();
        if (id > 0) {
            restService.getVehicleTypeService().getVehicleTypeById(id, new Callback<VehicleType>() {
                @Override
                public void success(VehicleType VehicleType, Response response) {
                    Gson gson = new Gson();
                    SaveSharedPreferenceData(gson.toJson(VehicleType));
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                }
            });
        } else {
            restService.getVehicleTypeService().getVehicleType(new Callback<List<VehicleType>>() {
                @Override
                public void success(List<VehicleType> VehicleType, Response response) {
                    Gson gson = new Gson();
                    SaveSharedPreferenceData(gson.toJson(VehicleType));
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(uservehicle_form.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }

/*
    public void SaveData(UserVehicle uservehicle) {
        Gson gson = new Gson();
        String userVehicleJson = gson.toJson(uservehicle);
        RequestParams params = new RequestParams();
        params.add("UserVehicle/", userVehicleJson.toString());

        MainAdapter.post("UserVehicles/", params, new JsonHttpResponseHandler() {

                    //For Single Object Retrieval
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        Toast.makeText(uservehicle_form.this, "Inserted Successfully",
                                Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                        if(statusCode == 404){
                            Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
                        }
                        // When Http response code is '500'
                        else if(statusCode == 500){
                            Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
                            Log.i("Error",errorResponse.toString());
                        }
                        // When Http response code other than 404, 500
                        else{
                            Toast.makeText(getApplicationContext(), Integer.toString(statusCode) +" Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                            Log.i("Error",errorResponse.toString());
                        }
                        super.onFailure(statusCode, headers, throwable, errorResponse);
                    }

                }
        );
    }*/

}


