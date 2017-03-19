package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.MyCarsResponseModel;

/**
 * Created by demdani on 2016. 10. 26..
 */

public interface CarCallback extends BaseCallback {

    void forwardResponse(MyCarsResponseModel myCarsResponseModel);
}
