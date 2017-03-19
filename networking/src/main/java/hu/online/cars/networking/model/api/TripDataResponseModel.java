package hu.online.cars.networking.model.api;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 24..
 */

public class TripDataResponseModel {

    private String utakszama;
    private List<TripResponseModel> utak;
    private PageResponseModel page;

    public String getUtakszama() {
        return utakszama;
    }

    public List<TripResponseModel> getUtak() {
        return utak;
    }

    public PageResponseModel getPage() {
        return page;
    }
}
