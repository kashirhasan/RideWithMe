package com.ride.testingform.Model;

/**
 * Created by Admin on 1/30/2017.
 */

public class RideDetails extends BaseModel {
    public String Status;
    public String RiderReview;
    public boolean RiderArrivalTime;
    public String PassengerReview;
    public boolean RiderArrived;
    public boolean PassengerArrived;
    public String CompletionTime;
    public PassengerSchedule PassengerSchedules;
    public RideSchedule RideSchedules;

    public RideSchedule getRideSchedules() {
        return RideSchedules;
    }

    public void setRideSchedules(RideSchedule rideSchedules) {
        RideSchedules = rideSchedules;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRiderReview() {
        return RiderReview;
    }

    public void setRiderReview(String riderReview) {
        RiderReview = riderReview;
    }

    public boolean isRiderArrivalTime() {
        return RiderArrivalTime;
    }

    public void setRiderArrivalTime(boolean riderArrivalTime) {
        RiderArrivalTime = riderArrivalTime;
    }

    public String getPassengerReview() {
        return PassengerReview;
    }

    public void setPassengerReview(String passengerReview) {
        PassengerReview = passengerReview;
    }

    public boolean isRiderArrived() {
        return RiderArrived;
    }

    public void setRiderArrived(boolean riderArrived) {
        RiderArrived = riderArrived;
    }

    public boolean isPassengerArrived() {
        return PassengerArrived;
    }

    public void setPassengerArrived(boolean passengerArrived) {
        PassengerArrived = passengerArrived;
    }

    public String getCompletionTime() {
        return CompletionTime;
    }

    public void setCompletionTime(String completionTime) {
        CompletionTime = completionTime;
    }

    public PassengerSchedule getPassengerSchedules() {
        return PassengerSchedules;
    }

    public void setPassengerSchedules(PassengerSchedule passengerSchedules) {
        PassengerSchedules = passengerSchedules;
    }
}
