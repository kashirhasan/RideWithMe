package com.ride.testingform.Adapter;

/**
 * Created by Kashir on 2/3/2017.
 */

public class RestService {
    private static final String URL = "http://103.31.80.102:2019/api/";
    private retrofit.RestAdapter restAdapter;
    /*private UserVehicleService apiService;
    private UserVehicleService apiService1;*/

    public RestService() {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();
    }

    public UserVehicleService getUserVehicleService() {
        return restAdapter.create(UserVehicleService.class);
    }

    public VehicleTypeService getVehicleTypeService() {
        return restAdapter.create(VehicleTypeService.class);
    }

    public UserInfoService getUserinfoService() {
        return restAdapter.create(UserInfoService.class);
    }

    public UserScheduleService getUserScheduleService() {
        return restAdapter.create(UserScheduleService.class);
    }
}
