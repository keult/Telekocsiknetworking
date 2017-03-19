package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.cars.BrandsResponseModel;

/**
 * Created by demdani on 2016. 12. 03..
 */

public interface BrandsCallback extends BaseCallback {

    void forwardResponse(BrandsResponseModel brandsResponseModel);
}
