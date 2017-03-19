package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.BaseResponseModel;

/**
 * Created by demdani on 2016. 10. 24..
 */

public interface DefaultCallback extends BaseCallback {

    void forwardResponse(BaseResponseModel baseResponseModel);
}
