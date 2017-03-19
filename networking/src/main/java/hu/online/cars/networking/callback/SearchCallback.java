package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.TripSearchResponseModel;

/**
 * Created by demdani on 2016. 10. 24..
 */

public interface SearchCallback extends BaseCallback {

    void forwardResponse(TripSearchResponseModel tripSearchResponseModel);
}
