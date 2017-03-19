package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.JoinResponseModel;

/**
 * Created by demdani on 2016. 10. 24..
 */

public interface JoinCallback extends BaseCallback {

    void forwardResponse(JoinResponseModel joinResponseModel);
}
