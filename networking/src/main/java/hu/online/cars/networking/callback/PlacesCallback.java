package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.places.PlacesResponseModel;

/**
 * Created by demdani on 2016. 10. 18..
 */

public interface PlacesCallback extends BaseCallback {

    void forwardResponse(PlacesResponseModel responseModel);
}
