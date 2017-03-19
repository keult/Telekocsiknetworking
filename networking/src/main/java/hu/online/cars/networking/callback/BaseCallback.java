package hu.online.cars.networking.callback;

import hu.online.cars.networking.error.NetworkError;

/**
 * Created by demdani on 2016. 10. 18..
 */

public interface BaseCallback {

    void forwardError(NetworkError networkError);
}
