package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Utak lekérdezés adatszerkezete
 */
public class MyTripListDataResponseModel {

    private SessionResponseModel sessarray;
    private List<MyTripResponseModel> utjaim;
    private List<CarResponseModel> autoim;

    public SessionResponseModel getSessarray() {
        return sessarray;
    }

    public List<MyTripResponseModel> getUtjaim() {
        return utjaim;
    }

    public List<CarResponseModel> getAutoim() {
        return autoim;
    }

}
