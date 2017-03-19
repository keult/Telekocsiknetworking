package hu.online.cars.networking.model.api.geo;

import hu.online.cars.networking.model.api.BaseResponseModel;

/**
 * Created by demdani on 2016. 12. 01..
 */

public class NearCarsResponseModel extends BaseResponseModel {

    private NearCarDataResponseModel data;

    public NearCarDataResponseModel getData() {
        return data;
    }
}
