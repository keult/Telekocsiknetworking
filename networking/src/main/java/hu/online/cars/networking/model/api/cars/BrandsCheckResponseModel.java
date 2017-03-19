package hu.online.cars.networking.model.api.cars;

import hu.online.cars.networking.model.api.BaseResponseModel;

/**
 * Created by demdani on 2016. 12. 02..
 */

public class BrandsCheckResponseModel extends BaseResponseModel {

    private BrandsCheckDataResponseModel data;

    public BrandsCheckDataResponseModel getData() {
        return data;
    }
}
