package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 26..
 */

public class CarDataResponseModel {

    private SessionResponseModel sessarray;
    private List<CarResponseModel> autoim;

    public SessionResponseModel getSessarray() {
        return sessarray;
    }

    public List<CarResponseModel> getAutoim() {
        return autoim;
    }
}
