package hu.online.cars.networking.error.factory;

import hu.online.cars.networking.error.NetworkError;
import retrofit2.adapter.rxjava.HttpException;

/**
 * Created by demdani on 2016. 10. 18..
 */

public class ErrorFactory {

    public static NetworkError createNetworkError(Throwable throwable) {
        Integer httpResponseCode = throwable instanceof HttpException ?
                ((HttpException)throwable).code() : null;
        return new NetworkError(throwable, httpResponseCode);
    }
}
