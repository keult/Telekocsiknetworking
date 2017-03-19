package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.MyTripListResponseModel;

/**
 * Utak lekérdezésének Callback függvénye
 */

public interface MyTripListCallback extends BaseCallback {

    void forwardResponse(MyTripListResponseModel profileResponseModel);
}