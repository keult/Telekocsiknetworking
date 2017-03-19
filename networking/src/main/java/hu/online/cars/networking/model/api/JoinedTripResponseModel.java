package hu.online.cars.networking.model.api;

/**
 * Created by demdani on 2016. 10. 25..
 */

public class JoinedTripResponseModel extends TripResponseModel {

    protected String active;
    protected String lRendszam;
    protected String lTipus;


    public String getActive() {
        return active;
    }

    public String getlRendszam() {
        return lRendszam;
    }

    public String getlTipus() {
        return lTipus;
    }
}
