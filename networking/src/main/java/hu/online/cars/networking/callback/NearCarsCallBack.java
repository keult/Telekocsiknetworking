package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.geo.NearCarsResponseModel;

/**
 * Created by demdani on 2016. 12. 01..
 */

public interface NearCarsCallBack extends BaseCallback {

    void forwardResponse(NearCarsResponseModel nearCarsResponseModel);
}
