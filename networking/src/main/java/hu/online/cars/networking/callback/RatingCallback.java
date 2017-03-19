package hu.online.cars.networking.callback;

import hu.online.cars.networking.model.api.rating.RatingResponseModel;

/**
 * Created by demdani on 2016. 12. 02..
 */

public interface RatingCallback extends BaseCallback {

    void forwardResponse(RatingResponseModel ratingResponseModel);
}
