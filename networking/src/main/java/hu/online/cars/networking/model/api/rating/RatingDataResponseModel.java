package hu.online.cars.networking.model.api.rating;

import java.util.List;

import hu.online.cars.networking.model.api.SessionResponseModel;

/**
 * Created by demdani on 2016. 12. 02..
 */

public class RatingDataResponseModel {

    private SessionResponseModel sessarray;
    private Integer feedbackRequestnum;
    private List<Rating> ertekelesek;

    public SessionResponseModel getSessarray() {
        return sessarray;
    }

    public Integer getFeedbackRequestnum() {
        return feedbackRequestnum;
    }

    public List<Rating> getErtekelesek() {
        return ertekelesek;
    }
}
