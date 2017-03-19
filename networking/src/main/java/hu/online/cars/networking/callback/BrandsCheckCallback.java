package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.cars.BrandsCheckResponseModel;

/**
 * Created by demdani on 2016. 12. 02..
 */

public interface BrandsCheckCallback extends BaseCallback {

    void forwardResponse(BrandsCheckResponseModel brandsCheckResponseModel);
}
