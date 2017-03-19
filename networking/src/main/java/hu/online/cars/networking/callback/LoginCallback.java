package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.ProfileResponseModel;

/**
 * Created by demdani on 2016. 10. 23..
 */

public interface LoginCallback extends BaseCallback {

    void forwardResponse(ProfileResponseModel profileResponseModel);
}
