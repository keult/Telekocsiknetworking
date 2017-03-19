package hu.online.cars.networking.model.places;

import java.util.List;

/**
 * Created by demdani on 2016. 10. 11..
 */

public class PlacesResponseModel {

    private List<PlacesItemResponseModel> predictions;

    public List<PlacesItemResponseModel> getPredictions() {
        return predictions;
    }
}
