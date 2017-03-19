package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.JoinedTripListResponseModel;

/**
 * Created by KeulT on 2016.12.31..
 */

public interface JoinedTripListCallback extends BaseCallback {

    void forwardResponse(JoinedTripListResponseModel joinedTripListResponseModel);

}
