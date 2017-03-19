package hu.online.cars.networking.model.api.cars;

import hu.online.cars.networking.model.api.BaseResponseModel;

/**
 * Created by demdani on 2016. 12. 03..
 */

public class BrandsResponseModel extends BaseResponseModel {

    private BrandsDataResponseModel data;

    public BrandsDataResponseModel getData() {
        return data;
    }
}
