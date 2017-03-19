package hu.online.cars.networking.model.api.rating;

import hu.online.cars.networking.model.api.BaseResponseModel;

/**
 * Created by demdani on 2016. 12. 02..
 */

public class RatingResponseModel extends BaseResponseModel {

    private RatingDataResponseModel data;

    public RatingDataResponseModel getData() {
        return data;
    }
}
